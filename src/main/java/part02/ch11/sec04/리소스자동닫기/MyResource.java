package part02.ch11.sec04.리소스자동닫기;

public class MyResource implements AutoCloseable{
	private String name;

	public MyResource(String name){
		this.name = name;
		System.out.println("[MyResource(" + name + ") 열기]");
	}

	public String read1() {
		System.out.println("[MyResource(" + name + ") 읽기1]");
		return "100";
	}

	public String read2() {
		System.out.println("[MyResource(" + name + ") 읽기2]");
		return "abc";
	}

	@Override
	public void close(){
		// try-with-resources 구문으로 작성하면 리소스 사용 후 AutoCloseable 객체의 close() 메서드를 오버라이딩한 메서드가 호출된다.
		System.out.println("[MyResource(" + name + ") 닫기]");
	}
}
