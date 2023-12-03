package part03.ch15.sec02.List컬렉션.Vector;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		// Vector 컬렉션 생성
		List<Board> boardVector = new ArrayList<>();

		// 작업 스레드 익명 객체 생성
		// 익명 객체 : 명시적인 클래스 선언 없이 객체를 생성하여 사용하는 것
		Thread threadA = new Thread(){
			@Override
			public void run(){
				// 객체 1000개 추가
				for(int i = 1; i <= 1000; i++){
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

		// ArrayList는 멀티 스레드 환경에서 동시에 add() 메서드를 호출할 수 있기 때문에, 경합이 발생한다면 결국 하나의 객체만 저장된다.
		// 따라서 ArrayList로 선언할 경우 2000개가 아닌 객체가 생성된다.
		System.out.println("총 객체수 : " + size);
	}
}
