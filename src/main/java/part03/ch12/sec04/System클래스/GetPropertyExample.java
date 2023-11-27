package part03.ch12.sec04.System클래스;

import java.util.Properties;

public class GetPropertyExample {
	public static void main(String[] args) {
		Properties properties = System.getProperties();

		for(Object objectKey : properties.keySet()){
			String key = (String) objectKey;
			String value = System.getProperty(key);
			System.out.printf("%-40s : %s\n", key, value);
		}
	}
}
