package part03.ch16.sec05.메서드참조.정적메서드와_인스턴스메서드참조;

public class Computer {
	public static double staticMethod(double x, double y){
		return x + y;
	}

	public double instanceMethod(double x, double y){
		return x - y;
	}
}
