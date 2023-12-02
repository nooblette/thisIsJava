package part03.ch14.sec06.스레드동기화.wait와notify;

public class WorkObject {
	public synchronized void methodA(){
		Thread thread = Thread.currentThread();
		System.out.println(thread.getName() + ": methodA 작업 실행");
		notify(); // wait()에 의해 일시 정지된 스레드 중 하나를 실행 대기 상태로 만든다.
		try{
			wait(); // 자기 자신은 중복 실행을 막기위해 일시정지 상태로 만든다.
		} catch (InterruptedException ignored){

		}
	}

	public synchronized void methodB(){
		Thread thread = Thread.currentThread();
		System.out.println(thread.getName() + ": methodB 작업 실행");
		notify(); // wait()에 의해 일시 정지된 스레드 중 하나를 실행 대기 상태로 만든다.
		try{
			wait(); // 자기 자신은 중복 실행을 막기위해 일시정지 상태로 만든다.
		} catch (InterruptedException ignored){

		}
	}}
