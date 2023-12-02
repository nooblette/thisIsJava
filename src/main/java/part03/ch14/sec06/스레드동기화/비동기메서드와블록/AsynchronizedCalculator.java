package part03.ch14.sec06.스레드동기화.비동기메서드와블록;

public class AsynchronizedCalculator {
	private int memory; // memory 필드는 공유 데이터

	public int getMemory(){
		return memory;
	}

	// memory 메서드는 동기화 메서드로 선언하여 단 하나의 스레드만 실행할 수 있다.
	public void setAsynchronizedMethodMemory(int memory){
		this.memory = memory;
		try{
			Thread.sleep(2000);
		} catch (InterruptedException ignored){

		}
		System.out.println(Thread.currentThread().getName() + ": " + this.memory);
	}
}
