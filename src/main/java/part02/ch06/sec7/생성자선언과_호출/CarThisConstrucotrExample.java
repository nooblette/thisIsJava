package part02.ch06.sec7.생성자선언과_호출;

public class CarThisConstrucotrExample {
	public static void main(String[] args) {
		System.out.println("Car(String model) 생성자 호출");
		Car car1 = new Car("자가용");
		System.out.println("회사명 : " + car1.company);
		System.out.println("모델명 : " + car1.model);
		System.out.println("색상 : " + car1.color);
		System.out.println("최고속도 : " + car1.maxSpeed);
		System.out.println();

		System.out.println("Car(String model, String color) 생성자 호출");
		Car car2 = new Car("자가용", "빨강");
		System.out.println("회사명 : " + car2.company);
		System.out.println("모델명 : " + car2.model);
		System.out.println("색상 : " + car2.color);
		System.out.println("최고속도 : " + car2.maxSpeed);
		System.out.println();

		Car car3 = new Car("자가용", "검정", 200);
		System.out.println("회사명 : " + car3.company);
		System.out.println("모델명 : " + car3.model);
		System.out.println("색상 : " + car3.color);
		System.out.println("최고속도 : " + car3.maxSpeed);
		System.out.println();
	}
}
