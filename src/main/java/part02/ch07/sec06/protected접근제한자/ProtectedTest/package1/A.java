package part02.ch07.sec06.protected접근제한자.ProtectedTest.package1;

public class A {
	protected String protectedField;

	protected A(){
	}

	protected void protectedMethod(){
		System.out.println("protectedField : " + protectedField);
	}
}
