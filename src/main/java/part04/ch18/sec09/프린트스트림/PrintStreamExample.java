package part04.ch18.sec09.프린트스트림;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

public class PrintStreamExample {
	public static void main(String[] args) throws IOException {
		OutputStream outputStream = new FileOutputStream("src/main/java/part04/ch18/sec09/프린트스트림/printStream.txt");

		// 파일 출력스트림에 프린트 보조 스트림을 연결
		PrintStream printStream = new PrintStream(outputStream);

		printStream.print("마치 ");
		printStream.println("프린터가 출력하는 것처럼");
		printStream.println("데이터를 출력합니다.");
		printStream.printf("| %6d | %-10s | %10s | \n", 1, "홍길동", "도적");
		printStream.printf("| %6d | %-10s | %10s | \n", 1, "김자바", "학생");

		printStream.close();
		outputStream.close();
	}
}
