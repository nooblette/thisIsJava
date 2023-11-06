package part02.ch06.sec4.객체생성과_클래스변수;

public class StudentExample { // 실행 클래스 (main 메서드를 갖는다)
	public static void main(String[] args) {
		Student s1 = new Student();
		System.out.println("s1 변수가 Student 객체를 참조합니다.");

		Student s2 = new Student();
		System.out.println("s2 변수가 Student 객체를 참조합니다.");
	}
}
