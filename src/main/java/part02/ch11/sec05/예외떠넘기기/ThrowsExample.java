package part02.ch11.sec05.예외떠넘기기;

public class ThrowsExample {
	public static void main(String[] args) {
		try {
			findClass();
		} catch (ClassNotFoundException e){
			System.out.println("main() 메서드에서 처리 : " + e.getMessage());
		}
	}

	// findClass() 메서드에서 발생한 ClassNotFoundException 예외는 이 메서드를 호출한 곳으로 떠넘긴다.
	public static void findClass() throws ClassNotFoundException{
		try {
			Class.forName("java.lang.String2");
			String[] strings = {"str"};
			String string = strings[1];
		} catch (ArrayIndexOutOfBoundsException e){
			System.out.println("findClass() 메서드에서 처리 : " + e.getMessage());
		}
	}
}

