package part03.ch14.sec07.스레드안전종료.interrupted메서드;

public class InterruptExample {
	public static void main(String[] args) {
		Thread thread = new PrintThread();
		thread.start(); // thread를 실행 대기 상태로 변경

		try{
			Thread.sleep(1000); // 1초간 main thread는 일시 정지
			// main thread가 종료된 동안 PrintThread는 run() 메서드를 실행한다.
		} catch (InterruptedException ignored) {

		}

		thread.interrupt(); // InterruptException 예외를 발생시켜 sleep 메서드로 BLOCKING 상태에 있던 PrintThread 종료
	}
}
