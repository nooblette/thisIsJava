package part02.ch08.sec11.다형성.매개변수다형성;

public class Bus implements Vehicle{
	@Override
	public void run() {
		System.out.println("버스가 달립니다.");
	}
}
