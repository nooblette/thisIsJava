package part02.ch08.sec11.다형성.필드다형성;

public class CarExample {
	public static void main(String[] args) {
		Car car = new Car();

		car.run();
		System.out.println();

		// 뒷 타이어 교체
		car.backTire = new KumhoTire();
		car.run();
	}
}
