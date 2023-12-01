package part03.ch13.sec05.와일드카드_타입파라미터;

public class Course {
	// Courser1은 모든 사람이 등록 가능
	public static void registerCourse1(Applicant<?> applicant){
		System.out.println(applicant.kind.getClass().getSimpleName() + "이(가) Course1을 등록함");
	}

	// Course2는 학생만 등록가능
	public static void registerCourse2(Applicant<? extends Student> applicant){
		System.out.println(applicant.kind.getClass().getSimpleName() + "이(가) Course2를 등록함");
	}

	// Course3은 직장인과 일반인만 등록가능
	public static void registerCourse3(Applicant<? super Worker> applicant){
		System.out.println(applicant.kind.getClass().getSimpleName() + "이(가) Course3을 등록함");
	}
}
