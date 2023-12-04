package part03.ch16.sec01.람다식이란;

public class LambdaExample {
	public static void main(String[] args) {
		// 람다식을 매개변수로 받는 action 메서드
		// 아래 두 메서드의 실행 결과는 다르다(람다식의 특성인 데이터 처리의 다형성)
		action((x, y) -> {
			System.out.println((x + y));
		});

		action((x, y) -> {
			System.out.println((x - y));
		});
	}

	private static void action(Calculable calculable){
		int x = 10;
		int y = 4;
		calculable.calculate(x, y);
	}
}
