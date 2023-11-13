package part02.ch07.sec03.부모생성자호출;

public class SmartPhoneWithAllArgsConstructor extends PhoneWithAllArgsConstructor {
	// 자식 생성자 선언
	public SmartPhoneWithAllArgsConstructor(String model, String color){
		super(model, color); // 부모 클래스가 매개변수 있는 생성자만 있다면 반드시 작성해주어야함
		System.out.println("SmartPhoneWithAllArgsConstructor() 생성자 호출");
	}
}
