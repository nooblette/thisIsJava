package part02.ch06.sec10.정적멤버;

public class Car {
	// 인스턴스 필드
	int instanceSpeed;

	// 인스턴스 메서드
	void instanceRun(){
		System.out.println("자동차 속력 : " + instanceSpeed);
	}

	// 정적 메서드
	static void simulate(){
		// 객체 생성
		Car car = new Car();

		// 인스턴스 멤버 접근 및 사용
		car.instanceSpeed = 200;
		car.instanceRun();
	}

	public static void main(String[] args) {
		// 정적 메서드 호출
		simulate();

		// 객체 생성
		Car car = new Car();

		// 인스턴스 멤버 접근 및 사용
		car.instanceSpeed = 60;
		car.instanceRun();
	}
}
