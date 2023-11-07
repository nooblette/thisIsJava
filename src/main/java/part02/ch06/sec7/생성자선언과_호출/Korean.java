package part02.ch06.sec7.생성자선언과_호출;

public class Korean{
	// 필드 선언
	String nation = "대한민국";
	String name;
	String ssn;

	// 생성자 선언
	public Korean(String name, String ssn){
		this.name = name;
		this.ssn = ssn;
	}
}