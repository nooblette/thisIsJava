package part02.ch08.sec10.타입변환.강제타입변환;

public class CastingExample {
	public static void main(String[] args) {
		Vehicle vehicle = new Bus(); // 저수준 모듈(구현 객체)를 고수준 모듈(인터페이스)로 자동 타입 변환

		vehicle.run();
		//vehicle.checkFare(); // Bus 구현 클래스에서만 정의된 메서드는 호출할 수 없다.

		Bus bus = (Bus)vehicle; // 고수준 모듈(인터페이스)를 저수준 모듈(구현 객체)로 강제 타입 변환
		bus.run();
		bus.checkFare();
	}
}
