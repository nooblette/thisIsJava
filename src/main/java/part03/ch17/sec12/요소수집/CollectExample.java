package part03.ch17.sec12.요소수집;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectExample {
	public static void main(String[] args) {
		List<Student> studentList = List.of(
			new Student("홍길동", "남", 92),
			new Student("김수영", "여", 87),
			new Student("김자바", "남", 95),
			new Student("오해영", "여", 93)
		);

		// 남학생 요소들만 필터링하여 List 컬렉션으로 반환
		List<Student> maleStudentList = studentList.stream()
			.filter(student -> "남".equals(student.getSex()))
			.toList();

		maleStudentList
			.forEach(student -> System.out.println(student.getName()));

		// 학생 요소들의 이름을 key로, 점수를 value로 갖는 Map 컬렉션으로 반환
		Map<String, Integer> map = studentList.stream()
			.collect(Collectors.toMap(
				Student::getName,
				Student::getScore
			));
		System.out.println(map);
	}
}
