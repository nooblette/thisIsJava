package part02.ch06.sec13.접근제한자.package1;

public class ConstructorAccessModifier {
	// 필드 선언
	ConstructorAccessModifier c1 = new ConstructorAccessModifier(true);
	ConstructorAccessModifier c2 = new ConstructorAccessModifier();
	ConstructorAccessModifier c3 = new ConstructorAccessModifier("private");


	// public 접근 제한 생성자 선언
	public ConstructorAccessModifier(boolean b){
	}

	// default 접근 제한 생성자 선언
	ConstructorAccessModifier(){
	}

	// private 접근 제한 생성자 선언
	private ConstructorAccessModifier(String s){
	}
}
