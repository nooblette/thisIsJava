package part03.ch14.sec07.스레드안전종료.interrupt메서드이용;

public class PrintThread extends Thread{

	@Override
	public void run(){
		try{
			while(true){
				// 스레드가 반복 실행하는 코드
				System.out.println("실행중");
				Thread.sleep(1); // 0.001초간 일시정지(InterruptExeption이 발생할 수 있도록)
			}
		} catch (InterruptedException exception){

		}

		// 리소스 정리 코드 구현
		System.out.println("리소스 정리");
		System.out.println("실행종료");
	}
}