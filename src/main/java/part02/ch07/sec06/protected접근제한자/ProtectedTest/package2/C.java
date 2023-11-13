package part02.ch07.sec06.protected접근제한자.ProtectedTest.package2;

import part02.ch07.sec06.protected접근제한자.ProtectedTest.package1.A;

public class C {
	public void emthod(){
		A a; // 클래스 자체는 public 접근 제한 수즌으로 선언되어있어 접근 가능

		/*
		a = new A(); // 생성자는 protected 레벨로 선언되어 있어 호출 불가
		a.protectedField = "value"; // 필드도 protected 레벨로 선언되어 있어 호출 불가(정확히는 인스턴스가 없으므로 호출 불가능)
		a.protectedMethod(); // 메서드도 protected 레벨로 선언되어 있어 호출 불가(정확히는 인스턴스가 없으므로 호출 불가능)
		 */

	}
}
