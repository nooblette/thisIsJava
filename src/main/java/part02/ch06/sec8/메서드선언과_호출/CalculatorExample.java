package part02.ch06.sec8.메서드선언과_호출;

public class CalculatorExample {
	public static void main(String[] args) {
		Calculator myCal = new Calculator();

		myCal.powerOn();

		int result1 = myCal.plus(5, 6);
		System.out.println("result1 : " + result1);

		double result2 = myCal.divide(10, 4);
		System.out.println("result2 : " + result2);

		myCal.powerOff();

		// 정사각형 넓이 구하기
		System.out.println(myCal.areaRectangle(10));

		// 직사각형 넓이 구하기
		System.out.println(myCal.areaRectangle(10, 20));
	}
}
