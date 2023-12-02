package part03.ch14.sec03.작업스레드_생성과_실행;

import java.awt.*;

public class BeepPrintMultiThreadExample {
	public static void main(String[] args) {
		// 멀티 쓰레드로 구현하여 0.5초 주기로 비프음과 출력 작업을 동시에 진행한다.
		Toolkit toolkit = Toolkit.getDefaultToolkit();

		Thread beepSoundWorkerThread = new Thread(new Runnable() { // Thread 객체의 생성자로 Runnable 익명 객체를 전달
			@Override
			public void run() {
				// Runnable 익명 객체가 수행할 작업을 정의
				for(int i = 0; i < 5; i++){
					toolkit.beep(); // 비프음 발생
					try {
						Thread.sleep(500); // main thread 0.5초간 일시 정지
					} catch (Exception ignored){

					}
				}
			}
		});

		beepSoundWorkerThread.start(); // 작업 스레드 실행, 작업 스레드 생성자의 매개변수로 전달한 Runnable 구현 객체의 run() 메서드를 호출한다.

		for(int i = 0; i < 5; i++){
			System.out.println("띵");
			try {
				Thread.sleep(500); // main thread 0.5초간 일시 정지
			} catch (Exception ignored){

			}
		}
	}
}
