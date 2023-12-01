package part03.ch13.sec03.제네릭메서드;

public class GenericExample {
	public static void main(String[] args) {
		// 제네릭 메서드 호출
		Box<Integer> integerBox = boxing(100);
		System.out.println(integerBox.getT());

		// 제네릭 메서드 호출
		Box<String> stringBox = boxing("안녕하세요");
		System.out.println(stringBox.getT());
	}

	private static<T> Box<T> boxing(T t){
		Box<T> box = new Box<>();
		box.setT(t);

		return box;
	}

}
