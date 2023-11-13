package part02.ch07.sec07.타입변환.promotion1;

public class PromotionExample {
	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();

		A a1 = b; // 자동 형변환 가능
		A a2 = c; // 자동 형변환 가능
		A a3 = d; // 자동 형변환 가능
		A a4 = e; // 자동 형변환 가능

		// B b1 = e; // 컴파일 에러(상속 관게가 아니다)
		// C c1 = d; // 컴파일 에러(상속 관게가 아니다)
	}
}
