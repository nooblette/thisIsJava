package part03.ch15.sec02.List컬렉션.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		// ArrayList 컬렉션 생성
		List<Board> boardList = new ArrayList<>();

		// 객체 추가
		boardList.add(new Board("제목1", "내용1", "글쓴이1"));
		boardList.add(new Board("제목2", "내용2", "글쓴이2"));

		// 저장된 총 객체 수 출력
		System.out.println("총 객체 수 : " + boardList.size());

		// 특정 인덱스의 객체 반환
		System.out.println("1번 인덱스의 객체 : "
			+ boardList.get(1).getSubject() + "\t"
			+ boardList.get(1).getContent() + "\t"
			+ boardList.get(1).getWriter()
		);
		System.out.println();

		// 모든 객체를 하나씩 조회
		printAllBoard(boardList);
		System.out.println();

		// 객체 삭제
		boardList.remove(0);

		// 모든 객체를 하나씩 조회
		printAllBoard(boardList);
	}

	private static void printAllBoard(List<Board> boardList){
		for(Board board : boardList){
			System.out.println(
				board.getSubject() + "\t"
				+ board.getContent() + "\t"
				+ board.getWriter()
			);
		}
	}

}
