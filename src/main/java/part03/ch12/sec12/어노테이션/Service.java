package part03.ch12.sec12.어노테이션;

public class Service {
	//@PrintAnnotation // @Target 어노테이션으로 지정하지 않은 필드에는 어노테이션 적용 불가
	private String field;
	@PrintAnnotation
	public void method1(){
		System.out.println("실행 내용1");
	}

	@PrintAnnotation("*")
	public void method2(){
		System.out.println("실행 내용1");
	}

	@PrintAnnotation(value="#", number=20)
	public void method3(){
		System.out.println("실행 내용1");
	}
}
