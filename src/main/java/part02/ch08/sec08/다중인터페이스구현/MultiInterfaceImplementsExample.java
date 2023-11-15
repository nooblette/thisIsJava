package part02.ch08.sec08.다중인터페이스구현;

public class MultiInterfaceImplementsExample {
	public static void main(String[] args) {
			RemoteControl remoteControl = new SmartTelevision();
			remoteControl.turnOn();
			remoteControl.turnOff();
			//remoteControl.search(); // Searchable 인터페이스에 선언된 추상 메서드는 호출할 수 없다.

			Searchable searchable = new SmartTelevision();
			searchable.search("https://www.youtube.com");
			//searchable.turnOn(); // RemoteControl 인터페이스에 선언된 추상 메서드는 호출할 수 없다.
	}
}
