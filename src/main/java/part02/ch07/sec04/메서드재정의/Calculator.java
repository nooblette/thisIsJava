package part02.ch07.sec04.메서드재정의;

public class Calculator {
	// 메서드 선언
	public double areaCircle(double r){
		System.out.println("Calculator 객체의 areaCircle() 메서드 호출");
		return 3.14159 * r * r;
	}
}
