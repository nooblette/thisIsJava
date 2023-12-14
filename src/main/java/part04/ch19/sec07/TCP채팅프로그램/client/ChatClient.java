package part04.ch19.sec07.TCP채팅프로그램.client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

import org.json.JSONObject;

public class ChatClient {
	public static void main(String[] args) {
		try {
			ChatClient chatClient = new ChatClient();
			chatClient.connect(); // 채팅 서버에 연결 요청

			Scanner scanner = new Scanner(System.in); // 키보드로부터 입력 받기
			System.out.print("대화명 입력 : ");
			chatClient.chatName = scanner.nextLine();

			// 서버로 전송할 메시지 세팅
			JSONObject jsonObject = new JSONObject();
			jsonObject.put("command", "incoming");
			jsonObject.put("data", chatClient.chatName);
			String json = jsonObject.toString();

			// 채팅 서버로 메시지 전송
			chatClient.send(json);

			// 채팅 서버로부터 메시지 수진
			chatClient.receive();

			System.out.println("-----------------------------------------------");
			System.out.println("보낼 메시지를 입력하고 Enter 키를 입력하세요.");
			System.out.println("채팅 종료하려면 q 또는 Q를 입력하고 Enter 키를 입력하세요.");
			System.out.println("-----------------------------------------------");
			while (true) {
				String message = scanner.nextLine();
				if("q".equalsIgnoreCase(message)){
					break;
				} else {
					jsonObject = new JSONObject();
					jsonObject.put("command", "message");
					jsonObject.put("data", message);
					json = jsonObject.toString();
					chatClient.send(json);
				}
			}
			scanner.close();

			// 채팅 서버와 연결 종료
			chatClient.disconnect();

		} catch (IOException e){
			System.out.println("[클라이언트] 서버 접속 불가");
		}

	}
	private Socket socket;
	private DataInputStream dataInputStream;
	private DataOutputStream dataOutputStream;
	private String chatName;

	// 서버 연결
	public void connect() throws IOException {
		// localhost:50001 서버에 연결 요청
		socket = new Socket("localhost", 50001); // 다른 PC의 채팅 서버와 연결하고 싶다면 그 PC의 IP 주소를 직접 기입
		dataInputStream = new DataInputStream(socket.getInputStream());
		dataOutputStream = new DataOutputStream(socket.getOutputStream());
		System.out.println("[클라이언트] 서버에 연결 완료");
	}

	// 서버로부터 메시지를 JSON 형태로 수진
	public void receive(){
		// 클라이언트가 메시지를 수신받고 처리할 작업을 정의
		Thread thread = new Thread(() -> {
			try {
				while(true) {
					// 보조 문자열 입력 스트림으로부터 서버가 보낸 문자열을 수신
					String json = dataInputStream.readUTF();

					// 다른 클라이언트가 보낸 메시지가 서버를 거쳐서 해당 클라이언트에게 수신
					JSONObject root = new JSONObject(json);
					String clientIp = root.getString("clientIp");
					String chatName = root.getString("chatName");
					String message = root.getString("message");
					System.out.println("<" + chatName + "@" + clientIp + ">" + message);
				}
			} catch (Exception e){
				System.out.println("[클라이언트] 서버와 연결 끊김");
				System.exit(0); // 클라이언트 프로세스 종료
			}
		});

		thread.start();
	}

	// JSON 형태로 서버에 메시지 전송
	public void send(String json) throws IOException {
		dataOutputStream.writeUTF(json);
		dataOutputStream.flush(); // 출력버퍼에 잔여하고 있는 바이트들을 모두 출력 스트림으로 방출
	}

	// 서버와 연결 종료
	public void disconnect() throws IOException {
		socket.close();
	}
}
