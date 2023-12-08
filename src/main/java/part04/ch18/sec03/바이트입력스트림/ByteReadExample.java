package part04.ch18.sec03.바이트입력스트림;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ByteReadExample {
	public static void main(String[] args) {
		try{
			InputStream inputStream = new FileInputStream("src/main/java/part04/ch18/sec02/바이트출력스트림/test1.txt");

			while(true){
				int data = inputStream.read();
				if(data == -1) {
					break;
				}

				System.out.println(data);
			}
			inputStream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
