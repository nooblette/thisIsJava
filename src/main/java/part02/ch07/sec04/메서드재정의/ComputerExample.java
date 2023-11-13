package part02.ch07.sec04.메서드재정의;


public class ComputerExample {
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		Computer com = new Computer();

		System.out.println(cal.areaCircle(10));
		System.out.println(com.areaCircle(10));
	}
}
