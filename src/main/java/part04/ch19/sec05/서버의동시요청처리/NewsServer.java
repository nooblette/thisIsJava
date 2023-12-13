package part04.ch19.sec05.서버의동시요청처리;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class NewsServer {
	private static DatagramSocket datagramSocket;

	// 10개의 스레드로 작업 요청을 처리하는 스레드풀(ExecutorService) 생성
	private static ExecutorService executorService = Executors.newFixedThreadPool(10);

	public static void main(String[] args) {
		System.out.println("-----------------------------------------------");
		System.out.println("서버를 종료하려면 q 또는 Q를 입력하고 Enter 키를 입력하세요.");
		System.out.println("-----------------------------------------------");

		// UDP 서버 시작
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

	private static void startServer(){
		// 작업 스레드 정의, 이때 작업 스레드는 익명 구현 객체로 정의한다.
		Thread thread = new Thread(){
			@Override
			public void run(){
				try{
					// DatagramSocket 생성 및 Port 바인딩
					datagramSocket = new DatagramSocket(50001);
					System.out.println("[서버] 시작\n");

					while(true){
						// 클라이언트로부터 수신받은 데이터는 byte[] receiveBuffer 배열에 저장된다.
						byte[] receiveBytes = new byte[1024];
						DatagramPacket receivePacket = new DatagramPacket(receiveBytes, receiveBytes.length);

						// 클라이언트가 구독하고 싶은 뉴스 종류 수신
						datagramSocket.receive(receivePacket);

						// 스레드풀의 execute() 메서드를 호출하여 매개변수로 스레드가 처리할 작업을 스레드풀의 작업 큐에 전달
						// 이때 execute() 메서드의 매개변수 Runnable 인터페이스는 함수형 인터페이스이므로 람다식으로 처리할 작업을 전달할 수 있다.
						executorService.execute(() -> {
							// 클라이언트가 구독하고 싶은 뉴스 종류
							String newsKind = new String(receivePacket.getData(), 0, receivePacket.getLength(), StandardCharsets.UTF_8);

							// 클라이언트의 IP 주소와 port 번호 확인
							SocketAddress socketAddress = receivePacket.getSocketAddress();

							// 10개의 뉴스를 클라이언트로 전송
							for(int i = 1; i < 11; i++){
								String message = newsKind + ":" + i;

								// 문자열 클래스를 UTF8로 직렬화
								byte[] sendBytes = message.getBytes(StandardCharsets.UTF_8);

								// 직렬화한 바이트 배열을 클라이언트의 IP 주소와 port 번호로 전송하기 위한 Packet 클래스 생성
								DatagramPacket sendPacket = new DatagramPacket(sendBytes, 0, sendBytes.length, socketAddress);

								// DatagramSocket 클래스의 send() 메서드를 호출하여 클라이언트로 정송
								try {
									datagramSocket.send(sendPacket);
								} catch (IOException e) {
									throw new RuntimeException(e);
								}

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
		// DatagramSocket을 닫고 Port 언바운딩
		datagramSocket.close();

		// 스레드풀 종료
		executorService.shutdownNow();

		System.out.println("[서버] 종료");
	}
}
