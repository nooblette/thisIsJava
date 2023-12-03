package part03.ch15.sec02.List컬렉션.Vector;

import java.util.List;
import java.util.Vector;

public class VectorExample {
	public static void main(String[] args) {
		// Vector 컬렉션 생성
		List<Board> boardVector = new Vector<>();

		// 작업 스레드 익명 객체 생성
		// 익명 객체 : 명시적인 클래스 선언 없이 객체를 생성하여 사용하는 것
		Thread threadA = new Thread(){
			@Override
			public void run(){
				// 객체 1000개 추가
				for(int i = 1; i <= 1000; i++){
					// 동기화 메서드 영역(한 번에 하나의 스레드만 접근할 수 있다.)
					boardVector.add(new Board("제목" + i, "내용" + i, "글쓴이" + i));
				}
			}
		};

		// 작업 스레드 익명 객체 생성
		Thread threadB = new Thread(){
			@Override
			public void run(){
				// 객체 1000개 추가
				for(int i = 1001; i <= 2000; i++){
					// 동기화 메서드 영역(한 번에 하나의 스레드만 접근할 수 있다.)
					boardVector.add(new Board("제목" + i, "내용" + i, "글쓴이" + i));
				}
			}
		};

		// 두 작업스레드를 RUNNABLE 상태로 변경(실행 대기 상태)
		threadA.start();
		threadB.start();

		// 작업 스레드들이 작업을 완료할때까지 메인 스레드는 대기
		try{
			threadA.join();
			threadB.join();
		} catch (InterruptedException ignored){

		}

		// 저장된 총 객체 수 반환
		int size = boardVector.size();

		// Vector 컬렉션의 add() 메서드는 동기화 메서드이다.
		// Vector 컬렉션은 멀티 스레드 환경에서 동기화를 지원하기 때문에 한 번에 하나의 스레드만 실행할 수 있고 정확히 2000개의 객체가 생성된다.
		System.out.println("총 객체수 : " + size);
	}
}
