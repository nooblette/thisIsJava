package part03.ch17.sec12.요소수집;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingCollectExample {
	public static void main(String[] args) {
		List<Student> studentList = List.of(
			new Student("홍길동", "남", 92),
			new Student("김수영", "여", 87),
			new Student("김자바", "남", 95),
			new Student("오해영", "여", 93)
		);

		// 성별을 key로, List<Student>를 value로 갖는 Map 객체로 Groupping
		Map<String, List<Student>> map = studentList.stream()
			.collect(Collectors.groupingBy(student -> {
				return student.getSex(); // grouping 기준값(Map 객체 에서 Key 로 쓰일 값)을 반환
			}));

		List<Student> maleStudentList = map.get("남");
		maleStudentList.forEach(
			student -> System.out.println(student.getName())
		);
		System.out.println();

		List<Student> femaleStudentList = map.get("여");
		femaleStudentList.forEach(
			student -> System.out.println(student.getName())
		);

	}
}
