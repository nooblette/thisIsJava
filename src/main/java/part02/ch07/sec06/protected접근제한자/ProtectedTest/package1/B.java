package part02.ch07.sec06.protected접근제한자.ProtectedTest.package1;

public class B {
	public void method(){
		A a = new A(); // protected 레벨이므로 생성자 호출 가능
		a.protectedField = "value"; // protected 레벨이므로 변수 호출 가능
		a.protectedMethod(); // protected 레벨이므로 메서드 호출 가능
	}
}
