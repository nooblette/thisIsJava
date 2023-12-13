package part04.ch19.sec06.JSON데이터형식;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;

import org.json.JSONArray;
import org.json.JSONObject;

public class ParseJsonExample{
	public static void main(String[] args) throws IOException {
		// 파일로부터 JSON 읽기
		// FileReader에 성능 향상 보조 스트림인 BufferedReader를 연결하여 성능향상
		BufferedReader bufferedReader = new BufferedReader(new FileReader("src/main/java/part04/ch19/sec06/JSON데이터형식/member.json", Charset.defaultCharset()));
		// BufferedReader 스트림으로부터 행 단위로 문자열을 읽는 readLine() 메서드를 사용
		String json = bufferedReader.readLine();
		bufferedReader.close();

		// JSON 파싱
		JSONObject jsonObject = new JSONObject(json);

		// 속성 정보 읽기
		System.out.println("id: " + jsonObject.getString("id"));
		System.out.println("name: " + jsonObject.getString("name"));
		System.out.println("age: " + jsonObject.getInt("age"));
		System.out.println("student: " + jsonObject.getBoolean("student"));

		// 객체 속성 정보 읽기
		JSONObject tel = jsonObject.getJSONObject("tel");
		System.out.println("home: " + tel.getString("home"));
		System.out.println("mobile: " + tel.getString("mobile"));

		// 배열 속성 정보 읽기
		JSONArray skill = jsonObject.getJSONArray("skill");
		System.out.print("skill: ");
		for(int i = 0; i < skill.length(); i++){
			System.out.print(skill.get(i) + ", ");
		}
	}
}
