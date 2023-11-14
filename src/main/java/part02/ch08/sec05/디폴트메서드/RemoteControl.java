package part02.ch08.sec05.디폴트메서드;

public interface RemoteControl {
	// 상수 필드
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;

	// 추상 메서드
	void turnOn();

	void turnOff();

	void setVolume(int volume);

	// 디폴트 인스턴스 메서드
	default void setMute(boolean mute){
		if(mute){
			System.out.println("무음 처리합니다.");
			setVolume(MIN_VOLUME); // 디폴트 인스턴스 메서드의 실행부에서 상수 필드를 읽거나 추상메서드를 호출할 수 있다.
		} else {
			System.out.println("무음 해제 합니다.");
		}
	}
}