package part03.ch13.sec02.제네릭타입.내용물비교;

public class GenericExample {
	public static void main(String[] args) {
		Box<Integer> box1 = new Box<>();
		box1.content = 100;

		Box<Integer> box2 = new Box<>();
		box2.content = 10;

		System.out.println(box1.compare(box2));
	}

}
