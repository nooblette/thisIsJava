package part02.ch08.sec10.타입변환.자동타입변환;

public class PromotionExample {
	public static void main(String[] args) {
		// 구현 객체 생성
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		e.methodA();
		e.methodC();
		System.out.println();

		// 인터페이스 변수로 형 변환
		A a;
		a = b;
		a = c;
		a = d;
		a = e;
		a.methodA();
		//a.methodC(); // 구현 객체에만 존재하는 메서드는 호출할 수 없다.
	}
}
