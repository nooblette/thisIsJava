package part02.ch11.sec02.예외처리코드;

public class ExceptionHandlingExample3 {
	public static void main(String[] args){
		try{
			// forName() : ClassPath 위치에서 매개변수로 주어진 클래스의 위치를 찾는다.
			Class.forName("java.lang.String");
			System.out.println("java.lang.String 클래스가 존재합니다.");
		} catch (ClassNotFoundException e){
			// Class.forName() 메서드는 매개변수로 주어진 클래스의 위치를 찾지 못하면 ClassNofFoundException 일반 에외가 발생하며,
			// 일반 예외이기 때문에 컴파일러는 이 예외에 대한 예외 처리 코드 존재 여부를 검사한다.
			e.printStackTrace();
		}
	}
}
