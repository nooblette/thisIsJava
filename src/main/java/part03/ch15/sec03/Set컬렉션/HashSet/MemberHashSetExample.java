package part03.ch15.sec03.Set컬렉션.HashSet;

import java.util.HashSet;
import java.util.Set;

public class MemberHashSetExample {
	public static void main(String[] args) {
		Set<Member> set = new HashSet<>();

		set.add(new Member("홍길동", 30));

		// Member의 hashCode()는 문자열 리터럴의 해시코드 + age를 반환하며, 이름과 나이가 같은 Member 객체는 동등한 Member 객체로 본다.
		set.add(new Member("홍길동", 30));

		System.out.println("저장된 객체 수 : " + set.size());
	}
}
