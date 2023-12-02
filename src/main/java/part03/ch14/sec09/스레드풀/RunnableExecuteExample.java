package part03.ch14.sec09.스레드풀;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RunnableExecuteExample {
	public static void main(String[] args) {
		// 1000개의 메일 생성
		String[][] mails = new String[1000][3];
		for(int i = 0; i < mails.length; i++){
			mails[i][0] = "admin@my.com";
			mails[i][1] = "member" + i + "@my.com";
			mails[i][2] = "신상품 입고";
		}

		// 스레드풀(ExecutorService 구현 객체) 생성
		// 이때 최대 스레드 개수는 5개로 제한한다.
		ExecutorService executorService = Executors.newFixedThreadPool(5);

		// 이메일 전송 작업을 Runnable 익명 객체로 구현하여 스레드풀의 작업 큐에 넣는다.
		for(int i = 0; i < 1000; i++){
			// 각 이메일 전송 작업을 스레드풀의 작업 큐에 넣기 위해 ExecutorService 구현 객체의 execute() 메서드 호출
			final int finalI = i;
			executorService.execute(new Runnable() { // 작업을 Runnable 익명 객체로 전달
				@Override
				public void run() {
					String from = mails[finalI][0];
					String to = mails[finalI][1];
					String content = mails[finalI][2];

					Thread thread = Thread.currentThread();
					System.out.println("[" + thread.getName() + "] " + from + " ==> " + to + ": " + content);
				}
			});
		}

		// 스레드풀(ExecutorService 구현 객체) 종료
		executorService.shutdown(); // 작업 큐에 대기하고 있는 모든 작업을 처리한뒤 스레드풀을 종료한다.
	}
}
