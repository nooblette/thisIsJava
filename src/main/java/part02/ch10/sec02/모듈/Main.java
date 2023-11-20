package part02.ch10.sec02.모듈;

import package1.A;
import package2.B;
import package3.C;
import package4.D;

public class Main {
	public static void main(String[] args) {
		// thisIsJava_module_a 모듈에 포함된 A 클래스의 method 호출
		A a = new A();
		a.method();

		// thisIsJava_module_a 모듈에 포함된 B 클래스의 method 호출
		B b = new B();
		b.method();

		// thisIsJava_module_b 모듈에 포함된 C 클래스의 method 호출
		C c = new C();
		c.method();

		// thisIsJava_module_b 모듈에 포함된 C 클래스의 method 호출
		D d = new D();
		d.method();
	}
}
