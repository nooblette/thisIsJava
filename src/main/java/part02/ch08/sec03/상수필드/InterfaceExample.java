package part02.ch08.sec03.상수필드;

public class InterfaceExample {
	public static void main(String[] args) {
		// 상수 필드는 구현 객체 없이 인터페이스로 바로 접근 가능
		System.out.println("리모콘 최대 볼륨 : " + RemoteControl.MAX_VOLUME);
		System.out.println("리모콘 최소 볼륨 : " + RemoteControl.MIN_VOLUME);
	}
}
