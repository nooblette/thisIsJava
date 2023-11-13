package part02.ch07.sec08.다형성.필드다형성;

public class CarExample {
	public static void main(String[] args) {
		Car car = new Car();
		car.tire = new Tire();
		car.run();

		car.tire = new HankookTire(); // 한국타이어는 타이어이다. 관계 성립
		car.run();

		car.tire = new KumhoTire(); // 금호타이어는 타이어이다. 관계 성립
		car.run();
	}
}
