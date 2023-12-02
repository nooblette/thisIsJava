package part03.ch14.sec05.스레드상태.주어진시간동안일시정지;

import java.awt.*;

public class SleepExample {
	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		// 3초주기로 비프음을 10번 발생
		for(int i = 0; i < 10; i++){
			toolkit.beep();
			try{
				Thread.sleep(3000);
			} catch (InterruptedException ignored){

			}
		}
	}
}
