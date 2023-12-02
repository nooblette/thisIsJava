package part03.ch14.sec06.스레드동기화.비동기메서드와블록;

// SynchronizedCalculator 클래스의 memory 필드를 공유해서 사용할 User1Thread 클래스
public class User3Thread extends Thread{
	private AsynchronizedCalculator asynchronizedCalculator;

	public User3Thread(){
		setName("User3Thread"); // 쓰레드 이름 지정
	}

	public void setCalculator(AsynchronizedCalculator asynchronizedCalculator){
		this.asynchronizedCalculator = asynchronizedCalculator;
	}

	@Override
	public void run(){
		// 동기화 메서드 호출
		asynchronizedCalculator.setAsynchronizedMethodMemory(100);
	}
}
