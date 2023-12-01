package part03.ch13.sec02.제네릭타입.인터페이스;

public class CarAgency implements Rentable{
	@Override
	public Car rent() {
		return new Car();
	}
}
