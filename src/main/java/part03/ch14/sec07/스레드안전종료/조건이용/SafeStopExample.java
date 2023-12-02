package part03.ch14.sec07.스레드안전종료.조건이용;

public class SafeStopExample {
	public static void main(String[] args) {
		PrintThread printThread = new PrintThread();
		printThread.start();

		try{
			// 3초간 main thread 일시 정지
			// main thread가 일시 정지되는 동안 PrintThread가 "실행중" 코드를 반복 실행한다.
			Thread.sleep(3000);
		} catch (InterruptedException ignored){

		}

		// 3초 뒤 main thread가 깨어나고 우선순위에 의해 실행상태가 된다.
		// PrintThread의 stop 필드 값을 true로 바꾼다.
		// PrintThread는 리소스를 정리하고 실행을 종료한다.
		printThread.setStop(true);
	}
}
