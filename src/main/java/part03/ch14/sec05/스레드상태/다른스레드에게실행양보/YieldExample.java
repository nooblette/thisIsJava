package part03.ch14.sec05.스레드상태.다른스레드에게실행양보;

public class YieldExample {
	public static void main(String[] args) {
		WorkThread workThreadA = new WorkThread("workThreadA");
		WorkThread workThreadB = new WorkThread("workThreadB");

		workThreadA.start(); // workThreadA 쓰레드를 RUNNABLE 상태로 보낸다.
		workThreadB.start(); // workThreadB 쓰레드를 RUNNABLE 상태로 보낸다.

		try {
			Thread.sleep(5000); // 5초간 쓰레드 실행 정지
		} catch (InterruptedException ignored){

		}
		workThreadA.work = false; // workThreadA 쓰레드는 workThreadB에게 실행을 양보한 후 일시 정지(BLOCKING) 상태가 된다.

		try {
			Thread.sleep(5000); // 5초간 쓰레드 실행 정지
		} catch (InterruptedException ignored){

		}
		workThreadA.work = true;
	}
}
