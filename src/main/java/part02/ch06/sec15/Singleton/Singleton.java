package part02.ch06.sec15.Singleton;

public class Singleton {
	// private 접근 권한을 갖는 정적 필드 선언과 초기화
	private static Singleton singleton = new Singleton();

	// private 접근 권한을 갖는 생성자 선언(**싱글톤 패턴의 핵심**)
	private Singleton(){}

	// public 접근 권한을 갖는 싱글톤 객체 반환 메서드(외부에서 싱글톤 객체를 간접적으로 참조할 수 있는 유일한 방법)
	public static Singleton getInstance(){
		return singleton;
	}

}
