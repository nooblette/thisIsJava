package part03.ch12.sec06.포장클래스;

public class BoxingUnboxingExample {
	public static void main(String[] args) {
		// Boxing
		Integer integer = 100;
		System.out.println("value : " + integer.intValue());

		// Unboxing
		int value = integer + 50;
		System.out.println("value : " + value);
	}
}
