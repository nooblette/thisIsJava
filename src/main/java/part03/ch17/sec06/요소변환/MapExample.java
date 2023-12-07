package part03.ch17.sec06.요소변환;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MapExample {
	public static void main(String[] args) {
		// List 컬렉션 생성
		List<Student> studentList = List.of(
			new Student("홍길동", 85),
			new Student("홍길동", 92),
			new Student("홍길동", 87)
		);

		// Student 컬렉션 리스트를 score 정수형 스트림으로 변환(mapping)
		Stream<Student> studentStream = studentList.stream();
		IntStream intStream = studentStream.mapToInt(student -> student.getScore());
		intStream.forEach(score -> System.out.println(score));
		System.out.println();

		// 메서드 체이닝으로 작성
		studentList.stream()
			.mapToInt(Student::getScore)
			.forEach(System.out::println);
	}
}
