package part04.ch19.sec03.TCP네트워킹;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientExample {
	public static void main(String[] args) {
		try{
			// Socket 생성과 동시에 localhost와 50001 Port로 연결 요청
			Socket socket = new Socket("localhost", 50001);
			System.out.println("[클라이언트] 연결 요청");

			// 서버와 연결 해제
			socket.close();
			System.out.println("[클라이언트] 연결 해제");
		} catch (UnknownHostException e){
			// IP 주소가 잘못되었을 경우 발생
			e.printStackTrace();
		} catch (IOException e){
			// 제공한 IP와 port로 연결할 수 없을 경우 발생
			e.printStackTrace();
		}
	}
}
