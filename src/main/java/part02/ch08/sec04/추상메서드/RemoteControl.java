package part02.ch08.sec04.추상메서드;

public interface RemoteControl {
	// 상수 필드 (public static final을 생략)
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;

	void turnOn();
	void turnOff();
	void setVolume(int volume);
}
