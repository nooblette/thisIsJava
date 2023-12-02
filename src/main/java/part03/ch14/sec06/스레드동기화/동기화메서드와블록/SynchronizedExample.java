package part03.ch14.sec06.스레드동기화.동기화메서드와블록;

public class SynchronizedExample {
	public static void main(String[] args) {
		SynchronizedCalculator synchronizedCalculator = new SynchronizedCalculator();

		User1Thread user1Thread = new User1Thread();
		user1Thread.setCalculator(synchronizedCalculator);

		User2Thread user2Thread = new User2Thread();
		user2Thread.setCalculator(synchronizedCalculator);

		user1Thread.start();
		user2Thread.start();
	}
}
