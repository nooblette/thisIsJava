package part02.ch06.sec13.접근제한자.package2;

import part02.ch06.sec13.접근제한자.package1.ConstructorAccessModifier;

public class AnotherClassConstructorAccessModifier {
	// 필드 선언
	ConstructorAccessModifier c1 = new ConstructorAccessModifier(true);
	//ConstructorAccessModifier c2 = new ConstructorAccessModifier(); // default 접근 제한 생성자는 호출 불가(다른 패키지)
	// ConstructorAccessModifier c3 = new ConstructorAccessModifier("private"); // private 접근 제한 생성자도 호출 불가
}
