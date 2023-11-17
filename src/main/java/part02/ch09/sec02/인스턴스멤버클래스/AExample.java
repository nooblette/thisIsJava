package part02.ch09.sec02.인스턴스멤버클래스;

public class AExample {
	public static void main(String[] args) {
		// OuterClassAccessModify 객체 생성
		A a = new A();

		// B 객체 생성
		A.B b = a.field;

		a.useB();
	}
}
