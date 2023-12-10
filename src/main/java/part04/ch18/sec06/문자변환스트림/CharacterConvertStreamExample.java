package part04.ch18.sec06.문자변환스트림;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
public class CharacterConvertStreamExample {
	public static void main(String[] args) throws Exception{
		write("문자 변환 스트림을 사용합니다.");
		String data = read();
		System.out.println(data);
	}

	private static void write(String str) throws Exception{
		// FileOutputStream 생성
		OutputStream outputStream = new FileOutputStream("src/main/java/part04/ch18/sec06/문자변환스트림/test.txt");

		// OutputStreamWriter 보조 스트림을 거쳐 데이터 출력 스트림을 문자 출력 스트림인 Writer로 변환
		Writer writer = new OutputStreamWriter(outputStream, "UTF-8");

		writer.write(str); // 파일에 문자 작성
		writer.flush(); // 출력 버퍼에 잔류하고 있는 모든 문자를 파일로 출력
		writer.close(); // 출력 스트림에서 사용하던 메모리 해제
	}

	private static String read() throws Exception{
		// FileInputStream 생성
		InputStream inputStream = new FileInputStream("src/main/java/part04/ch18/sec06/문자변환스트림/test.txt");

		// InputStreamReader 보조 스트림을 거쳐 데이터 입력 스트림을 문자 입력 스트림인 Reader로 변환
		Reader reader = new InputStreamReader(inputStream, "UTF-8");

		char[] data = new char[100];
		int num = reader.read(data); // 파일로부터 문자를 읽어오고 data에 삽입, 읽어온 문자 수를 반환

		// 입력 스트림에서 사용하던 메모리 해제
		reader.close();

		// 파일로부터 읽어온 문자열 배열을 String 클래스로 변환하여 반환
		return new String(data, 0, num);
	}
}
