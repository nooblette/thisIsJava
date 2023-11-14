package part02.ch08.sec03.상수필드;

public interface RemoteControl {
	// 상수 선언(인터페이스에 선언된 필드는 모드 public static final 특성을 갖으며 생략하더라고 컴파일러에 의해 추가된다.)
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;

	// 추상 메서드 선언
	void turnOn();
}
