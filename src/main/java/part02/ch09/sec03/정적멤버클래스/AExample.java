package part02.ch09.sec03.정적멤버클래스;

public class AExample {
	public static void main(String[] args) {
		// OuterClassAccessModify 객체 생성 없이 정적 멤버 클래스 생성
		A.B b = new A.B();

		System.out.println(b.field1);
		System.out.println(A.B.field2);

		b.method1();
		A.B.method2();
	}
}
