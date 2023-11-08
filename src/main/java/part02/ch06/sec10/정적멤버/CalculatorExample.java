package part02.ch06.sec10.정적멤버;

public class CalculatorExample {
	// 정적 필드를 객체 참조 변수를 통해 접근
	public static void main(String[] args) {
		Calculator myCal = new Calculator();
		double result1 = 10 * 10 * myCal.pi;
		myCal.plus(1, 2);
		myCal.minus(10, 4);
	}

}
