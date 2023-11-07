package part02.ch06.sec7.생성자선언과_호출;

public class Car {
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;

	// 생성자 오버로딩
	public Car(){

	}

	public Car(String model){
		this(model, "은색" , 250);
		System.out.println("Car(String model) 생성자 호출 종료");
	}

	public Car(String model, String color){
		this(model, color, 250);
		System.out.println("Car(String model, String color) 생성자 호출 종료");
	}

	public Car(String model, String color, int maxSpeed){
		System.out.println("Car(String model, String color, String maxSpeed) 생성자 호출");
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
		System.out.println("Car(String model, String color, String maxSpeed) 생성자 종료");
	}

}