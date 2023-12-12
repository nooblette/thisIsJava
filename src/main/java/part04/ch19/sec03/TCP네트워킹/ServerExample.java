package part04.ch19.sec03.TCP네트워킹;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerExample {
	private static ServerSocket serverSocket;

	public static void main(String[] args) {
		System.out.println("-----------------------------------------------");
		System.out.println("서버를 종료하려면 q 또는 Q를 입력하고 Enter 키를 입력하세요.");
		System.out.println("-----------------------------------------------");

		// TCP 서버 시작
		startServer();

		// 키보드 입력
		Scanner scanner = new Scanner(System.in);
		while(true){
			String key = scanner.nextLine();
			if(key.equalsIgnoreCase("q")){
				break;
			}
		}
		scanner.close();

		// TCP 서버 종료
		stopServer();
	}

	private static void startServer() {
		// 작업 스레드 정의
		Thread thread = new Thread(){
			@Override
			public void run(){
				try {
					// ServerSocket 생성 및 50001 포트 바인딩
					ServerSocket serverSocket = new ServerSocket(50001);
					System.out.println("[서버] 시작");

					while(true){
						System.out.println("\n[서버] 연결 요청 대기\n");
						// 클라이언트의 연결 요청을 대기하면서 blocking, 클라이언트와 연결되면 accept() 메서드는 통신용 Sockeet 객체를 반환한다.
						Socket socket = serverSocket.accept();

						// 연결된 클라이언트의 ip 주소와 port 번호 얻기
						InetSocketAddress inetSocketAddress = (InetSocketAddress) socket.getRemoteSocketAddress();
						String clientIp = inetSocketAddress.getHostName();
						int clientPort = inetSocketAddress.getPort();
						System.out.println("[서버] " + clientIp + ":" + clientPort + "의 연결 요청을 수락");

						// 클라이언트와 연결 해제
						socket.close();
						System.out.println("[서버] " + clientIp + ":" + clientPort + "의 연결 해제");
					}
				} catch (IOException e){
					System.out.println("[서버] " + e.getMessage());
				}
			}
		};

		// 서버 스레드 실행
		thread.start();

	}

	private static void stopServer(){
		// ServerSocket을 닫고 사용중인 port 언바인딩
		try {
			if(serverSocket == null) {
				return;
			}

			serverSocket.close();
		} catch (IOException e){
			System.out.println("[서버] " + e.getMessage());
		} finally {
			System.out.println("[서버] 종료됨");
		}
	}
}
