package part03.ch13.sec02.제네릭타입.내용물비교;

public class Box<T> {
	public T content;

	public boolean compare(Box<T> otherBox){
		return content.equals(otherBox);
	}
}
