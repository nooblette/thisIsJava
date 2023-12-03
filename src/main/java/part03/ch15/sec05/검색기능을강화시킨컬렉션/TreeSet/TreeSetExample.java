package part03.ch15.sec05.검색기능을강화시킨컬렉션.TreeSet;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample {
	public static void main(String[] args) {
		// TreeSet 컬렉션 생성
		TreeSet<Integer> scores = new TreeSet<>();

		// Integer 객체를 무작위로 저장
		scores.add(87);
		scores.add(98);
		scores.add(75);
		scores.add(95);
		scores.add(80);

		// 정렬된 Integer 객체를 하나씩 가져오기
		for(Integer score : scores){
			System.out.println("scroe : " + score);
		}

		// 가장 낮은 점수 조회
		System.out.println(scores.first());

		// 가장 높은 점수 조회
		System.out.println(scores.last());

		// 95점 아래 점수 조회
		System.out.println(scores.lower(95));

		// 95점 위 점수 조회
		System.out.println(scores.higher(95));

		// 95점이거나 바로 아래 점수 조회
		System.out.println(scores.floor(95));

		// 85점이거나 바로 위 점수 조회
		System.out.println(scores.ceiling(85));

		// 내림차순 정렬
		NavigableSet<Integer> navigableSet = scores.descendingSet();
		for(Integer score : navigableSet){
			System.out.println("score : " + score);
		}
		System.out.println();

		// 범위 검색(80점 이상)
		NavigableSet<Integer> tailSet = scores.tailSet(80, true);
		for(Integer score : tailSet){
			System.out.println("score : " + score);
		}
		System.out.println();

		// 범위 검색(80점 이상 90점 미만)
		NavigableSet<Integer> subSet = scores.subSet(80, true, 90, false);
		for(Integer score : subSet){
			System.out.println("score : " + score);
		}
	}
}
