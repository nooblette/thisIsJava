package part03.ch17.sec05.요소걸러내기;

import java.util.ArrayList;
import java.util.List;

public class FilteringExample {
	public static void main(String[] args) {
		// List 컬렉션 생성
		List<String> list = new ArrayList<>();
		list.add("홍길동");
		list.add("신용권");
		list.add("김자바");
		list.add("신용권");
		list.add("신민철");

		// 중복 요소 걸러내기
		list.stream()
			.distinct()
			.forEach(name -> System.out.println(name));
		System.out.println();

		// "신"으로 시작하는 요소로 필터링
		list.stream()
			.filter(name -> name.startsWith("신"))
			.forEach(name -> System.out.println(name));
		System.out.println();

		// 메서드 체이닝으로 중복 제거 후 "신"으로 시작하는 요소로 필터링
		list.stream()
			.distinct()
			.filter(name -> name.startsWith("신"))
			.forEach(name -> System.out.println(name));
	}
}
