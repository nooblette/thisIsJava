package part02.ch08.sec07.private메서드;

public interface Service {
	// 디폴트 메서드
	default void defaultMethod1() {
		System.out.println("defaultMethod1 메서드");
		commonPrivateMethod();
	}

	default void defaultMethod2() {
		System.out.println("defaultMethod2 메서드");
		commonPrivateMethod();
	}

	private void commonPrivateMethod(){
		System.out.println("commonPrivateMethod");
	}

	// 정적 메서드
	static void defaultStaticMethod1() {
		System.out.println("defaultStaticMethod1 메서드");
		commonPrivateStaticMethod();
	}

	static void defaultStaticMethod2() {
		System.out.println("defaultStaticMethod2 메서드");
		commonPrivateStaticMethod();
	}

	private static void commonPrivateStaticMethod(){
		System.out.println("commonPrivateStaticMethod");
	}
}
