package part02.ch05.sec6.배열타입;

public class ArrayCreateByValueListExample1 {
	public static void main(String[] args) {
		// 배열 변수 선언과 배열 할당
		String[] seasons;
		seasons = new String[] {"Spring", "Summer", "April", "Winter"};

		// 배열의 항목 값 출력
		System.out.println("seasons[0]: " + seasons[0]);
		System.out.println("seasons[0]: " + seasons[1]);
		System.out.println("seasons[0]: " + seasons[2]);
		System.out.println("seasons[0]: " + seasons[3]);


		// 인덱스 1번항목의 값 변경
		seasons[1] = "여름";
		System.out.println("seasons[1]: " + seasons[1]);

		// 배열 변수 선언과 배열 생성
		int[] scores = {83, 90, 87};

		// 총합과 평균 구하기
		int sum = 0;
		for(int score : scores){
			sum += score;
		}
		System.out.println("총합: " + sum);
		System.out.println("평균 " + (double) sum/scores.length);

		// printItem() 메서드 호출시 new 키워드로 배열 객체를 생성하여 매개변수로 넘긴다.
		printItems(new int[]{83, 90, 87});
	}

	// 매개변수로 정수형 배열을 갖는 printItem() 메서드 선언
	private static void printItems(int[] scores){
		for(int i = 0; i < scores.length; i++){
			System.out.println("scores[" + i + "]: " + scores[i]);
		}
	}
}
