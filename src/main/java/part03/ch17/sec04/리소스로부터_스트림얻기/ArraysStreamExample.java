package part03.ch17.sec04.리소스로부터_스트림얻기;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArraysStreamExample {
	public static void main(String[] args) {
		String[] strings = {"홍길동", "신용권", "김이나"};
		Stream<String> stringStream = Arrays.stream(strings);
		stringStream.forEach(item -> System.out.print(item + ", "));
		System.out.println();

		int[] ints = {1, 2, 3, 4, 5};
		IntStream intStream = Arrays.stream(ints);
		intStream.forEach(item -> System.out.print(item + ", "));
		System.out.println();

	}
}
