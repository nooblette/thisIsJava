package part04.ch19.sec03.TCP네트워킹;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

import lombok.Data;

public class EchoServer {
	private static ServerSocket serverSocket;

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

	private static void startServer() {
		// 작업 스레드 정의
		Thread thread = new Thread(){
			@Override
			public void run(){
				try {
					// ServerSocket 생성 및 50001 port 바인딩
					serverSocket = new ServerSocket(50001);
					System.out.println("[서버] 시작");

					// 클라이언트와 연결 및 데이터 통신
					while(true){
						System.out.println("\n[서버] 연결 요청 대기\n");

						// 클라이언트로부터 연결을 대기하면서 blocking, 연결이 성사되면 전송용 socket 객체를 반환한다.
						Socket socket = serverSocket.accept();

						// 연결된 클라이언트의 ip 주소와 port 번호 조회
						InetSocketAddress inetSocketAddress = (InetSocketAddress) socket.getRemoteSocketAddress();
						String clientIp = inetSocketAddress.getHostName();
						int clientPort = inetSocketAddress.getPort();
						System.out.println("[서버] " + clientIp + ":" + clientPort + "의 연결 요청을 수락");

						/* 데이터 받기 */
						// InputStream 입력 스트림으로 데이터 수신
						// InputStream inputStream = socket.getInputStream();
						// byte[] bytes = new byte[1024];
						// int readByteCount = inputStream.read(bytes);
						// String message = new String(bytes, 0, readByteCount, StandardCharsets.UTF_8);

						// DataInputStream 보조 스트림으로 데이터 수신
						DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
						String message = dataInputStream.readUTF();
						System.out.println("[서버] 메시지 '" + message +"' 수신");

						/* 데이터 보내기 */
						// OutputStream 출력 스트림으로 데이터 송신
						// OutputStream outputStream = socket.getOutputStream();
						// bytes = message.getBytes(StandardCharsets.UTF_8);
						// outputStream.write(bytes);
						// outputStream.flush();

						// DataOutputStream 보조 스트림으로 데이터 송신
						DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
						dataOutputStream.writeUTF(message);
						dataOutputStream.flush();

						System.out.println("[서버] 받은 메시지를 다시 보냄");
						// 클라이언트와 연결 해제
						socket.close();
						System.out.println("[서버] " + clientIp + ":" + clientPort + "의 연결 해제");
					}
				} catch (IOException e){
					System.out.println("[서버] " + e.getMessage());
				}
			}
		};

		// 스레드 시작
		thread.start();
	}

	private static void stopServer() {
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
