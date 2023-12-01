package part03.ch13.sec02.제네릭타입.클래스;

public class GenericExample {
	public static void main(String[] args) {
		// 타입 파라미터 K는 TV 클래스로, M은 String 클래스로 대체
		Product<TV, String> product1 = new Product<>(); // 객체 선언과 사용시 동일한 타입으로 타입 파라미터를 대체하는 경우, 생성자의 대체 타입은 생략 가능

		// Setter 메서드의 매개변수는 반드시 TV와 String 클래스를 제공한다.
		product1.setKind(new TV());
		product1.setModel("smart TV");

		// Getter 메서드의 리턴 값은 각각 TV 클래스와 String 클래스가 된다.
		TV tv = product1.getKind();
		String tvName = product1.getModel();
		System.out.println(tv + " : " + tvName);

		// 타입 파라미터 K는 Car 클래스로, M은 String 클래스로 대체
		Product<Car, String> product2 = new Product<>();

		product2.setKind(new Car());
		product2.setModel("테슬라");

		Car car = product2.getKind();
		String carName = product2.getModel();
		System.out.println(car + " : " + carName);
	}
}
