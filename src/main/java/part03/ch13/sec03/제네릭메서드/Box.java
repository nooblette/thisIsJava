package part03.ch13.sec03.제네릭메서드;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Box<T> {
	private T t;
}
