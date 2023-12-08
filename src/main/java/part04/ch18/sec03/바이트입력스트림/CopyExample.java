package part04.ch18.sec03.바이트입력스트림;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyExample {
	public static void main(String[] args) {
		try	{
			String sourceFilePath = "src/main/java/part04/ch18/sec02/바이트출력스트림/image.jpg";
			String destinationFilePath = "src/main/java/part04/ch18/sec03/바이트입력스트림/image.jpg";

			InputStream inputStream = new FileInputStream(sourceFilePath);
			OutputStream outputStream = new FileOutputStream(destinationFilePath);

			// // InputStream 으로 파일을 읽고, 읽은 바이트를 저장할 배열 생성
			// byte[] data = new byte[1024];
			// while(true){
			// 	// IntputStream으로부터 최대 1024 바이트만큼 읽고 data에 저장, 읽은 바이트 수만큼 반환
			// 	int num = inputStream.read(data);
			// 	if(num == -1){
			// 		break;
			// 	}
			//
			// 	// InputStream으로 부터 읽은 만큼 OutputStream으로 바로 출력
			// 	outputStream.write(data, 0, num);
			// }

			// java 9 부터는 파일 복사를 위해 InputStream에서 transferTo(OutputStream outputStream) 메서드를 제공
			inputStream.transferTo(outputStream);

			outputStream.flush(); // 출력 스트림 버퍼에 잔류하고 있는 바이트를 모두 출력
			outputStream.close(); // 출력 스트림을 닫고 사용 메모리 해제
			inputStream.close(); // 입력 스트림을 닫고 사용 메모리 해제

			System.out.println("복사가 완료되었습니다.");
		} catch (IOException e){
			e.printStackTrace();
		}

	}
}
