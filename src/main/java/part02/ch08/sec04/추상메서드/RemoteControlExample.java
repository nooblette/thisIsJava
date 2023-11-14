package part02.ch08.sec04.추상메서드;

public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteControl remoteControl;

		remoteControl = new Television();
		remoteControl.turnOn();
		remoteControl.setVolume(5);
		remoteControl.turnOff();

		remoteControl = new Audio();
		remoteControl.turnOn();
		remoteControl.setVolume(100);
		remoteControl.turnOff();
	}
}
