package part03.ch14.sec08.데몬스레드;

public class DaemonExample {
	public static void main(String[] args) {
		AutoSaveThread autoSaveThread = new AutoSaveThread();
		autoSaveThread.setDaemon(true); // autoSaveThread는 데몬스레드(메인 스레드가 종료되면 함께 종료된다.)
		autoSaveThread.start(); // autoSaveThread를 실행대기 RUNNABLE 상태로 변경

		try {
			Thread.sleep(3000);
		} catch (InterruptedException ignored){

		}

		System.out.println("메인 스레드 종료");
	}
}
