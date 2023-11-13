package part02.ch07.sec05.final클래스와_final메서드;

public class SportsCar extends Car{
	@Override // 생략 가능(메서드 재정의 규칙을 지켰는지 체크)
	public void speedUp(){
		speed += 10; // 메서드 재정의
	}

	// @Override
	// public void stop(){
	// 	speed = 0; // final 메서드는 재정의할 수 없다.
	//}
}
