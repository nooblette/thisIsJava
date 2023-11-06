package part02.ch06.sec6.필드선언과사용;

public class CarExample {
	public static void main(String[] args) {
		Car car = new Car();

		System.out.println("제작 회사 : " + car.company);
		System.out.println("모델명 : " + car.model);
		System.out.println("색상 : " + car.color);
		System.out.println("시동여부 : " + car.start);
		System.out.println("현재속도 : " + car.speed);
		System.out.println("최고속도 : " + car.maxSpeed);

		car.speed = 60;
		System.out.println("수정된 후 현재속도 : " + car.speed);
	}
}
