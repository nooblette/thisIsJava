package part04.ch18.sec07.성능향상스트림;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadLineExample {
	public static void main(String[] args) throws IOException {
		/**
		 * FileReader 스트림은 InputStreamReader의 자식 클래스로 정의되어 있어,
		 * FileInputStream을 Reader로 변환하는 InputStreamReader 문자 변환 보조 스트림으로 연결한 것으로 볼 수 있다.
		 */
		BufferedReader bufferedReader = new BufferedReader(new FileReader(
			"src/main/java/part04/ch18/sec07/성능향상스트림/ReadLineExample.java")
		);

		int lineNo = 1;
		while(true){
			String string = bufferedReader.readLine(); // BufferedReader 입력 스트림으로부터 문자열을 한줄 씩 읽어옴
			if(string == null){
				break;
			}
			System.out.println(lineNo++ + ": " + string);
		}
		bufferedReader.close();
	}
}
