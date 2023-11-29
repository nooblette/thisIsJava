package part03.ch12.sec11.리플렉션;

public class GetClassExample {
	public static void main(String[] args) throws ClassNotFoundException {
		// 아래 3가지 방법 모두 동일한 clazz 객체를 반환
		Class clazz = Car.class;										// 방법 1
		// clazz = Class.forName("part03.ch12.sec11.리플렉션.Car"); // 방법 2
		//
		// Car car = new Car();
		// clazz = car.getClass();											// 방법 3

		System.out.println("패키지 경로 : " + clazz.getPackageName());
		System.out.println("클래스 간단 이름(패키지 경로 제외) : " + clazz.getSimpleName());
		System.out.println("클래스 전체 이름(패키지 경로 포함) : " + clazz.getName());
	}
}
