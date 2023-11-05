package part02.ch05.sec9.배열복사;

public class ArrayCopyExample {
	public static void main(String[] args) {
		// 길이가 3인 배열
		String[] oldIntArray = {"java", "array", "copy"};

		// 길이가 5인 배열
		String[] newIntArray = new String[5];

		// 배열 항목 복사
		System.arraycopy(oldIntArray, 0, newIntArray, 0, oldIntArray.length);

		// 배열 항목 출력
		for(int i = 0; i < newIntArray.length; i++){
			System.out.println("newIntArray[" + i + "]: " + newIntArray[i]);
		}
	}
}
