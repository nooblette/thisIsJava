package part02.ch08.sec02.인터페이스와_구현클래스선언.sec03;

public class InterfaceExample {
	public static void main(String[] args) {
		// AirConditioner 타입을 RemoteControl 타입으로 자동 변화(promotion)
		RemoteControl remoteControl = new AirConditioner();

		remoteControl.turnOn();
		// remoteControl.desireTemperature(); // AirConditioner 타입에만 존재하는 메서드는 호출할 수 없다.
		((AirConditioner)remoteControl).desireTemperature(); // AirConditioner 타입으로 형변환(casting)하면 호출 가능

		remoteControl = new Television();
		remoteControl.turnOn(); // Television 객체에서 재정의된 turnOn() 메서드가 호출된다.
	}
}
