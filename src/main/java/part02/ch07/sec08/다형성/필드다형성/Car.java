package part02.ch07.sec08.다형성.필드다형성;

public class Car {
	// 필드 선언
	public Tire tire;

	// 메서드 선언
	public void run(){
		tire.roll(); // tire 필드에 대입된 객체의 roll() 메서드 호출
	}
}