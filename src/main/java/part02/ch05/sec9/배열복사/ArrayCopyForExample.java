package part02.ch05.sec9.배열복사;

public class ArrayCopyForExample {
	public static void main(String[] args) {
		// 길이가 3인 배열
		int[] oldIntArray = {1, 2, 3};

		// 길이가 5인 배열
		int[] newIntArray = new int[5];

		// 배열 항목 복사
		for(int i = 0; i < oldIntArray.length; i++){
			newIntArray[i] = oldIntArray[i];
		}

		// 배열 항목 출력
		for(int i = 0; i < newIntArray.length; i++){
			System.out.println("newIntArray[" + i + "]: " + newIntArray[i]);
		}
	}
}
