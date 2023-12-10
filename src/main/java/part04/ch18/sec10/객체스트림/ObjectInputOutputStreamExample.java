package part04.ch18.sec10.객체스트림;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.Arrays;

public class ObjectInputOutputStreamExample {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// FileOutputStream 바이트 출력 스트림에 ObjectOutputStream 객체 출력 보조 스트림 연결
		OutputStream outputStream = new FileOutputStream("src/main/java/part04/ch18/sec10/객체스트림/object.dat");
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);

		// 객체 생성
		Member outputMember = new Member("fall", "단풍");
		Product outputProduct = new Product("노트북", 1500000);
		int[] outputArr = {1, 2, 3};

		// 객체를 직렬화(객체의 필드값을 일렬로 늘어선 바이트로 변경)하여 파일에 저장
		objectOutputStream.writeObject(outputMember);
		objectOutputStream.writeObject(outputProduct);
		objectOutputStream.writeObject(outputArr);

		// FileInputStream 바이트 입력 스트림에 ObjectInputStream 객체 입력 보조 스트림 연결
		InputStream inputStream = new FileInputStream("src/main/java/part04/ch18/sec10/객체스트림/object.dat");
		ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);

		// 객체를 역직렬화(일렬로 늘어선 바이트 값들을 객체의 필드 값들로 복원)
		Member inputMember = (Member) objectInputStream.readObject();
		Product inputProduct = (Product) objectInputStream.readObject();
		int[] inputArr = (int[]) objectInputStream.readObject();

		// 복원된 객체 출력
		System.out.println(inputMember);
		System.out.println(inputProduct);
		System.out.println(Arrays.toString(inputArr));

		// 입출력 스트림에서 사용중인 메모리 해재
		objectInputStream.close();
		inputStream.close();

		objectOutputStream.close();
		outputStream.close();
	}
}
