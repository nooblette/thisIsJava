package part04.ch18.sec03.바이트입력스트림;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ByteArrayReadExample {
	public static void main(String[] args) {
		try {
			InputStream inputStream = new FileInputStream("src/main/java/part04/ch18/sec02/바이트출력스트림/test2.txt");

			while(true){
				byte[] data = new byte[3]; // 100byte까지 한 번에 담을 수 있는 바이트 배열 선언

				int read = inputStream.read(data);
				if(read == -1) {
					break;
				}

				for(int i = 0; i < 3; i++){
					System.out.println(data[i]);
				}
			}

			inputStream.close();
		} catch (IOException e){
			e.printStackTrace();
		}

	}
}
