package part04.ch18.sec04.문자입출력스트림;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterExample {
	public static void main(String[] args) {
		try {
			// 문자 기반 출력 스트림 생성
			Writer writer = new FileWriter("src/main/java/part04/ch18/sec04/문자입출력스트림/test1.txt");

			// 1 문자씩 출력
			char a = 'A';
			writer.write(a);

			char b = 'B';
			writer.write(b);

			// char 배열 출력
			char[] arr = {'C', 'D', 'E'};
			writer.write(arr);

			// 문자열 출력
			String str = new String("FGH");
			writer.write(str);

			// 버퍼에 잔류하는 모든 문자 출력
			writer.flush();

			// 출력 스트림 사용 메모리 해제
			writer.close();
		} catch (IOException e){
			e.printStackTrace();
		}




	}
}
