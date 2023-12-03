package part03.ch15.sec03.Set컬렉션.HashSet;

import java.util.HashSet;
import java.util.Set;

public class StringHashSetExample {
	public static void main(String[] args) {
		// HashSet 컬렉션 생성
		Set<String> stringSet = new HashSet<>();

		// 객체 저장
		stringSet.add("java");
		stringSet.add("JDBC");
		stringSet.add("java"); // 동등 객체는 HashSet에 저장하지 않는다(String 클래스는 문자열리터럴이 동일한 경우 힙 메모리상 주소가 같은 객체를 참조한다.)
		stringSet.add("mybatis");

		// 저장된 객체 수 출력
		System.out.println("저장된 객체 수 : " + stringSet.size());
	}
}
