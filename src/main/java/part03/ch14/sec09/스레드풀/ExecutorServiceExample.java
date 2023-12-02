package part03.ch14.sec09.스레드풀;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample {
	public static void main(String[] args) {
		// 스레드풀 생성
		ExecutorService executorService = Executors.newFixedThreadPool(5);

		// 작업 생성과 스레드에 처리 요청
		// 스레드풀 종료
		executorService.shutdownNow();
	}
}