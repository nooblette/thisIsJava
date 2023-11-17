package part02.ch09.sec07.익명객체.익명자식객체;

public class CarExample {
	public static void main(String[] args) {
		Car car = new Car();

		car.run1();

		car.run2();

		car.run3(new Tire(){
			@Override
			public void roll(){
				System.out.println("매개변수로 넘겨준 익명 자식 객체 타이어가 굴러갑니다.");
			}
		});
	}
}
