package part03.ch12.sec04.System클래스;

import java.io.IOException;

public class InExample {
	public static void main(String[] args) throws IOException {
		int speed = 0;
		int keyCode = 0;

		while(true){
			// Enter 키를 읽지 않았을 경우 실행
			if(keyCode != 10) {
				System.out.println("keyCode in if : " + keyCode);
				if (keyCode == 49) { // 키보드에서 숫자 1 키를 읽었을 경우
					speed++;
				} else if (keyCode == 50) { // 키보드에서 숫자 2 키를 읽었을 경우
					speed--;
				} else if (keyCode == 51) { // 키보드에서 숫자 3 키를 읽었을 경우
					break;
				}

				System.out.println("--------------------------");
				System.out.println("1. 증속 | 2. 감속 | 3. 중지");
				System.out.println("--------------------------");
				System.out.println("현재속도 = " + speed);
				System.out.print("선택: ");
			}

			// Enter 키를 읽으면 키를 하나씩 읽음
			keyCode = System.in.read();
			System.out.println("keyCode out if : " + keyCode);
		}

		System.out.println("프로그램 종료");
	}
}
