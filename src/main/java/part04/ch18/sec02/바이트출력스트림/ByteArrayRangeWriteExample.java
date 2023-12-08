package part04.ch18.sec02.바이트출력스트림;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class ByteArrayRangeWriteExample {
	public static void main(String[] args) {
		try {
			OutputStream outputStream = new FileOutputStream("src/main/java/part04/ch18/sec02/바이트출력스트림/test3.txt");

			byte[] arrays = {10, 20, 30, 40};

			// 배열의 모든 바이트를 출력
			outputStream.write(arrays, 1, 2);

			// 내부 버퍼에 잔류하는 바이트를 모두 출력하고 버퍼를 비움
			outputStream.flush();
			// 출력 스트림을 닫고 사용 메모리 해제
			outputStream.close();
		} catch (IOException e){
			e.printStackTrace();
		}
	}
}
