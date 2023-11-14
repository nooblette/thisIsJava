package part02.ch07.sec10.추상클래스;

public class PhoneExample {
	public static void main(String[] args) {
		// Phone phone = new Phone(); // 추상 클래스는 new 연산자로 인스턴스화(객체 생성)할 수 없다.

		SmartPhone smartPhone = new SmartPhone("홍길동");
		smartPhone.turnOn();
		smartPhone.internet();
		smartPhone.turnOff();
	}
}
