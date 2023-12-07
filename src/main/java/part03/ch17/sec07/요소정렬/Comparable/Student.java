package part03.ch17.sec07.요소정렬.Comparable;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Student implements Comparable<Student> {
	private String name;
	private int score;

	@Override
	public int compareTo(Student o) {
		/* 점수기준으로 오름차순 정렬
		* 	1. score == o.score : return 0
		* 	2. score < o.score : return -1
		* 	3. score > o.score : return 1
		* */
		return Integer.compare(score, o.score);
	}
}
