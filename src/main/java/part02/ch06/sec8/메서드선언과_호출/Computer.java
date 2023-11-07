package part02.ch06.sec8.메서드선언과_호출;

public class Computer {
	// 가변길이 매개변수를 갖는 메서드 선언
	int sum(int ... values){
		int sum = 0;

		// 가변길이 매개변수는 배열 타입처럼 사용
		for(int value : values){
			sum += value;
		}

		return sum;
	}
}
