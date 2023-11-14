package part02.ch08.sec06.정적메서드;

public interface RemoteControl {
	int MIN_VOLUME = 0; // public static final 생략
	int MAX_VOLUME = 10;// public static final 생략

	// 추상 메서드
	void turnOn(); // public 생략 (구현객체에서 오버라이딩을 강제, 이 인터페이스로부터 인스턴스화된 모든 객체는 동일한 역할을 수행한다.)
	void turnOff();
	void setVolume(int volume);

	// 디폴트 메서
	default void setMute(boolean mute){
		if(mute){
			System.out.println("무음 처리합니다.");
			setVolume(MIN_VOLUME); // 디폴트 인스턴스 메서드의 실행부에서 상수 필드를 읽거나 추상메서드를 호출할 수 있다.
		} else {
			System.out.println("무음 해제 합니다.");
		}
	}

	// 정적 메서드
	static void changeBattery(){
		System.out.println("건전지를 교체합니다.");
	}
}
