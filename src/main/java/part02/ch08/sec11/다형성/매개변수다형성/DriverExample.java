package part02.ch08.sec11.다형성.매개변수다형성;

public class DriverExample {
	public static void main(String[] args) {
		Driver driver = new Driver();

		Bus bus = new Bus();
		Taxi taxi = new Taxi();

		driver.drive(bus);
		driver.drive(taxi);
	}
}
