package part03.ch14.sec05.스레드상태.다른스레드의종료대기;

public class SumThread extends Thread{
	private long sum;

	public long getSum(){
		return sum;
	}

	public void setSum(long sum){
		this.sum = sum;
	}

	@Override
	public void run(){
		for(int i = 1; i < 101; i++){
			sum += i;
		}
	}
}
