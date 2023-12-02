package part03.ch14.sec06.스레드동기화.wait와notify;

public class WaitAndNotifyExample {
	public static void main(String[] args) {
		WorkObject workObject = new WorkObject();

		ThreadA threadA = new ThreadA(workObject);
		ThreadB threadB = new ThreadB(workObject);

		threadB.start();
		threadA.start();
	}
}
