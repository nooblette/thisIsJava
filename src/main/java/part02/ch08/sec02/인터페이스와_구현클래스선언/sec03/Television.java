package part02.ch08.sec02.인터페이스와_구현클래스선언.sec03;

public class Television implements RemoteControl {
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}

}
