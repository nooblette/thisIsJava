package part02.ch08.sec11.다형성.필드다형성;

public class Car {
	Tire frontTire = new HankookTire();
	Tire backTire = new HankookTire();

	void run() {
		frontTire.roll();
		backTire.roll();
	}
}
