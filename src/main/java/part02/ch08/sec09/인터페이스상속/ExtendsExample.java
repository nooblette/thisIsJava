package part02.ch08.sec09.인터페이스상속;

public class ExtendsExample {
	public static void main(String[] args) {
		InterfaceCImpl impl = new InterfaceCImpl();

		InterfaceA ia = impl;
		ia.methodA();
		//ia.methodB(); // 다른 부모 인터페이스에 선언된 추상 메서드는 호출할 수 없다.
		//ia.methodC(); // 자식 인터페이스에 선언된 추상 메서드는 호출할 수 없다.

		InterfaceB ib = impl;
		ib.methodB();
		//ib.methodA(); // 다른 부모 인터페이스에 선언된 추상 메서드는 호출할 수 없다.
		//ib.methodC(); // 자식 인터페이스에 선언된 추상 메서드는 호출할 수 없다.

		InterfaceC ic = impl;
		// 자식 인터페이스와 부모 인터페이스에 선언된 모든 추상 메서드를 호출할 수 있다.
		ic.methodA();
		ic.methodB();
		ic.methodC();
	}
}
