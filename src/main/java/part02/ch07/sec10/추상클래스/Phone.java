package part02.ch07.sec10.추상클래스;

public abstract class Phone {
	// 필드 선언
	String owner;

	// 생성자 선언
	Phone(String owner){
		this.owner = owner;
	}

	// 메서드 선언
	void turnOn(){
		System.out.println("핸드폰 전원을 켭니다.");
	}
	void turnOff() {
		System.out.println("핸드폰 전원을 종료합니다.");
	}
}
