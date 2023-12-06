package part03.ch17.sec02.내부반복자;

import java.util.List;
import java.util.stream.Stream;

public class ParallelStreamExample {
	public static void main(String[] args) {
		// List 컬렉션 생성
		List<String> list = List.of("홍길동", "신용권", "김자바", "람다식", "박병렬");

		// parallelStream() 메서드를 호출하여 병렬 처리 스트림 객체를 얻는다.
		Stream<String> parallelString = list.parallelStream();

		// 병렬 처리 스트림 객체로부터 처리 방법을 lambda expression으로 작성한다.
		parallelString.forEach(name -> {
			System.out.println(name + ": " + Thread.currentThread().getName());
		});
	}
}