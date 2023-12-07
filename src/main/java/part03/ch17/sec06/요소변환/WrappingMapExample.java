package part03.ch17.sec06.요소변환;

import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class WrappingMapExample {
	public static void main(String[] args) {
		int[] intArray = {1, 2, 3, 4, 5};

		// int 배열을 IntStream으로 변환
		IntStream intStream = Arrays.stream(intArray);
		intStream.forEach(value -> System.out.println(value));
		System.out.println();

		// IntStream을 Double Stream으로 변환
		DoubleStream doubleStream = Arrays.stream(intArray).asDoubleStream();
		doubleStream.forEach(value -> System.out.println(value));
		System.out.println();

		Arrays.stream(intArray)
			.boxed()
			.forEach(object -> System.out.println(object.intValue()));
	}
}
