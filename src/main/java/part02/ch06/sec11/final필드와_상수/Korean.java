package part02.ch06.sec11.final필드와_상수;

public class Korean {
	// final instance field 선언
	final String nation = "대한민국";
	final String ssn;

	// instance field 선언
	String name;

	// 생성자
	public Korean(String ssn, String name){
		this.ssn = ssn;
		this.name = name;
	}
}
