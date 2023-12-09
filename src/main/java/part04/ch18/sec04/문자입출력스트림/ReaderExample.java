package part04.ch18.sec04.문자입출력스트림;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderExample {
	public static void main(String[] args) {
		try{
			Reader reader;

			// 1문자씩 읽기
			reader = new FileReader("src/main/java/part04/ch18/sec04/문자입출력스트림/test1.txt");
			while(true){
				int data = reader.read();
				if(data == -1) break;
				System.out.print((char)data);
			}
			reader.close();
			System.out.println();

			// 문자 배열로 읽기
			reader = new FileReader("src/main/java/part04/ch18/sec04/문자입출력스트림/test1.txt");
			char[] datas = new char[100];
			while(true){
				int num = reader.read(datas);
				if(num == -1) break;
				for(char data : datas){
					System.out.print(data);
				}
			}
			reader.close();
			System.out.println();

		} catch (IOException e){
			e.printStackTrace();
		}
	}
}
