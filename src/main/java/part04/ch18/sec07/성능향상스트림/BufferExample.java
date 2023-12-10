package part04.ch18.sec07.성능향상스트림;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class BufferExample {
	public static void main(String[] args) throws IOException {
		// 입출력 스트림 생성
		String originalFilePath1 = "src/main/java/part04/ch18/sec07/성능향상스트림/originalFile1.jpg";
		String targetFilePath1 = "src/main/java/part04/ch18/sec07/성능향상스트림/targetFile1.jpg";

		FileInputStream fileInputStream = new FileInputStream(originalFilePath1);
		FileOutputStream fileOutputStream = new FileOutputStream(targetFilePath1);

		// 버퍼를 사용하지 않고 복사
		long nonBufferTime = copy(fileInputStream, fileOutputStream);
		System.out.println("버퍼 미사용시 소요 시간 : " + nonBufferTime + "ns");

		// 입출력 스트림에 성능 향상 스트림 보조 스트림을 추가하여 생성
		String originalFilePath2 = "src/main/java/part04/ch18/sec07/성능향상스트림/originalFile2.jpg";
		String targetFilePath2 = "src/main/java/part04/ch18/sec07/성능향상스트림/targetFile2.jpg";

		FileInputStream fileInputStream2 = new FileInputStream(originalFilePath2);
		BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream2);

		FileOutputStream fileOutputStream2 = new FileOutputStream(targetFilePath2);
		BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream2);
		long bufferTime = copy(bufferedInputStream, bufferedOutputStream);
		System.out.println("버퍼 사용시 소요 시간 : " + bufferTime + "ns");

	}

	private static long copy(InputStream inputStream, OutputStream outputStream) throws IOException{
		// 시작 시간 지정
		long startAt = System.nanoTime();

		// 1바이트를 읽고 1바이트를 출력
		while(true){
			int data = inputStream.read();
			if(data == -1){
				break;
			}

			outputStream.write(data);
		}
		// 버퍼에 잔류하는 바이트를 모두 출력
		outputStream.flush();

		// 끝 시간 저장
		long endAt = System.nanoTime();

		// 소요 시간 반환
		return endAt - startAt;
	}
}
