package part02.ch07.sec09.객체타입확인;

public class Student extends Person{
	public int studentNo;

	public Student(String name, int studnetNo){
		super(name);
		this.studentNo = studnetNo;
	}

	public void study(){
		System.out.println("공부합니다.");
	}
}
