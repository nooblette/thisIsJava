package part02.ch09.sec04.로컬클래스;

import part02.ch07.sec11.봉인된클래스.Person;

public class A {
	void useB(){
		// 로컬 변수
		String localField = "localField";

		// 로컬 클래스
		class B{
			int field1 = 1;
			static int field2 = 2;

			// 생성자
			B () {
				System.out.println("call Constructor of B");
			}

			void method1(){
				System.out.println("call method1");
				System.out.println(localField);

				// 로컬 변수의 값은 로컬 클래스에 수정할 수 없다.
				//localField = "changeValue";
			}

			static void method2(){
				System.out.println("call method2");
			}
		}
		// static 필드와 메서드 접근
		System.out.println(B.field2);
		B.method2();

		B b = new B(); // 로컬 객체 생성
		// 인스턴스 필드와 메서드 접근
		System.out.println(b.field1);
		b.method1();

		System.out.println(localField);
	}

	void useA(){
		//B.field2; // 로컬 클래스가 선언된 useB 메서드 외부에서는 로컬 클래스 B에 접근할 수 없다
	}
}
