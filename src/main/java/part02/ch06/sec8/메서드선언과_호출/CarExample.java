package part02.ch06.sec8.메서드선언과_호출;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();

		myCar.setGas(5);

		if(myCar.isLeftGas()){
			System.out.println("출발합니다.");
			myCar.run();
		}

		System.out.println("gas를 주입하세요.");
	}
}
