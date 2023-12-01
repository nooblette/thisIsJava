package part03.ch13.sec02.제네릭타입.인터페이스;

public class HomeAgency implements Rentable{
	@Override
	public Home rent() {
		return new Home();
	}
}
