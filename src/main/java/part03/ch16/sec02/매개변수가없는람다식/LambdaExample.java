package part03.ch16.sec02.매개변수가없는람다식;

public class LambdaExample {
	public static void main(String[] args) {
		Person person = new Person();

		// Person 클래스의 action 메서드의 매개변수로 익명 구현 객체를 전달 -> java에서 익명 구현 객체는 람다로 변환가능하다.
		person.action(new Workable(){
			@Override
			public void work() {
				System.out.println("코드를 개발합니다.");
			}
		});
		System.out.println();

		// 익명 구현 객체를 람다로 전달
		person.action(() -> System.out.println("코드를 개발합니다."));
		System.out.println();

		// 람다의 실행문이 두 줄 이상이면 중괄호로 묶어서 전달
		person.action(() -> {
			System.out.println("출근을 합니다.");
			System.out.println("코드를 개발합니다.");
		});
	}
}
