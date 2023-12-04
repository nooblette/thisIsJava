package part03.ch16.sec04.리턴값이있는람다식;

public class LambdaExample {
	public static void main(String[] args) {
		Person person = new Person();

		// 익명 구현 객체의 실행문이 return 문을 포함하여 두개 이상인 경우
		person.action(new Calculable() {
			@Override
			public double calc(double a, double b) {
				double value = a + b;
				return value;
			}
		});
		// 매개변수가 2개, 실행문이 2개 이상인 람다식으로 변환
		person.action((a, b) -> {
			double value = a + b;
			return value;
		});

		// 실행문이 return문 하나인 람다식으로 변환, 이 경우 return 키워드는 생략한다.
		person.action((a, b) -> a + b);
	}
}
