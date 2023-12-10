package part04.ch18.sec08.기본타입스트림;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class DataInputOutputStreamExample {
	public static void main(String[] args) throws IOException {
		// DataOutputStream 생성
		OutputStream outputStream = new FileOutputStream("src/main/java/part04/ch18/sec08/기본타입스트림/primitive.db");
		DataOutputStream dataOutputStream = new DataOutputStream(outputStream);

		// 기본 타입 출력
		dataOutputStream.writeUTF("홍길동");
		dataOutputStream.writeDouble(95.5);
		dataOutputStream.writeInt(1);

		dataOutputStream.writeUTF("이자바");
		dataOutputStream.writeDouble(90.3);
		dataOutputStream.writeInt(2);

		dataOutputStream.flush();
		dataOutputStream.close();
		outputStream.close();

		// DataInputStream 생성
		InputStream inputStream = new FileInputStream("src/main/java/part04/ch18/sec08/기본타입스트림/primitive.db");
		DataInputStream dataInputStream = new DataInputStream(inputStream);

		// 기본 타입 입력
		for(int i = 0; i < 2; i++){
			// 출력한 순서와 동일한 순서의 타입대로 읽는다.
			String name = dataInputStream.readUTF();
			double score = dataInputStream.readDouble();
			int order = dataInputStream.readInt();
			System.out.println("[" + order + "] " + name + " : " + score + "점");
		}

		dataInputStream.close();
		inputStream.close();
	}
}
