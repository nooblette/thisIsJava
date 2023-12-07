package part03.ch17.sec10.요소기본집계;

import java.util.Arrays;

public class AggregateExample {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};

		// 2의 배수를 카운팅
		long count = Arrays.stream(arr)
			// 스트림 요소들 중 2의 배수만들 필터링하여 새로운 스트림 생성
			.filter(n -> n % 2 == 0)
			.count();
		System.out.println("2의 배수의 개수 : " + count);

		// 2의 배수의 총합
		long sum = Arrays.stream(arr)
			.filter(n -> n%2 == 0)
			.sum();
		System.out.println("2의 배수의 총합 : " + sum);

		// 2의 배수들의 평균
		double average = Arrays.stream(arr)
			.filter(n -> n % 2 == 0)
			.average()
			.getAsDouble();
		System.out.println("2의 배수의 총합 : " + average);

		// 최대값
		int max = Arrays.stream(arr)
			.max()
			.getAsInt();
		System.out.println("최대값 : " + max);

		// 최소값
		int min = Arrays.stream(arr)
			.min()
			.getAsInt();
		System.out.println("최소값 : " + min);

		// 첫번째 요소
		int first = Arrays.stream(arr)
			.findFirst()
			.getAsInt();
		System.out.println("첫번째 요소 : " + first);
	}
}
