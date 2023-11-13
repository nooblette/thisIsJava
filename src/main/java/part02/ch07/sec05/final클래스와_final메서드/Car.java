package part02.ch07.sec05.final클래스와_final메서드;

public class Car {
	public int speed;

	public void speedUp(){
		speed++;
	}

	// final 메서드
	public final void stop(){
		System.out.println("자동차 멈춤");
		speed = 0;
	}
}
