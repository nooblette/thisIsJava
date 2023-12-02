package part03.ch14.sec09.스레드풀;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import org.w3c.dom.ls.LSOutput;

public class CallableExecuteExample {
	public static void main(String[] args) {
		// 쓰레드풀(ExecutorService) 생성
		ExecutorService executorService = Executors.newFixedThreadPool(5);

		// Callable 작업 객체로 구현한 계산 작업을 스레드풀의 작업 큐에 넣고 작업 처리 요청
		for(int i = 1; i <= 100; i++){
			final int finalI = i;

			// submit() 메서드는 Callable 작업 객체가 처리한 결과를 Future 인터페이스로 반한다.
			Future<Integer> future = executorService.submit(new Callable<Integer>() {
				@Override
				public Integer call() {
					int sum = 0;
					for(int i = 0; i < finalI; i++){
						sum += i + 1;
					}

					Thread thread = Thread.currentThread();
					System.out.print("[" + thread.getName() + "] 1 ~ " + finalI + " 합 계산");
					return sum; // call() 메서드는 스레드가 작업을 처리한 결과를 얻을 수 있도록 반환한다
				}
			});

			// Future 인터페이스의 get() 메서드를 호출하여 쓰레드 풀에서 작업을 맡은 쓰레드가 작업을 처리한 결과를 얻는다.
			try {
				int result = future.get();
				System.out.println("계산 결과 값 : " + result);
			} catch (InterruptedException | ExecutionException ignored){
				// Future 인터페이스의 get() 메서드는 InterruptedException와 ExecutionException 예외를 핸들링 해주어야한다.

			}
		}

		// 쓰레드풀(ExecutorService) 종료
		executorService.shutdown(); // 작업 큐에 대기하고 있던 모든 작업을 처리한뒤 스레드풀을 종료한다.
	}
}
