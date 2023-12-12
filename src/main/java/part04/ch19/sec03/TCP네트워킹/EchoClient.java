package part04.ch19.sec03.TCP네트워킹;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

import part02.ch08.sec10.타입변환.자동타입변환.D;

public class EchoClient {
	public static void main(String[] args) {
		try {
			// Socket 생성과 동시에 localhost와 50001 port로 연결 요청
			Socket socket = new Socket("localhost", 50001);

			System.out.println("[클라이언트] 연결 요청");

			/* 데이터 전송 */
			String message = "이것이 자바다";

			// OutputStream 기본 스트림으로 데이터 송신
			// OutputStream outputStream = socket.getOutputStream();
			// byte[] bytes = message.getBytes(StandardCharsets.UTF_8);
			// outputStream.write(bytes);
			// outputStream.flush();

			// DataOutputStream 보조 스트림으로 데이터 송신
			DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
			dataOutputStream.writeUTF(message);
			dataOutputStream.flush();
			System.out.println("[클라이언트] 데이터 송신 : " + message);

			/* 데이터 수신 */
			// InputStream 기본 스트림으로 데이터 수신
			// InputStream inputStream = socket.getInputStream();
			// int num = inputStream.read(bytes);
			// message = new String(bytes, 0, num, StandardCharsets.UTF_8);

			// 연결 해재
			// inputStream.close();

			// DataInputStream 보조 스트림으로 데이터 수신
			DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
			message = dataInputStream.readUTF();
			System.out.println("[클라이언트] 데이터 수신 : " + message);

			System.out.println("[클라이언트] 연결 해제");
			socket.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
