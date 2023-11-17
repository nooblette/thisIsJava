package part02.ch09.sec05.바깥멤버접근;

public class OuterClassObjectReference {
	int field1;
	void method1(){
		System.out.println("call method1");
	}
	// 인스턴스 멤버 클래스
	class InstanceMemberClass {
		int field2;
		void method2(){
			System.out.println("call method2");
		}

		void callMethod1AndMethod2(){
			OuterClassObjectReference.this.method1();
			this.method2();
		}
	}

	void useB(){
		InstanceMemberClass instanceMemberClass = new InstanceMemberClass();
		instanceMemberClass.callMethod1AndMethod2();
	}
}
