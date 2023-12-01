package part03.ch13.sec01.제네릭이란;

public class GenericExample {
	public static void main(String[] args) {
		// 변수를 선언하고 사용할때 동일한 타입으로 <T> 를 대체하는 경우, 생성자에는 타입을 생략 가능
		Box<String> box1 = new Box<>();
		box1.content = "안녕하세요";
		String str = box1.content;
		System.out.println(str);

		Box<Integer> box2 = new Box<>();
		box2.content = 100;
		int content = box2.content;
		System.out.println(content);
	}
}
