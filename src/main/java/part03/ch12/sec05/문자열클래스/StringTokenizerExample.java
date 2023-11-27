package part03.ch12.sec05.문자열클래스;

import java.util.StringTokenizer;

public class StringTokenizerExample {
	public static void main(String[] args) {
		String data1 = "홍길동&이수홍,박연수,김자바-최명호";
		String[] names = data1.split("&|,|-");
		for(String name: names){
			System.out.println(name);
		}
		System.out.println();

		String data2 = "홍길동/이수홍/박연수";
		StringTokenizer stringTokenizer = new StringTokenizer(data2, "/");
		System.out.println("가져올 수 있는 String token 수: " + stringTokenizer.countTokens());
		while(stringTokenizer.hasMoreTokens()){
			System.out.println(stringTokenizer.nextToken());
		}
	}
}
