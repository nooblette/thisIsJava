package part03.ch14.sec03.작업스레드_생성과_실행;

import java.awt.Toolkit;

public class BeepPrintThreadChildExample {
	public static void main(String[] args) {
		Thread tnread = new Thread() {
			// Thread의 익명 자식 객체로 작업 스레드를 정의
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for(int i = 0; i < 5; i++){
					toolkit.beep();
					try {
						Thread.sleep(500); // main thread 0.5초간 일시 정지
					} catch (Exception ignored){

					}
				}
			}
		};

		tnread.start();
		for(int i = 0; i < 5; i++){
			System.out.println("띵");
			try {
				Thread.sleep(500); // main thread 0.5초간 일시 정지
			} catch (Exception ignored){

			}
		}
	}
}
