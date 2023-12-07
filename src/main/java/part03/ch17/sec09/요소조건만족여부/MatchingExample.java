package part03.ch17.sec09.요소조건만족여부;

import java.util.Arrays;

public class MatchingExample {
	public static void main(String[] args) {
		int[] intArr = {2, 4, 6};

		// 모든 요소가 2의 배수인지 검사
		boolean result = Arrays.stream(intArr)
			.allMatch(number -> number % 2 == 0);
		System.out.println("모든 요소가 2의 배수인가 ? : " + result);

		// 요소중 하나라도 3의 배수가 존재하는지 검사
		result = Arrays.stream(intArr)
			.anyMatch(number -> number % 3 == 0);
		System.out.println("최소 하나의 요소가 3의 배수인가 ? : " + result);

		// 모든 요소가 3의 배수가 아닌지 검사
		result = Arrays.stream(intArr)
			.noneMatch(number -> number % 3 == 0);
		System.out.println("모든 요소가 3의 배수가 아닌가 ? : " + result);
	}
}
