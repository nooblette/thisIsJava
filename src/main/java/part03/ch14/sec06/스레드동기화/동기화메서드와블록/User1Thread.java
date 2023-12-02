package part03.ch14.sec06.스레드동기화.동기화메서드와블록;

// SynchronizedCalculator 클래스의 memory 필드를 공유해서 사용할 User1Thread 클래스
public class User1Thread extends Thread{
	private SynchronizedCalculator synchronizedCalculator;

	public User1Thread(){
		setName("User1Thread"); // 쓰레드 이름 지정
	}

	public void setCalculator(SynchronizedCalculator synchronizedCalculator){
		this.synchronizedCalculator = synchronizedCalculator;
	}

	@Override
	public void run(){
		// 동기화 메서드 호출
		synchronizedCalculator.setSynchronizedMethodMemory(100);
	}
}
