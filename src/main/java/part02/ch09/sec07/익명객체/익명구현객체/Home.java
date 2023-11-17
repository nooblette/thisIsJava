package part02.ch09.sec07.익명객체.익명구현객체;

public class Home {
	// 필드에 익명 구현 객체 대입
	private RemoteControl rc = new RemoteControl() {
		@Override
		public void turnOn() {
			System.out.println("인스턴스 필드 리모콘으로 TV를 켭니다.");
		}

		@Override
		public void turnOff() {
			System.out.println("인스턴스 필드 리모콘으로 TV를 끕니다.");
		}
	};

	// 메서드 (인스턴스 필드 이용)
	public void use1(){
		rc.turnOn();
		rc.turnOff();
	}

	// 메서드 (로컬변수 이용)
	public void use2(){

		// 로컬 변수로 익명 구현 객체 선언
		RemoteControl remoteControl = new RemoteControl() {
			@Override
			public void turnOn() {
				System.out.println("로컬변수 리모콘으로 TV를 켭니다.");
			}

			@Override
			public void turnOff() {
				System.out.println("로컬변수 리모콘으로 TV를 끕니다.");
			}
		};

		remoteControl.turnOn();
		remoteControl.turnOff();
	}

	// 메서드 (매개변수 이용)
	public void use3(RemoteControl remoteControl){
		remoteControl.turnOn();
		remoteControl.turnOff();
	}
}
