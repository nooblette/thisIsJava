package part04.ch19.sec04.UDP네트워킹;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

import part02.ch08.sec10.타입변환.자동타입변환.D;

public class NewsServer {
	private static DatagramSocket datagramSocket;
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
		// 작업 스레드 정의
		Thread thread = new Thread(){
			@Override
			public void run(){
				try{
					// DatagramSocket 객체 생성 및 50001 port 바인딩
					datagramSocket = new DatagramSocket(50001);
					System.out.println("[서버] 시작");

					while(true){
						// 클라이언트로부터 데이터를 수신받기 기다리며 blocking
						byte[] receiveBytes = new byte[1024];
						DatagramPacket receivePacket = new DatagramPacket(receiveBytes, receiveBytes.length);
						// 클라이언트로부터 데이터를 수신받으면 receivePacket 클래스에 그 내용을 저장하고 blocking 상태에서 깨어남
						datagramSocket.receive(receivePacket);

						// 클라이언트가 구독하고 싶은 뉴스 주제 얻기
						String newsKind = new String(receivePacket.getData(), 0, receivePacket.getLength(), StandardCharsets.UTF_8);

						// 클라이언트의 IP 주소와 port 번호 얻기
						SocketAddress socketAddress = receivePacket.getSocketAddress();

						// 10개의 뉴스를 클라이언트로 전송
						for(int i = 1; i <= 10; i++){
							String data = newsKind + ": 뉴스" + i;

							byte[] sendBytes = data.getBytes(StandardCharsets.UTF_8);
							DatagramPacket sendPacket = new DatagramPacket(sendBytes, 0, sendBytes.length, socketAddress);
							datagramSocket.send(sendPacket);
						}
					}

				} catch (Exception e){
					e.printStackTrace();
				}
			}
		};

		// 작업 스레드 시작
		thread.start();
	}

	private static void stopServer(){
		// datagramSocket을 닫고 port를 언바인딩하며 UDP 서버 종료
		datagramSocket.close();
		System.out.println("[서버] 종료");
	}
}
