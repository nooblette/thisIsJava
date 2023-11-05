package part02.ch05.sec7.다차원배열;

public class MultidimensionalArrayByValueListExample {
	public static void main(String[] args) {
		// 2차원 배열 생성
		int[][] scores = {
			{80, 90, 96}, 	// 0번째 반의 성적 배열
			{76, 88} 		// 1번째 반의 성적 배열
		};

		// 배열의 길이
		System.out.println("반의 수: " + scores.length);
		System.out.println("첫번째 반의 학생 수: " + scores[0].length + "명");
		System.out.println("두번째 반의 학생 수: " + scores[1].length + "명");

		// 첫번째 반의 세 번째 학생의 점수
		System.out.println("첫번째 반의 세 번째 학생의 점수: " + scores[0][2]);

		// 두번째 반의 두번째 학생의 점수
		System.out.println("두번째 반의 두번째 학생의 점수: " + scores[1][1]);

		// 첫번째 반의 평균
		int sumOfFirstClass = 0;
		for(int i = 0; i < scores[0].length; i++){
			sumOfFirstClass += scores[0][i];
		}
		System.out.println("첫번째 반의 평균 점수: " + (double)sumOfFirstClass / scores[0].length);

		// 두번째 반의 평균
		int sumOfSecondClass = 0;
		for(int i = 0; i < scores[1].length; i++){
			sumOfSecondClass += scores[1][i];
		}
		System.out.println("두번째 반의 평균 점수: " + (double)sumOfSecondClass / scores[1].length);

		// 전체 학생의 평균
		int sumOfAll = 0;
		int countOfStudents = 0;

		for(int i = 0; i < scores.length; i++){
			for(int j = 0; j < scores[i].length; j++){
				sumOfAll += scores[i][j];
				countOfStudents++;
			}
		}
		System.out.println("전체 학생의 평균 점수: " + (double)sumOfAll / countOfStudents);
	}
}
