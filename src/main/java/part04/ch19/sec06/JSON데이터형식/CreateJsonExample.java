package part04.ch19.sec06.JSON데이터형식;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.charset.Charset;

import org.json.JSONArray;
import org.json.JSONObject;

public class CreateJsonExample {
	public static void main(String[] args) throws IOException {
		// JSON 객체 생성
		JSONObject jsonObject = new JSONObject();

		// 속성 추가
		jsonObject.put("id", "winter");
		jsonObject.put("name", "한겨울");
		jsonObject.put("age", 25);
		jsonObject.put("student", true);

		// 객체 속성 추가
		JSONObject tel = new JSONObject();
		tel.put("home", "02-123-1234");
		tel.put("mobile", "02-123-1234");
		jsonObject.put("tel", tel);

		// 배열 속성 추가
		JSONArray skill = new JSONArray();
		skill.put("java");
		skill.put("c");
		skill.put("c++");
		jsonObject.put("skill", skill);

		// JSON 얻기
		String json = jsonObject.toString();

		// 콘솔 출력
		System.out.println(json);

		// 파일로 저장
		Writer writer = new FileWriter("src/main/java/part04/ch19/sec06/JSON데이터형식/member.json", Charset.forName("UTF-8"));
		writer.write(json);
		writer.flush();
		writer.close();
	}
}
