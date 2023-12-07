package part03.ch17.sec06.요소변환;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FlatMapExample {
	public static void main(String[] args) {
		// 문장 스트림을 단어 스트림으로 변환
		List<String> list1 = new ArrayList<>();
		list1.add("this is java");
		list1.add("I am a best developer");
		list1.stream()
			.flatMap(value -> Arrays.stream(value.split(" ")))
			.forEach(word -> System.out.println(word));
		System.out.println();

		// 문자열 숫자 목록을 숫자 스트림으로 변환
		String[] list2 = {"10, 20, 30, 40"};
		Stream<String> stringStream = Arrays.stream(list2);
		stringStream
			.flatMapToInt(value -> {
					Stream<String> stream = Arrays.stream(value.split(", "));
					return stream.mapToInt(Integer::parseInt);
				})
			.forEach(System.out::println);

	}
}
