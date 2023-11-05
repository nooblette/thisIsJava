package part02.ch05.sec5.문자열타입;

public class EqualsExample {
	public static void main(String[] args) {
		String str1 = "홍길동";
		String str2 = "홍길동";

		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));

		String str3 = new String("홍길동");
		String str4 = new String("홍길동");

		System.out.println(str3 == str4);
		System.out.println(str3.equals(str4));
	}
}
