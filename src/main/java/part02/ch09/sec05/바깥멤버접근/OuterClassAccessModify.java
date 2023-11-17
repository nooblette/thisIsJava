package part02.ch09.sec05.바깥멤버접근;

public class OuterClassAccessModify {
	int field1;
	void method1(){}

	static int field2;
	static void method2(){}

	// 인스턴스 멤버 클래스
	class B {
		void method(){
			System.out.println(field1);
			method1();

			System.out.println(field2);
			method2();
		}
	}
	// 정적 멤버 클래스
	static class C {
		void method(){

			// 바깥 클래스의 인스턴스 멤버에는 접근 불가
			// System.out.println(field1);
			// method1();

			// 정적 메서드만 접근 가능
			System.out.println(field2);
			method2();
		}
	}
}
