package part03.ch17.sec10.요소기본집계;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class OptionalExample {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();

		// Exception in thread "main" java.util.NoSuchElementException: No value present 예외 발생
		// double average = list.stream()
		// 	.mapToInt(Integer::intValue)
		// 	.average()
		// 	.getAsDouble();

		// 방법 1 : ifPresent().
		OptionalDouble optionalDouble = list.stream()
			.mapToInt(Integer::intValue)
			.average();

		if(optionalDouble.isPresent()){
			System.out.println("평균 : " + optionalDouble.getAsDouble());
		} else {
			System.out.println("평균 : 0.0");
		}

		// 방법 2 : orElse()
		double doubleAverage = list.stream()
			.mapToInt(Integer::intValue)
			.average()
			.orElse(0.0);


		System.out.println("평균 : " + doubleAverage);

		// 방법 3 : ifPresent(Consumer<T>)
		list.stream()
			.mapToInt(Integer::intValue)
			.average()
			.ifPresent(average -> System.out.println("평균 : " + average));
	}
}
