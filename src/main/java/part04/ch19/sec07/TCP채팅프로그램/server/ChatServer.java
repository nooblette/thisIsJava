package part04.ch19.sec07.TCP채팅프로그램.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collections;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.json.JSONObject;

public class ChatServer {
	public static void main(String[] args) throws IOException {
		ChatServer chatServer = new ChatServer();

		// TCP 채팅 서버 시작
		chatServer.start();

		System.out.println("-----------------------------------------------");
		System.out.println("서버를 종료하려면 q 또는 Q를 입력하고 Enter 키를 입력하세요.");
		System.out.println("-----------------------------------------------");

		// 키보드 입력
		Scanner scanner = new Scanner(System.in);
		while(true){
			String key = scanner.nextLine();
			if(key.equalsIgnoreCase("q")){
				break;
			}
		}
		scanner.close();

		// TCP 채팅 서버 종료
		chatServer.stop();
	}
	ServerSocket serverSocket;
	// 채팅 서버 프로그램은 스레드풀(ExecutorService)을 통해 100개의 작업 쓰레드를 갖는 멀티 쓰레드 환경으로 구축한다.
	ExecutorService threadPool = Executors.newFixedThreadPool(100);

	// 멀티쓰레드 환경을 지원하는 동기화된 Map 컬렉션 객체 생성
	Map<String, SocketClient> chatRoom = Collections.synchronizedMap(new HashMap<>());

	// TCP 채팅 서버 시작
	public void start() throws IOException{
		serverSocket = new ServerSocket(50001); // 50001번 port 바인딩
		System.out.println("[서버] 시작\n");

		// 각 작업스레드가 처리할 작업(Runnable)을 작성
		Thread thread = new Thread(() -> {
			try{
				while (true){
					// accept() 메서드를 호출하여 클라이언트의 요청이 들어올때까지 대기(blocking)
					// 클라이언트의 요청을 받으면 blocking에서 깨어나 통신을 위한 Socket 객체를 반환한다.
					Socket socket = serverSocket.accept();

					// 통신용 SocketClient 클래스를 반환, SocketClient 클래스가 멀티 쓰레드 환경에서 클라이언트와 1:1 통신(작업 처리)을 담당
					// 연결을 요청한 클라이언트의 정보와 해당 클라이언트와 통신하기 위한 socketClient 객체는 SocketClient 클래스의 생성자에서 처리된다.
					new SocketClient(this, socket);
				}
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		});

		thread.start();
	}

	// 클라이언트 연결 시 SocketClient 생성 및 추가
	public void addSocketClient(SocketClient socketClient) {
		String key = socketClient.getChatName() + "@" + socketClient.getClientIp();
		chatRoom.put(key, socketClient);
		System.out.println("채팅방 입장 : " + key);
		System.out.println("현재 채팅자 수 : " + chatRoom.size() + "\n");

	}

	// 클라이언트 연결 종료시 SocketClient 제거
	public void removeSocketClient(SocketClient socketClient){
		String key = socketClient.getChatName() + "@" + socketClient.getClientIp();
		chatRoom.remove(key);
		System.out.println("채팅방 나감 : " + key);
		System.out.println("현재 채팅자 수 : " + chatRoom.size() + "\n");

	}

	// 본인을 제외한 모든 SocketClient에게 메시지 전송
	public void sendToAll(SocketClient sender, String message){
		JSONObject root = new JSONObject();
		root.put("clientIp", sender.getClientIp());
		root.put("chatName", sender.getChatName());
		root.put("message", message);
		String jsonValue = root.toString();

		// 필터링 후 메시지 전송
		chatRoom.values().stream()
			.filter(socketClient -> socketClient != sender)
			.forEach(socketClient -> socketClient.send(jsonValue));
	}

	// 서버 종료
	public void stop(){
		try{
			serverSocket.close();
			threadPool.shutdown();
			chatRoom.values()
				.forEach(SocketClient::close);
			System.out.println("[서버] 종료\n");
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}
