package part02.ch06.sec7.생성자선언과_호출;

public class CarConstructorOverloadingExample {
	public static void main(String[] args) {
		Car car1 = new Car();
		System.out.println("모델명 : " + car1.model);
		System.out.println("색상 : " + car1.color);
		System.out.println("최고속도 : " + car1.maxSpeed);
		System.out.println();

		Car car2 = new Car("그랜져");
		System.out.println("모델명 : " + car2.model);
		System.out.println("색상 : " + car2.color);
		System.out.println("최고속도 : " + car2.maxSpeed);
		System.out.println();

		Car car3 = new Car("그랜져", "검정");
		System.out.println("모델명 : " + car3.model);
		System.out.println("색상 : " + car3.color);
		System.out.println("최고속도 : " + car3.maxSpeed);
		System.out.println();

		Car car4 = new Car("그랜져", "검정", 300);
		System.out.println("모델명 : " + car4.model);
		System.out.println("색상 : " + car4.color);
		System.out.println("최고속도 : " + car4.maxSpeed);
	}
}
