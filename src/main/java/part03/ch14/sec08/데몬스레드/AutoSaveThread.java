package part03.ch14.sec08.데몬스레드;

public class AutoSaveThread extends Thread {
	public void save(){
		System.out.println("자동 저장 완료");
	}

	@Override
	public void run(){
		// AutoSaveThread는 1초마다 자동저장 수행
		while(true){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e){
				break;
			}
			save();
		}
	}
}
