package part03.ch14.sec07.스레드안전종료.interrupted메서드;

public class PrintThread extends Thread{

	@Override
	public void run(){
		while(true){
			// 스레드가 반복 실행하는 코드
			System.out.println("실행중");
			if(Thread.interrupted()) { // interrupted() 메서드로 interrupt() 메서드의 호출 여부를 확인
				break;
			}
		}

		// 리소스 정리 코드 구현
		System.out.println("리소스 정리");
		System.out.println("실행종료");
	}
}