package part02.ch07.sec06.protected접근제한자.ProtectedTest.package2;

import part02.ch07.sec06.protected접근제한자.ProtectedTest.package1.A;

public class D extends A{
	public D(){
		super(); // A 생성자 호출(상속을 통해서만 호출 가능)
	}
	public void method1(){
		this.protectedField = "value"; // A 필드값 변경, protected 접근 제한 레벨이므로 변수 호출 가능
		this.protectedMethod(); // A 메서드 호출, protected 접근 제한 레벨이므로 메서드 호출 가능
	}

	public void method2(){
		//A a = new A(); // 직접 객체 생성은 불가(다른 패키지에 속하는 protected 레벨로 선언된 생성자 호출은 불가능하다)
	}
}
