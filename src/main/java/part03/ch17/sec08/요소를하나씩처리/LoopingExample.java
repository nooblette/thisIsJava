package part03.ch17.sec08.요소를하나씩처리;

import java.util.Arrays;

public class LoopingExample {
	public static void main(String[] args) {
		int[] intArr = {1, 2, 3, 4, 5};

		// peek() 메서드 호출 후 최종 처리를 누락한 경우
		Arrays.stream(intArr)
			.peek(number -> System.out.println(number)); // 최종 처리 메서드를 누락하여 peek() 메서드도 호출되지 않는다.
		System.out.println();

		// peek() 메서드 호출 후 최종 처리 코드 작성
		int total = Arrays.stream(intArr)
			.peek(number -> System.out.println(number)) // peek() 메서드를 호출하여 각 요소를 반복하여 처리(looping)
			.sum(); // 최종 처리 단계로 sum 집계함수 호출
		System.out.println("총합 : " + total);
		System.out.println();

		// 최종 처리 메서드인 forEach() 메서드로 각 요소를 반복 처리(looping)
		Arrays.stream(intArr)
			.forEach(number -> System.out.println(number));
	}
}
