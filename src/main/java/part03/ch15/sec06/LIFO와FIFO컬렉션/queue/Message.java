package part03.ch15.sec06.LIFO와FIFO컬렉션.queue;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Message {
	private String command;
	private String to;
}
