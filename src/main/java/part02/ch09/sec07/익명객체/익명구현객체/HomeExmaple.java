package part02.ch09.sec07.익명객체.익명구현객체;

public class HomeExmaple {
	public static void main(String[] args) {
		Home home = new Home();

		home.use1();
		home.use2();
		home.use3(new RemoteControl() {
			@Override
			public void turnOn() {
				System.out.println("매개변수 리모콘으로 TV를 켭니다.");
			}

			@Override
			public void turnOff() {
				System.out.println("매개변수 리모콘으로 TV를 끕니다.");
			}
		});
	}
}
