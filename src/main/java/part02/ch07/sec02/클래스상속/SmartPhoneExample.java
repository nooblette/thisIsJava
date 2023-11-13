package part02.ch07.sec02.클래스상속;

public class SmartPhoneExample {
	public static void main(String[] args) {
		SmartPhone myPhone = new SmartPhone("iPhone 15 Pro", "블랙티타늄");

		// PhoneWithDefaultConstructor(부모객체)로부터 상속받은 필드 출력
		System.out.println("모델 : " + myPhone.model);
		System.out.println("색상 : " + myPhone.color);

		// SmartPhoneWithDefaultConstructor(자식객체)의 필드 출력
		System.out.println("와이파이 상태 : " + myPhone.wifi);

		// PhoneWithDefaultConstructor(부모객체)로부터 상속받은 메서드 호출
		myPhone.bell();
		myPhone.sendVoice("여보세요");
		myPhone.receiveVoice("안녕하세요!");
		myPhone.sendVoice("반가워요");
		myPhone.hangUp();

		// SmartPhoneWithDefaultConstructor(자식객체)의 메서드 호출
		myPhone.setWifi(true);
		myPhone.internet();
	}

}
