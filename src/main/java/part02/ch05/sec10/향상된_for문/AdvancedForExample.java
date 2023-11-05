package part02.ch05.sec10.향상된_for문;

public class AdvancedForExample {
	public static void main(String[] args) {
		// 배열 변수 선언과 배열 생성
		int[] scores = {95, 71, 84, 93, 87};

		// 총합과 평균 구하기
		int sum = 0;
		for(int score : scores){
			sum += score;
		}
		System.out.println("총합: " + sum);
		System.out.println("평균 " + (double) sum/scores.length);
	}
}
