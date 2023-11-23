package part02.ch11.sec02.예외처리코드;

public class ExceptionHandlingExample4 {
	public static void main(String[] args){
		try{
			// forName() : ClassPath 위치에서 매개변수로 주어진 클래스의 위치를 찾는다.
			Class.forName("java.lang.String2");
			System.out.println("java.lang.String 클래스가 존재합니다.");
		} catch (ClassNotFoundException e){
			e.printStackTrace();
		}
	}
}
