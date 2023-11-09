package part02.ch06.sec13.접근제한자.package1;

public class AnotherConstructorAccessModifier {
	// 필드 선언
	ConstructorAccessModifier c1 = new ConstructorAccessModifier(true);
	ConstructorAccessModifier c2 = new ConstructorAccessModifier();
	// ConstructorAccessModifier c3 = new ConstructorAccessModifier("private"); // private 접근 제한 생성자는 호출 불가
}
