package part02.ch08.sec02.인터페이스와_구현클래스선언.sec03;

public class AirConditioner implements RemoteControl{

	@Override
	public void turnOn() {
		System.out.println("에어컨 전원을 켭니다.");
	}

	public void desireTemperature() {
		System.out.println("현재 희망온도는 18도 입니다.");
	}
}
