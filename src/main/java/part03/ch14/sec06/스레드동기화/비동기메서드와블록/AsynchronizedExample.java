package part03.ch14.sec06.스레드동기화.비동기메서드와블록;

public class AsynchronizedExample {
	public static void main(String[] args) {
		AsynchronizedCalculator asynchronizedCalculator = new AsynchronizedCalculator();

		User3Thread user3Thread = new User3Thread();
		user3Thread.setCalculator(asynchronizedCalculator);

		User4Thread user4Thread = new User4Thread();
		user4Thread.setCalculator(asynchronizedCalculator);

		user3Thread.start();
		user4Thread.start();
	}
}
