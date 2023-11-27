package part03.ch12.sec03.Object클래스;

public class SmartPhone {
	private String company;
	private String os;

	public SmartPhone(String company, String os){
		this.company = company;
		this.os = os;
	}

	public String getCompany(){
		return company;
	}

	@Override
	public String toString(){
		// SmartPhone 클래스는 Object 클래스의 toString 메서드를 재정의
		return company + ", " + os;
	}
}
