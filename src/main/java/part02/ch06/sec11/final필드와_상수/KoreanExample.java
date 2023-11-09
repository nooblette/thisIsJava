package part02.ch06.sec11.final필드와_상수;

public class KoreanExample {
	public static void main(String[] args) {
		Korean k1 = new Korean("123456-1234567", "김자바");

		System.out.println(k1.nation);
		System.out.println(k1.ssn);
		System.out.println(k1.name);

		// final 키워드로 선언된 값 변경시 컴파일 에러 발생
		// k1.nation = "미국";

		// 비 final 변수는 값 변경 가능
		k1.name = "박자바";
		System.out.println(k1.name);
	}
}
