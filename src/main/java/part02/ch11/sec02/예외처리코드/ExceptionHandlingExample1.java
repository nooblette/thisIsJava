package part02.ch11.sec02.예외처리코드;

public class ExceptionHandlingExample1 {
	public static void printLength(String data) {
		int result = data.length(); // 문자열의 길이를 반환
		System.out.println("문자 수 : " + result);
	}
	public static void main(String[] args) {
		System.out.println("[프로그램 시작]");
		printLength("ThisIsJava");
		printLength(null);
		System.out.println("[프로그램 종료]");
	}
}
