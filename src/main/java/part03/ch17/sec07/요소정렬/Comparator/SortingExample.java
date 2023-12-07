package part03.ch17.sec07.요소정렬.Comparator;

import java.util.Comparator;
import java.util.List;

import part03.ch17.sec07.요소정렬.Comparable.Student;

public class SortingExample {
	public static void main(String[] args) {
		List<part03.ch17.sec07.요소정렬.Comparable.Student> studentList = List.of(
			new part03.ch17.sec07.요소정렬.Comparable.Student("홍길동", 30),
			new part03.ch17.sec07.요소정렬.Comparable.Student("신용권", 10),
			new Student("유미선", 20)
		);

		// 점수를 기준으로 Comparator 익명 객체를 전달하여 구현 요소를 오름차순 정렬한 스트림을 생성
		studentList
			.stream()
			.sorted((student1, student2) -> Integer.compare(student1.getScore(), student2.getScore()))
			.forEach(student -> System.out.println(student.getName() + ": " + student.getScore()));
		System.out.println();

		// 점수를 기준으로 Comparator 익명 객체를 전달하여 구현 요소를 내림차순 정렬한 스트림을 생성
		studentList
			.stream()
			// compare() 메서드의 매개변수 위치만 바꾸면 내림차순 정렬이 된다.
			.sorted((student1, student2) -> Integer.compare(student2.getScore(), student1.getScore()))
			.forEach(student -> System.out.println(student.getName() + ": " + student.getScore()));
	}
}
