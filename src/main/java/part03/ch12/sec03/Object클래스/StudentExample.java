package part03.ch12.sec03.Object클래스;

public class StudentExample {
	public static void main(String[] args) {
		Student s1 = new Student(1, "홍길동");
		Student s2 = new Student(1, "홍길동");

		if(s1.hashCode() == s2.hashCode()){
			if(s1.equals(s2)){
				System.out.println("student1과 student2는 동등객체입니다.");
			} else {
				System.out.println("student1과 student2는 no 혹은 name이 달라 동등객체가 아닙니다.");
			}
		} else {
			System.out.println("student1과 student2는 해시코드가 달라 동등객체가 아닙니다.");
		}

		Student s3 = new Student(1,"이자바");

		if(s1.hashCode() == s3.hashCode()){
			if(s1.equals(s3)){
				System.out.println("student1과 student3은 동등객체입니다.");
			} else {
				System.out.println("student1과 student3은 no 혹은 name이 달라 동등객체가 아닙니다.");
			}
		} else {
			System.out.println("student1과 student3은 해시코드가 달라 동등객체가 아닙니다.");
		}
	}

}
