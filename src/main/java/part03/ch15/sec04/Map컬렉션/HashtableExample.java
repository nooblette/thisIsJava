package part03.ch15.sec04.Map컬렉션;

import java.util.Hashtable;
import java.util.Map;

public class HashtableExample {
	public static void main(String[] args) {
		// Hashtable 컬렉션 생성
		Map<String, Integer> map = new Hashtable<>();

		// 작업 스레드 객체 생성
		Thread threadA = new Thread(){
			@Override
			public void run(){
				// 엔트리 1000개 추가
				for(int i = 0; i < 1000; i++){
					map.put(String.valueOf(i), i);
				}
			}
		};

		Thread threadB = new Thread(){
			@Override
			public void run(){
				// 엔트리 1000개 추가
				for(int i = 0; i < 1000; i++){
					map.put(String.valueOf(i + 1000), i + 1000);
				}
			}
		};

		// 작업 스레드를 실행 대기 상태로 변경
		threadA.start();
		threadB.start();

		// 작업 스레드들이 모두 종료되기 전까지 main 쓰레드를 일시정지 상태로 변경
		try {
			threadA.join();
			threadB.join();
		} catch (InterruptedException ignored){

		}

		// 저장된 총 엔트리 수 조회
		int size = map.size();
		System.out.println("저장된 총 엔트리 수 : " + size);
	}
}
