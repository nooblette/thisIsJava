package part03.ch16.sec05.메서드참조.정적메서드와_인스턴스메서드참조;

public class MethodReferenceExample {
	public static void main(String[] args) {
		Person person = new Person();

		// 정적 메서드를 호출하는 람다식
		person.action((x, y) -> Computer.staticMethod(x, y));

		// 불필요한 기호를 제거하고 콜론 :: 으로 표시
		person.action(Computer::staticMethod);
		System.out.println();

		// 인스턴스 메서드를 호출하는 람다식
		Computer computer = new Computer();
		person.action(((x, y) -> computer.instanceMethod(x, y)));

		// 불필요한 기호를 제거하고 콜론 :: 으로 표시
		person.action(computer::instanceMethod);
	}
}
