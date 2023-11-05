package part02.ch05.sec5.문자열타입;

public class SubstringExample {
	public static void main(String[] args) {
		String ssn = "880815-1234567";
		String firstNum = ssn.substring(0, 6);
		String secondNum = ssn.substring(7);

		System.out.println(firstNum);
		System.out.println(secondNum);

		System.out.println(System.identityHashCode(ssn));
		System.out.println(System.identityHashCode(firstNum));
		System.out.println(System.identityHashCode(secondNum));
	}
}
