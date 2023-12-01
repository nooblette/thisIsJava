package part03.ch13.sec02.제네릭타입.인터페이스;

public class GenericExample {
	public static void main(String[] args) {
		HomeAgency homeAgency = new HomeAgency();
		Home home = homeAgency.rent();
		home.turnOnLight();

		CarAgency carAgency = new CarAgency();
		Car car = carAgency.rent();
		car.run();
	}
}
