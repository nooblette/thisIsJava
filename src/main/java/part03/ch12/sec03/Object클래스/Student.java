package part03.ch12.sec03.Object클래스;

public class Student {
	private int no;
	private String name;

	public Student(int no, String name){
		this.no = no;
		this.name = name;
	}

	public int getNo(){return no;}
	public String getName(){return name;}

	// hashCode를 주석처리할 경우, Object 클래스에서 제공하는 hashCode()를 그대로 사용하며 객체마다 모두 다른 hashCode 값을 반환한다.
	// @Override
	// public int hashCode(){
	// 	// Student 객체의 해시코드는 no와 name의 해시코드의 결합으로 재정의(Overriding)
	// 	// 번호와 이름이 같으면 동일한 해시코드가 생성된다.
	// 	return no + name.hashCode();
	// }

	@Override
	public boolean equals(Object object){
		// Student 객체는 no와 getName이 동일하면 동등객체로 판단
		if(object instanceof Student student){
			return no == student.getNo() && name.equals(student.getName());
		}
		return false;
	}
}
