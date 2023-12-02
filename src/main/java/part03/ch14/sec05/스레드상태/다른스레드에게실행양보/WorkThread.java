package part03.ch14.sec05.스레드상태.다른스레드에게실행양보;

import lombok.AllArgsConstructor;

public class WorkThread extends Thread{
	public boolean work = true;

	public WorkThread(String name){
		setName(name); // 쓰레드의 이름 지정
	}
	@Override
	public void run() {
		while(true){
			if(work){
				System.out.println(getName() + ": 작업 처리");
			} else{
				Thread.yield();
			}
		}
	}
}
