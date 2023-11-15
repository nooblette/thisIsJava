package part02.ch08.sec11.다형성.필드다형성;

public class KumhoTire implements Tire{
	@Override
	public void roll() {
		System.out.println("금호 타이어가 굴러갑니다.");
	}
}
