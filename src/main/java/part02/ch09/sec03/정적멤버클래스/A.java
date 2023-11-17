package part02.ch09.sec03.정적멤버클래스;

public class A {
	// 정적 멤버 클래스
	static class B{
		int field1 = 1;
		static int field2 = 2;

		B(){
			System.out.println("call constructor of B");
		}

		void method1(){
			System.out.println("call method1");
		}

		static void method2(){
			System.out.println("call method2");
		}
	}

	// 인스턴스 필드 값으로 B 객체 대입
	B field1 = new B();

	// 정적 필드 값으로 B 객체 대입
	static B field2 = new B();

	// 생성자
	A(){
		B b = new B();
	}

	// 인스턴스 메서드
	void method1(){
		B b = new B();
	}

	// 정적 메서드
	static void method2(){
		B b = new B();
	}
}
