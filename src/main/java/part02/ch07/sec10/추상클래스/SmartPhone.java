package part02.ch07.sec10.추상클래스;

public class SmartPhone extends Phone{
	// 생성자 선언
	public SmartPhone(String owner){
		// 부모 클래스의 생성자 호출
		super(owner);
	}

	// 메서드 선언
	void internet(){
		System.out.println("인터넷 검색을 합니다.");
	}
}
