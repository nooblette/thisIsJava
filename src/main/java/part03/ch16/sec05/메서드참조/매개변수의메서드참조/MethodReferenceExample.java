package part03.ch16.sec05.메서드참조.매개변수의메서드참조;

public class MethodReferenceExample {
	public static void main(String[] args) {
		Person person = new Person();

		// ordering() 메서드의 매개변수로 Comparable 인터페이스의 익명 구현 객체를 전달한다.
		// 이때, 익명 구현 객체의 추상 메서드는 String 클래스의 compareToIgnoreCase() 메서드를 호출한다.
		// 람다식의 매개변수 중 하나의 메서드를 람다식 실행문에서 호출하여, 그 메서드로 또다른 람다식의 매개변수를 전달한다.
		person.ordering((a, b) -> a.compareToIgnoreCase(b));

		// 위와 같은 경우 (), ->, {} 기호는 :: 로 변환 가능하다.
		person.ordering(String::compareToIgnoreCase);
	}
}
