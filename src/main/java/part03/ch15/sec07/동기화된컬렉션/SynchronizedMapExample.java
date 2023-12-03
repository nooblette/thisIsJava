package part03.ch15.sec07.동기화된컬렉션;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SynchronizedMapExample {
	public static void main(String[] args) throws InterruptedException {
		// Map 컬렉션 생성 : map 변수는 멀티쓰레드 환경에서 공유객체에 해당한다.
		Map<Integer, String> map
			// map 컬렉션을 동기화된 컬렉션으로 변경
			// synchronizedMap() 메서드를 생략할 경우 저장된 총 객체수가 의도(200개의 객체 저장)와 다르게 나타난다.
			= Collections.synchronizedMap(new HashMap<>());

		// 익명 객체로 작업 스레드 객체 생성
		Thread threadA = new Thread(){
			@Override
			public void run(){
				for(int i = 0; i < 100; i++){
					map.put(i, String.valueOf(i) + "번째 작업");
				}
			}
		};

		Thread threadB = new Thread(){
			@Override
			public void run(){
				for(int i = 100; i < 200; i++){
					map.put(i, String.valueOf(i) + "번째 작업");
				}
			}
		};

		// 작업 스레드 객체를 실행 대기(RUNNABLE) 상태로 변경
		threadA.start();
		threadB.start();

		// 작업 스레드들의 작업이 완료될때까지 main 쓰레드는 일시 정지(BLOCKING)
		threadA.join();
		threadB.join();

		// 저장된 총 객체 수 확인
		int size = map.size();
		System.out.println("저장된 총 객체 수 : " + size);
	}
}
