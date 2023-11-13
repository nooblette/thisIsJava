package part02.ch07.sec07.타입변환.promotion2;

public class Child extends Parent{

	// 메서드 오버라이딩
	@Override
	public void method2(){
		System.out.println("Child - method2() call");
	}

	// 자식 클래스만의 메서드 정의
	public void method3(){
		System.out.println("Child - method3() call");
	}

}
