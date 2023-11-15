package part02.ch08.sec11.다형성.매개변수다형성;

public class Driver {
	void drive(Vehicle vehicle) { // 메서드 매개변수로 인터페이스 타입을 받는다.

		// 인터페이스의 추상 메서드를 호출한다.
		// 실제로는 구현 객체에서 오버라이딩한 메서드가 실행된다.
		vehicle.run();
	}
}