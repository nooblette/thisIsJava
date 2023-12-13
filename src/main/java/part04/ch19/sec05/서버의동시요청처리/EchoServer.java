package part04.ch19.sec05.서버의동시요청처리;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class EchoServer {
	private static ServerSocket serverSocket;

	// 10개의 스레드로 작업 요청을 처리하는 스레드풀 생성
	private static ExecutorService executorService = Executors.newFixedThreadPool(10);

	public static void main(String[] args) {
		System.out.println("-----------------------------------------------");
		System.out.println("서버를 종료하려면 q 또는 Q를 입력하고 Enter 키를 입력하세요.");
		System.out.println("-----------------------------------------------");

		// TCP 서버 시작
		startServer();

		// 키보드 입력
		Scanner scanner = new Scanner(System.in);
		while (true) {
			String key = scanner.nextLine();
			if (key.equalsIgnoreCase("q")) {
				break;
			}
		}
		scanner.close();

		// TCP 서버 종료
		stopServer();
	}

	private static void startServer(){
		// 작업 스레드 정의(멀티 스레드 환경 구축), 작업 스레드는 Thread 클래스의 익명 구현 객체로 정의한다.
		Thread thread = new Thread(){
			@Override
			public void run(){
				try{
					// ServerSocket 생성 및 port 바인딩
					serverSocket = new ServerSocket(50001);
					System.out.println("[서버] 시작\n");

					// 연결 수락 및 데이터 통신
					while(true){
						// 클라이언트의 요청을 대기하며 blocking
						// 클라이언트의 요청을 받으면 blocking에서 깨어나 Socket 객체를 반환한다.
						Socket socket = serverSocket.accept();

						// 스레드풀의 execute() 메서드를 호출하여 서버가 요청받은 작업을 스레드풀 작업 큐에 넣는다.
						// 이때 execute() 메서드의 매개변수인 Runnable 인터페이스는 함수형 인터페이스(하나의 추상 클래스를 갖는 인터페이스)이므로 처리 작업은 람다식으로 표현할 수 있다.
						executorService.execute(() -> {
							// 연결된 클라이언트의 정보 얻기
							InetSocketAddress inetSocketAddress = (InetSocketAddress) socket.getRemoteSocketAddress();
							String clientIp = inetSocketAddress.getHostName();
							int clientPort = inetSocketAddress.getPort();
							System.out.println("[서버] " + clientIp + ":" + clientPort + "의 연결 요청을 수락함");

							// InputStream 클래스로 데이터 수신
							try {
								// socket 객체의 getInputStream() 메서드를 호출하여 클라이언트가 전송한 데이터를 전달 받는다.
								// DataInputStream 클래스의 readUTF() 메서드를 호출하여 전송받은 데이터를 문자열로 반환한다.
								DataInputStream inputStream = new DataInputStream((socket.getInputStream()));
								String message = inputStream.readUTF();

								// DataOutputStream 클래스의 writeUTF() 메서드를 호출하여 데이터를 문자열 형식으로 클라이언트에 송신한다.
								DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
								dataOutputStream.writeUTF(message);
								dataOutputStream.flush();
								System.out.println("[서버] 전송받은 데이터를 echo : " + message);

								// TCP 연결해제
								socket.close();
								System.out.println("[서버] " + clientIp + ":" + clientPort + "와의 연결을 끊음");
							} catch (IOException e) {
								throw new RuntimeException(e);
							}
						});
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		};

		// 스레드 시작
		thread.start();
	}

	private static void stopServer(){
		try {
			// ServerSocket을 닫고 port를 언바인딩
			serverSocket.close();

			// 스레드풀 종료
			executorService.shutdownNow();
		} catch (IOException e){
			e.printStackTrace();
		}

	}

}
