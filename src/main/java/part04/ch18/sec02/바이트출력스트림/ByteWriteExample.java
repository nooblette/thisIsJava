package part04.ch18.sec02.바이트출력스트림;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class ByteWriteExample {
	public static void main(String[] args) {
		try{
			OutputStream outputStream = new FileOutputStream("src/main/java/part04/ch18/sec02/바이트출력스트림/test1.txt");

			byte a = 10;
			byte b = 20;
			byte c = 30;

			// 1 byte 씩 출력(int 타입(= 4byte)의 변수의 마지막 1 byte)
			outputStream.write(a);
			outputStream.write(b);
			outputStream.write(c);

			outputStream.flush(); // 출력 버퍼 내부에 잔류하는 바이트를 모두 출력하고 버퍼를 비운다.
			outputStream.close(); // 출력 스트림을 닫고 사용 메모리 해제

		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}
