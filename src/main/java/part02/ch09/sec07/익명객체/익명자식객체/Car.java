package part02.ch09.sec07.익명객체.익명자식객체;

public class Car {
	// 필드에 Tire 객체 대입
	private Tire tire1 = new Tire();

	// 필드에 익명 자식 객체 대입
	private Tire tire2 = new Tire(){ // 익명 자식 객체는 부모생성자를 호출하여 생성
		@Override
		public void roll(){ // 부모 타입의 메서드를 재정의
			System.out.println("익명 자식 객체 타이어가 굴러갑니다.");
		}
	};

	// 메서드(인스턴스 필드 이용)
	public void run1(){
		tire1.roll();
		tire2.roll();
	}

	// 메서드(로컬 변수 이용)
	public void run2(){
		// 메서드의 로컬 변수에 익명 자식 객체 대입
		Tire tire2 = new Tire(){
			@Override
			public void roll(){
				System.out.println("로컬 변수로 선언한 익명 자식 객체 타이어가 굴러갑니다.");
			}
		};
		tire2.roll();
	}

	// 메서드(매개변수 이용)
	public void run3(Tire tire){
		tire.roll();
	}
}
