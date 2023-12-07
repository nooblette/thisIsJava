package part03.ch17.sec07.요소정렬.Comparable;

import java.util.Comparator;
import java.util.List;

public class SortingExample {
	public static void main(String[] args) {
		List<Student> studentList = List.of(
			new Student("홍길동", 30),
			new Student("신용권", 10),
			new Student("유미선", 20)
		);

		// 점수를 기준으로 Comparable 구현 요소를 오름차순 정렬한 스트림을 생성
		studentList
			.stream()
			.sorted()
			.forEach(student -> System.out.println(student.getName() + ": " + student.getScore()));
		System.out.println();

		// 점수를 기준으로 Comparable 구현 요소를 내림차순 정렬한 스트림을 생성
		studentList
			.stream()
			.sorted(Comparator.reverseOrder())
			.forEach(student -> System.out.println(student.getName() + ": " + student.getScore()));
	}
}
