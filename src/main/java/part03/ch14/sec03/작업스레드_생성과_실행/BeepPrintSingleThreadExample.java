package part03.ch14.sec03.작업스레드_생성과_실행;

import java.awt.Toolkit;
public class BeepPrintSingleThreadExample {
	// java는 main() 메서드를 호출하면서 메인 스레드 실행
	public static void main(String[] args) {
		// 0.5초 주기로 비프음과 출력을 동시에 하는 작업이였으나, 비프음이 5번 발생하고 난 뒤 출력이 발생한다.
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i = 0; i < 5; i++){
			toolkit.beep(); // 비프음 발생
			try {
				Thread.sleep(500); // main thread 0.5초간 일시 정지
			} catch (Exception ignored){

			}
		}

		for(int i = 0; i < 5; i++){
			System.out.println("띵");
			try {
				Thread.sleep(500); // main thread 0.5초간 일시 정지
			} catch (Exception ignored){

			}
		}
	}
}
