package part02.ch06.sec14.Getter_Setter;

public class CarExample {
	public static void main(String[] args) {
		// 객체 생성
		Car car = new Car();

		// 잘못된 속도 변경
		car.setSpeed(-1);
		System.out.println("현재 속력 : " + car.getSpeed());

		// 올바른 속도 변경
		car.setSpeed(100);
		System.out.println("현재 속력 : " + car.getSpeed());

		// 멈춤
		System.out.println("주행 시작");
		while(!car.isStop()){
			double speed = car.getSpeed() - 1.0;
			car.setSpeed(speed);
			System.out.println("현재 속력 : " + car.getSpeed());
		}
		System.out.println("주행 종료");
	}
}
