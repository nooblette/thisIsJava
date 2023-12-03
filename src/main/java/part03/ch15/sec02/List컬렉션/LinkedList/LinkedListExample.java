package part03.ch15.sec02.List컬렉션.LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
	// ArrayList 컬렉션과 LinkedList 컬렉션의 매번 0번째 인덱스에 10000개의 객체를 삽입하는데 걸리는 시간 비교
	public static void main(String[] args) {
		// ArrayList 컬렉션 객체 생성
		List<String> arrayList = new ArrayList<>();

		// LinkedList 컬렉션 객체 생성
		List<String> linkedList = new LinkedList<>();

		// 프로그램 실행 시간 측정
		long startTime;
		long endTime;

		// ArrayList 컬렉션 객체에 매번 0번쨰 인덱스에 10000개의 객체를 삽입하는데 걸리는 시간 측정
		startTime = System.nanoTime();
		for(int i = 0; i < 10000; i++){
			arrayList.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList 소요 시간 : " + (endTime - startTime) + "ns");

		// LinkedList 컬렉션 객체에 매번 0번째 인덱스에 10000개의 객체를 삽입하는데 걸리는 시간 측정
		startTime = System.nanoTime();
		for(int i = 0; i < 10000; i++){
			linkedList.add(0,String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList 소요 시간 : " + (endTime - startTime) + "ns");
	}
}
