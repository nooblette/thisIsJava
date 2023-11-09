package part02.ch06.sec13.접근제한자.package2;

import part02.ch06.sec13.접근제한자.package1.PublicAccessModifier;

public class ExternalClass {
	//DefaultAccessModifier defaultAccessModifier; // default 접근 제한을 갖는 클래스는 외부 패키지에서 접근 불가
	PublicAccessModifier publicAccessModifier; // public 접근 제한을 갖는 클래스는 제한 없이 접근 가능
}
