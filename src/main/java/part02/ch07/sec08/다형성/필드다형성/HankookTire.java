package part02.ch07.sec08.다형성.필드다형성;

public class HankookTire extends Tire{
	@Override
	public void roll() {
		System.out.println("한국 타이어가 회전합니다.");
	}
}
