package part02.ch11.sec02.예외처리코드;

public class ExceptionHandlingExample2 {
	public static void printLength(String data) {
		try{
			int result = data.length(); // 문자열의 길이를 반환
			System.out.println("문자 수 : " + result);
		} catch(NullPointerException e){
			//System.out.println(e.getMessage());
			//System.out.println(e.toString());
			e.printStackTrace();
		} finally {
			System.out.println("printLength 메서드 종료");
		}
	}
	public static void main(String[] args) {
		System.out.println("[프로그램 시작]");
		printLength("ThisIsJava");
		printLength(null);
		System.out.println("[프로그램 종료]");
	}
}
