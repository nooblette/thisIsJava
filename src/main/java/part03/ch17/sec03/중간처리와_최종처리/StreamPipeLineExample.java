package part03.ch17.sec03.중간처리와_최종처리;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamPipeLineExample {
	public static void main(String[] args) {
		// Arrays의 asList 메서드를 호출하여 수정할 수 없는 List 컬렉션 객체 생성
		List<Student> studentList = Arrays.asList(
			new Student("홍길동", 10),
			new Student("신용권", 20),
			new Student("유미선", 30)
		);

		Stream<Student> studentStream = studentList.stream();
		IntStream scoreStream = studentStream.mapToInt(Student::getScore);
		double avg = scoreStream.average().getAsDouble();
		System.out.println("평균 계산 1 : " + avg);

		double avg2 = studentList.stream()
			.mapToInt(Student::getScore)
			.average()
			.getAsDouble();

		System.out.println("평균 계산 2 : " + avg2);
	}
}
