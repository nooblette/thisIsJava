package part02.ch07.sec08.다형성.매개변수다형성;

public class DriverExample {
	public static void main(String[] args) {
		// Driver 객체 생성
		Driver driver = new Driver();

		/*
		 * 매개변수 다형성
		 * : 동일한 사용 방식(동일한 메서드 호출)을 갖고 있지만, 매개변수에 따라 실행결과가 달라진다.
		 */
		driver.drive(new Vehicle());
		driver.drive(new Taxi());
		driver.drive(new Bus());
	}
}
