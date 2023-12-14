package part04.ch19.sec07.TCP채팅프로그램.server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

import org.json.JSONObject;

import lombok.Getter;

@Getter
public class SocketClient {
	private ChatServer chatServer;
	private Socket socket;
	private DataInputStream dataInputStream;
	private DataOutputStream dataOutputStream;
	private String chatName;
	private String clientIp;
	private int clientPort;

	public SocketClient(ChatServer chatServer, Socket socket){
		try{
			this.chatServer = chatServer;
			this.socket = socket;
			this.dataInputStream = new DataInputStream(socket.getInputStream());
			this.dataOutputStream = new DataOutputStream(socket.getOutputStream());

			// 요청을 보낸 클라이언트의 IP 주소와 port 번호 확인
			InetSocketAddress inetSocketAddress = (InetSocketAddress)socket.getRemoteSocketAddress();
			this.clientIp = inetSocketAddress.getHostName();
			this.clientPort = inetSocketAddress.getPort();

			// 클라이언트가 보낸 JSON 메시지를 읽는다.
			receive();
		} catch (IOException e){
			e.printStackTrace();
		}

	}

	// 클라이언트가 보낸 JSON 메시지를 읽는다.
	public void receive(){
		// threadPool 클래스의 execute() 메서드를 호출하여 매개변수(Runnable : 함수형 인터페이스)로 작업 큐가 처리할 작업을 람다식으로 전달
		// 작업 스레드가 execute()의 매개변수로부터 전달받은 작업을 맡아 처리한다.
		chatServer.threadPool.execute(() -> {
			try {
				while(true) {
					String receiveJson = dataInputStream.readUTF();

					JSONObject jsonObject = new JSONObject(receiveJson);
					String command = jsonObject.getString("command");

					switch (command) {
						// command 문자열이 "incoming" 인 경우 JSON에서 대화명을 읽고 chatRoom에 입장한 클라이언트와 통신하기 위한 socketClient를 추가한다.
						case "incoming" :
							this.chatName = jsonObject.getString("data");
							chatServer.sendToAll(this, "가 입장했습니다.");
							chatServer.addSocketClient(this);
							break;

						//  command 문자열이 "message" 인 경우 JSON에서 메시지를 읽고 연결되어 있는 클라이언트에게 보낸다.
						case "message" :
							String message = jsonObject.getString("data");
							chatServer.sendToAll(this, message);
							break;
					}
				}
			} catch (Exception e){
				// 예외가 발생한 경우 해당 클라이언트와 통신하기 위한 socketClient는 chatRoom에서 제거한다.
				chatServer.sendToAll(this, "가 퇴장했습니다.");
				chatServer.removeSocketClient(this);
			}
		});
	}

	// 메서드 전송
	public void send(String message){
		try {
			dataOutputStream.writeUTF(message);
			dataOutputStream.flush(); // 출력 버퍼에 잔류하고 있는 바이트들을 모두 전송
		} catch (Exception e){
			e.printStackTrace();
		}

	}

	// 연결 종료
	public void close(){
		try {
			socket.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
