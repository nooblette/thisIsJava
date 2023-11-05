package part02.ch05.sec8.객체를_참조하는_배열;

public class ArrayReferenceObjectExample {
	public static void main(String[] args) {
		String[] languages = new String[3];
		languages[0] = "Java";
		languages[1] = "Java";
		languages[2] = new String("Java");

		System.out.println(languages[0] == languages[1]);      // true : 같은 Java 리터럴을 갖는 객체를 참조
		System.out.println(languages[0] == languages[2]);      // false : 다른 Java 리터럴을 갖는 객체를 참조
		System.out.println(languages[0].equals(languages[2])); // true : 동일한 문자열 리터럴를 가짐
	}
}
