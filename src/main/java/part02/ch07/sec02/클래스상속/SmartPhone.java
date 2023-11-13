package part02.ch07.sec02.클래스상속;

public class SmartPhone extends Phone{
	public boolean wifi;

	// 생성자
	public SmartPhone(String model, String color){
		// PhoneWithDefaultConstructor(부모 객체)로부터 상속받은 필드
		this.model = model;
		this.color = color;
	}

	public void setWifi(boolean wifi){
		this.wifi = wifi;
		System.out.println("와이파이 상태 변경");
	}

	public void internet(){
		System.out.println("인터넷에 연결합니다.");
	}
}
