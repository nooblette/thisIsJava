package part03.ch15.sec06.LIFO와FIFO컬렉션.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
	public static void main(String[] args) {
		// Queue 컬렉션 생성
		Queue<Message> messageQueue = new LinkedList<>();

		// 메시지를 큐에 삽입
		messageQueue.offer(new Message("메일", "홍길동"));
		messageQueue.offer(new Message("SMS", "신용권"));
		messageQueue.offer(new Message("카카오톡", "이자바"));

		// 메시지를 하나씩 꺼내어 처리
		while(!messageQueue.isEmpty()){
			Message message = messageQueue.poll();
			System.out.println(message.getTo() + "에게 " + message.getCommand() + "을(를) 보냅니다.");
		}
	}
}
