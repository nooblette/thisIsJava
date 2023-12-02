package part03.ch14.sec06.스레드동기화.wait와notify;

public class ThreadB extends Thread{
	private WorkObject workObject;

	public ThreadB(WorkObject workObject){
		setName("ThreadB");
		this.workObject = workObject;
	}

	@Override
	public void run(){
		for(int i = 0; i < 10; i++){
			workObject.methodB();
		}
	}
}
