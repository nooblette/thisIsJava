package part02.ch07.sec03.부모생성자호출;

public class SmartPhoneWithDefaultConstructor extends PhoneWithDefaultConstructor {
	// 자식 생성자 선언
	public SmartPhoneWithDefaultConstructor(String model, String color){
		//super(); // 생략 가능(컴파일러에 의해 맨 첫줄에 자동 추가)
		System.out.println("SmartPhoneWithDefaultConstructor() 생성자 호출");
	}
}
