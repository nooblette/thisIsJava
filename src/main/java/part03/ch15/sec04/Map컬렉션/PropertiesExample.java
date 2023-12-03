package part03.ch15.sec04.Map컬렉션;

import java.io.IOException;
import java.util.Properties;

public class PropertiesExample {
	public static void main(String[] args) throws IOException {
		// Properties 객체 생성
		Properties properties = new Properties();

		// PropertiesExample.class와 동일한 classPath에 있는 properties 파일을 상대경로를 통해 메모리로 로드
		properties.load(PropertiesExample.class.getResourceAsStream("database.properties"));

		// 주어진 키에 대한 값 읽기
		String driver = properties.getProperty("driver");

		// 값 출력
		System.out.println("driver : " + driver);
	}
}
