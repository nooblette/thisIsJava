package part03.ch12.sec05.문자열클래스;

public class StringBuilderExample {
	public static void main(String[] args) {
		String data = new StringBuilder()
			.append("DEF")
			.insert(0, "ABC")
			.delete(3, 4)
			.toString();

		System.out.println(data);
	}


}
