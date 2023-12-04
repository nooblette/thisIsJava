package part03.ch16.sec03.매개변수가있는람다식;

public class LambdaExample {
	public static void main(String[] args) {
		Person person = new Person();

		// 매개변수가 두개인 경우
		// 1. 매개변수의 타입을 생략하여 람다식을 작성
		person.action1((name, job) -> {
			System.out.print(name + "이 ");
			System.out.println(job + "을 합니다.");
		});

		// 2. 매개변수의 타입을 지정하여 람다식을 작성
		// 어떠한 실행문을 {}에 전달하느냐에 따라 실행 결과가 달라진다 -> 람다식의 *데이터 처리의 다형성* 특성
		person.action1((String name, String job) -> {
			System.out.print(name + "이 ");
			System.out.println(job + "도 합니다.");
		});

		// 3. var 키워드로 매개변수 전달
		person.action1((var name, var job) -> {
			System.out.print(name + "이 ");
			System.out.println(job + "은 하지 않습니다.");
		});

		// 매개변수가 한개인 경우 - 매개변수의 괄호는 생략할 수 있다.
		person.action2(word -> {
			System.out.print("\"" + word + "\"");
			System.out.println("라고 말합니다.");
		});

		// 메서드 실행문이 하니인경우 중괄호도 생략할 수 있다.
		person.action2(word -> System.out.println("\"" + word + "\"라고 외칩니다."));
	}
}
