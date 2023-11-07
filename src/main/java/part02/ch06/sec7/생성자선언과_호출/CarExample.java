package part02.ch06.sec7.생성자선언과_호출;

public class CarExample {
	public static void main(String[] args) {
		// Car myCarByDefulatConstrucotr = new Car(); 개발자가 정의한 생성자가 있으면 기본 생성자는 호출 불가
		Car myCar = new Car("그랜져", "검정", 300);

		System.out.println("모델명 : " + myCar.model);
		System.out.println("색상 : " + myCar.color);
		System.out.println("최고속도 : " + myCar.maxSpeed);
	}
}
