package part03.ch17.sec13.요소병렬처리;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class ParallelExample {
	public static void main(String[] args) {
		Random random = new Random();

		// 1억 개의 Integer 객체 저장
		List<Integer> scores = new ArrayList<>();
		for(int i = 0; i < 100000000; i++){
			scores.add(random.nextInt(101));
		}

		double avg = 0.0;
		long startTime = 0;
		long endTime = 0;
		long time = 0;

		// 일반 스트림으로 평균 계산 소요시간 확인
		Stream<Integer> stream1 = scores.stream();
		startTime = System.nanoTime();
		avg = stream1
			.mapToInt(Integer::intValue)
			.average()
			.getAsDouble();
		endTime = System.nanoTime();
		System.out.println("평균 : " + avg + " / 일반 스트림 처리 시간 : " + (endTime - startTime) + "ns");

		// 병렬 스트림으로 평균 계산 소요시간 확인
		Stream<Integer> stream2 = scores.parallelStream(); // 병렬 처리 스트림 반환
		startTime = System.nanoTime();
		avg = stream2
			.mapToInt(Integer::intValue)
			.average()
			.getAsDouble();
		endTime = System.nanoTime();
		System.out.println("평균 : " + avg + " / 병렬 스트림 처리 시간 : " + (endTime - startTime) + "ns");
	}
}
