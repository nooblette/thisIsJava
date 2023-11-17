package part02.ch09.sec02.인스턴스멤버클래스;

public class A {
	// 인스턴스 멤버 클래스
	class B {
		// 인스턴스 필드 선언
		int instanceFieldOfNestedClassB = 1;

		// 정적 필드 선언
		static int staticFieldOfNestedClassB = 2;

		// 생성자
		B(){
			System.out.println("B의 생성자 실행");
		}

		// 인스턴스 메서드
		void instanceMethodOfNestedClassB(){
			System.out.println("instanceMethodOfNestedClassB() 호출");
		}

		// 정적 메서드
		static void staticMethodOfNestedClassB(){
			System.out.println("staticMethodOfNestedClassB() 호출");
		}
	}

	// 인스턴스 필드 값으로 B 객체 대입
	B field = new B();

	// 생성자
	A (){
		System.out.println("A의 생성자 호출");
		B b = new B(); // class A의 생성자에서 B 객체 생성
		System.out.println("A의 생성자 호출 종료");
	}

	// 인스턴스 메서드에서 B 객체 생성
	void method(){
		B b= new B();
	}

	void useB(){
		B b = new B();
		System.out.println(b.instanceFieldOfNestedClassB);
		System.out.println(B.staticFieldOfNestedClassB);

		b.instanceMethodOfNestedClassB();
		B.staticMethodOfNestedClassB();
	}
}
