package part02.ch07.sec03.부모생성자호출;

public class SmartPhoneExample {
	public static void main(String[] args) {
		// SmartPhoneWithDefaultConstructor 객체 생성
		SmartPhoneWithDefaultConstructor smartPhone = new SmartPhoneWithDefaultConstructor("iPhone 15 Pro", "티타늄");

		// 부모 객체로부터 상속받은 필드 출력
		System.out.println("모델 : " + smartPhone.model);
		System.out.println("색상 : " + smartPhone.color);

		SmartPhoneWithAllArgsConstructor smartPhone2 = new SmartPhoneWithAllArgsConstructor("iPhone 15 Pro", "티타늄");
		// 부모 객체로부터 상속받은 필드 출력
		System.out.println("모델 : " + smartPhone2.model);
		System.out.println("색상 : " + smartPhone2.color);

	}
}
