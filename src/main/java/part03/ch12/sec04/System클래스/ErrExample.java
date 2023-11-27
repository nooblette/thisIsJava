package part03.ch12.sec04.System클래스;

public class ErrExample {
	public static void main(String[] args) {
		try{
			Integer.parseInt("java");
		} catch (NumberFormatException e){
			System.err.println("[에러내용]");
			System.err.println(e.getMessage());
		}
	}
}
