package part04.ch18.sec11.File과Files클래스;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileExample {
	public static void main(String[] args) throws IOException {
		// File 객체 생성
		File directory = new File("src/main/java/part04/ch18/sec11/File과Files클래스/images");
		File file1 = new File("src/main/java/part04/ch18/sec11/File과Files클래스/file1.txt");
		File file2 = new File("src/main/java/part04/ch18/sec11/File과Files클래스/file2.txt");
		File file3 = new File("src/main/java/part04/ch18/sec11/File과Files클래스/file3.txt");

		// File 클래스 생성자로 전달한 경로에 파일이나 디렉토리가 없을 경우 생성
		if(!directory.exists()){
			directory.mkdirs();
		}
		if(!file1.exists()){
			file1.createNewFile();
		}
		if(!file2.exists()){
			file2.createNewFile();
		}
		if(!file3.exists()){
			file3.createNewFile();
		}

		// File과Files클래스 디렉토리의 내용을 출력
		File sec11 = new File("src/main/java/part04/ch18/sec11/File과Files클래스");
		File[] files = sec11.listFiles();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd a HH:mm");
		for(File file : files){
			System.out.printf("%-25s", simpleDateFormat.format(new Date(file.lastModified())));
			if(file.isDirectory()){
				System.out.printf("%-10s%-20s", "<DIR>", file.getName());
			} else{
				System.out.printf("%-10s%-20s", file.length(), file.getName());

			}
			System.out.println();
		}
	}
}
