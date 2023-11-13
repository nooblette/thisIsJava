package part02.ch07.sec04.메서드재정의;

public class Computer extends Calculator{
	@Override
	public double areaCircle(double r){
		System.out.println("Computer 객체의 areaCircle() 메서드 호출");
		return Math.PI * r * r;
	}
}
