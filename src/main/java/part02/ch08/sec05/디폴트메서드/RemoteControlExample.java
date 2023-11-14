package part02.ch08.sec05.디폴트메서드;

public class RemoteControlExample {
	public static void main(String[] args) {
		// 인터페이스 변수 선언
		RemoteControl remoteControl;

		// 구현 객체 할당
		remoteControl = new Television();

		// 디폴트 메서드 호출
		remoteControl.setMute(true);
		remoteControl.setMute(false);

		remoteControl = new Audio();
		remoteControl.turnOn();
		remoteControl.setVolume(5);
		remoteControl.setMute(true);
		remoteControl.setMute(false);
	}
}
