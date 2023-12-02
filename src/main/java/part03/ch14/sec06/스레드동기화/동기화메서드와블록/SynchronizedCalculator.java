package part03.ch14.sec06.스레드동기화.동기화메서드와블록;

public class SynchronizedCalculator {
	private int memory; // memory 필드는 공유 데이터

	public int getMemory(){
		return memory;
	}

	// memory 메서드는 동기화 메서드로 선언하여 단 하나의 스레드만 실행할 수 있다.
	public synchronized void setSynchronizedMethodMemory(int memory){
		// 단 하나의 스레드만 실행할 수 있는 영역
		this.memory = memory;
		try{
			Thread.sleep(2000);
		} catch (InterruptedException ignored){

		}
		System.out.println(Thread.currentThread().getName() + ": " + this.memory);
		// 동기화 메서드의 실행이 끝날때까지 다른 스레드는 이 메서드를 호출할 수 없다.
	}

	public void setSynchronizedBlockMemory(int memory){
		// 여러 스레드가 실행할 수 있는 영역

		// 단 하나의 스레드만 실행할 수 있는 동기화 블록 영역
		synchronized (this){
			this.memory = memory;
			try{
				Thread.sleep(2000);
			} catch (InterruptedException ignored){

			}
			System.out.println(Thread.currentThread().getName() + ": " + this.memory);
			// 동기화 블록의 실행이 끝날때까지 다른 스레드는 이 영역에 접근할 수 없다.
		}
	}

}
