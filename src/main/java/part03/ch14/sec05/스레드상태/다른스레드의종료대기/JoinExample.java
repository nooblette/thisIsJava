package part03.ch14.sec05.스레드상태.다른스레드의종료대기;

public class JoinExample {
	// main() 메서드가 있는 쓰레드는 main thread
	public static void main(String[] args) {
		SumThread sumThread = new SumThread();

		sumThread.start(); // SumThread의 run 메서드 호출, SumThread는 실행대기(RUNNABLE)상태가 된다.
		try{
			// SumThread를 실행(RUNNING)하고 메인쓰레드는 sumThread의 작업이 끝날때까지 일시정지(BLOCKING) 상태가 된다.
			// main thread는 sumThread의 작업이 끝나야 실행대기(RUNNABLE)상태로 돌아갈 수 있다.
			sumThread.join();
		} catch (InterruptedException ignored){

		}

		// sumThread의 작업(1~10까지의 합 계산)이 끝나면 main thread가 그 결과값을 사용하여 작업을 처리한다.
		System.out.println("1 ~ 100 합 : " + sumThread.getSum());
	}
}
