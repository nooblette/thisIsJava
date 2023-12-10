package part04.ch18.sec11.File과Files클래스;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesExample {
	public static void main(String[] args) {
		try {
			String data = ""
				+ "id: winter\n"
				+ "email: winter@mycompany.com\n"
				+ "tel: 010-123-4567";

			// Path 객체 생성
			Path path = Paths.get("src/main/java/part04/ch18/sec11/File과Files클래스/user.txt");

			// 파일 생성 및 데이터 저장
			Files.writeString(path, data, StandardCharsets.UTF_8);

			// 파일 정보 얻기
			System.out.println("파일 유형: " + Files.probeContentType(path));
			System.out.println("파일 크기: " + Files.size(path));
			System.out.println();

			// 파일 읽기
			String content = Files.readString(path, StandardCharsets.UTF_8);
			System.out.println(content);
		} catch (IOException e){
			e.printStackTrace();
		}
	}
}
