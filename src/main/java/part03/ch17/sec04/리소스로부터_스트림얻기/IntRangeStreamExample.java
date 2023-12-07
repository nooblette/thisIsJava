package part03.ch17.sec04.리소스로부터_스트림얻기;

import java.util.stream.IntStream;

public class IntRangeStreamExample {
	public static int sum;

	public static void main(String[] args) {
		IntStream intStream = IntStream.rangeClosed(1, 100);
		intStream.forEach(number -> sum += number);
		System.out.println("총합 : " + sum);

	}
}
