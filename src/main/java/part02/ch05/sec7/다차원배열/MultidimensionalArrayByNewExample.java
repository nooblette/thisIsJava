package part02.ch05.sec7.다차원배열;

public class MultidimensionalArrayByNewExample {
	public static void main(String[] args) {
		int[][] mathScores = new int[2][3];

		// 배열 항목의 초기값 출력
		for(int i = 0; i < mathScores.length; i++){
			for(int j = 0;  j < mathScores[i].length; j++){
				System.out.println("mathScores[" + i + "][" + j + "]: " + mathScores[i][j]);
			}
		}

		// 배열 항목값 변경
		mathScores[0][0] = 80;
		mathScores[0][1] = 83;
		mathScores[0][2] = 85;
		mathScores[1][0] = 86;
		mathScores[1][1] = 90;
		mathScores[1][2] = 92;

		// 전체 학생의 수학 평균 구하기
		int sumOfMathScore = 0;
		int sumOfMathClassStudent = 0;
		for(int i = 0; i < mathScores.length; i++){
			for(int j = 0; j < mathScores[i].length; j++){
				sumOfMathScore += mathScores[i][j];
				sumOfMathClassStudent++;
			}
		}
		System.out.println("전체 학생의 수학 평균: " + (double)sumOfMathScore / sumOfMathClassStudent);

		// 각 반의 학생수가 다른 경우
		int[][] englishScores = new int[2][];
		englishScores[0] = new int[2];
		englishScores[1] = new int[3];

		// 배열 항목값 변경
		englishScores[0][0] = 90;
		englishScores[0][1] = 91;
		englishScores[1][0] = 92;
		englishScores[1][1] = 93;
		englishScores[1][2] = 94;

		// 전체 학생의 영어 평균 구하기
		int sumOfEnglishScore = 0;
		int sumOfEnglishClassStudent = 0;
		for(int i = 0; i < englishScores.length; i++){
			for(int j = 0; j < englishScores[i].length; j++){
				sumOfEnglishScore += englishScores[i][j];
				sumOfEnglishClassStudent++;
			}
		}
		System.out.println("전체 학생의 영어 평균: " + (double)sumOfEnglishScore / sumOfEnglishClassStudent);
	}
}
