package part04.ch19.sec04.UDP네트워킹;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;
import java.nio.charset.StandardCharsets;

public class NewsClient {
	public static void main(String[] args) {
		try{
			// DatagramSocket 생성
			DatagramSocket datagramSocket = new DatagramSocket();

			// 구독하고 싶은 뉴스 주제 생성
			String data = "개발";
			byte[] sendBytes = data.getBytes(StandardCharsets.UTF_8);

			// UDP 서버의 IP 주소와 port 번호를 지정하여 UDP 서버로 전송할 packet 생성
			DatagramPacket sendPacket = new DatagramPacket(
				sendBytes, sendBytes.length, new InetSocketAddress("localhost", 50001)
			);
			// 뉴스 주제를 UDP 서버로 전송
			datagramSocket.send(sendPacket);

			// UDP 서버로부터 응답 대기
			while(true) {
				// 서버로부터 뉴스 받기
				DatagramPacket receivePacket = new DatagramPacket(new byte[1024], 1024);
				datagramSocket.receive(receivePacket); // 서버의 응답을 기다리며 blocking, 응답을 받으면 receivePacket 객체에 그 결과를 저장

				// 문자열로 변환
				String news = new String(receivePacket.getData(), 0, receivePacket.getLength(), StandardCharsets.UTF_8);
				System.out.println(news);

				// 10번째 뉴스를 받으면 while loop 종료
				if(news.contains("10")){
					break;
				}
			}

			// DatagramSocket 닫기
			datagramSocket.close();
			System.out.println("[클라이언트] 종료");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
