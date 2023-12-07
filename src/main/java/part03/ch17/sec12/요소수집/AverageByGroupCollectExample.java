package part03.ch17.sec12.요소수집;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AverageByGroupCollectExample {
	public static void main(String[] args) {
		List<Student> studentList = List.of(
			new Student("홍길동", "남", 92),
			new Student("김수영", "여", 87),
			new Student("김자바", "남", 95),
			new Student("오해영", "여", 93)
		);

		Map<String, Double> averageScoreBySex = studentList.stream()
			.collect(Collectors.groupingBy(
				student -> student.getSex(),
				Collectors.averagingDouble(student -> student.getScore())
			));

		System.out.println(averageScoreBySex);
	}
}
