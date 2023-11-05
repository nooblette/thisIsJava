package part02.ch05.sec5.문자열타입;

public class ReplaceExample {
	public static void main(String[] args) {
		String oldStr = "자바 프로그래밍";
		String newStr = oldStr.replace("자바", "JAVA");

		// oldStr와 newStr 참조 변수는 서로 다른 힙 메모리 주소를 참조
		System.out.println(System.identityHashCode(oldStr));
		System.out.println(System.identityHashCode(newStr));
	}
}
