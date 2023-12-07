package part03.ch17.sec11.요소커스텀집계;

import java.util.ArrayList;
import java.util.List;

public class ReductionExample {
	public static void main(String[] args) {
		List<Student> studentList = new ArrayList<>();

		int sum1 = studentList.stream()
			.mapToInt(student -> student.getScore())
			.reduce(0, (a, b) -> a + b);
		System.out.println("sum1 : " + sum1);

		studentList.add(new Student("홍길동", 92));
		studentList.add(new Student("신용권", 95));
		studentList.add(new Student("김자바", 88));
		int sum2 = studentList.stream()
			.mapToInt(student -> student.getScore())
			.sum();
		System.out.println("sum2 : " + sum2);

		int sum3 = studentList.stream()
			.map(Student::getScore)
			.reduce(0, (a, b) -> a + b);
		System.out.println("sum3 : " + sum3);

	}
}
