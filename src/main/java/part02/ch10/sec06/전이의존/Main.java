package part02.ch10.sec06.전이의존;

import package1.A;
import package3.C;

public class Main {
	public static void main(String[] args) {
		// thisIsJava_module_a 모듈에 포함된 A 클래스의 method 호출
		A a = new A();
		a.method();

		C c = new C();
		c.method();

		C result = a.getC();
		result.method();
	}
}
