package part03.ch13.sec05.와일드카드_타입파라미터;

import part02.ch08.sec10.타입변환.자동타입변환.A;

public class GenericExample {
	public static void main(String[] args) {
		// 모든사람이 신청 가능
		Course.registerCourse1(new Applicant<>(new Person()));
		Course.registerCourse1(new Applicant<>(new Worker()));
		Course.registerCourse1(new Applicant<>(new Student()));
		Course.registerCourse1(new Applicant<>(new HighStudent()));
		Course.registerCourse1(new Applicant<>(new MiddleStudent()));
		System.out.println();

		// 학생만 등록가능
		Course.registerCourse2(new Applicant<>(new Student()));
		Course.registerCourse2(new Applicant<>(new HighStudent()));
		Course.registerCourse2(new Applicant<>(new MiddleStudent()));
		// Course.registerCourse2(new Applicant<>(new Person())); // Student 클래스와 그의 자식 클래스만 신청 가능
		System.out.println();

		// 직장인과 일반인만 등록가능
		Course.registerCourse3(new Applicant<>(new Worker()));
		Course.registerCourse3(new Applicant<>(new Person()));
		Course.registerCourse3(new Applicant<>(new Intern())); // Worker 클래스의 자식 클래스인 Intern 클래스도 Worker 클래스에 속하기 때문에 와일드카드로 대체 가능하다.
		Course.registerCourse3(new Applicant<>(new Object())); // Worker 클래스의 조상 클래스로도 대체 가능

	}
}
