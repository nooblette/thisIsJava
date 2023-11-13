package part02.ch07.sec03.부모생성자호출;

public class PhoneWithAllArgsConstructor {
	public String model;
	public String color;

	// 기본 생성자 선언
	public PhoneWithAllArgsConstructor(String model, String color){
		this.model = model;
		this.color = color;
		System.out.println("PhoneWithAllArgsConstructor() 생성자 실행");
	}
}
