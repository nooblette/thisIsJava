package part03.ch14.sec07.스레드안전종료.조건이용;

public class PrintThread extends Thread{
	private boolean stop;

	public void setStop(boolean stop){
		this.stop = stop;
	}

	@Override
	public void run(){
		while(!stop){
			// 스레드가 반복 실행하는 코드
			System.out.println("실행중");
		}

		// 리소스 정리 코드 구현
		System.out.println("리소스 정리");
		System.out.println("실행종료");
	}
}
