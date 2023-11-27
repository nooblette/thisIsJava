package part03.ch12.sec05.문자열클래스;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class BytesToStringExample {
	public static void main(String[] args) throws UnsupportedEncodingException {
		String data = "자바";

		// String -> byte 배열(기본 UTF-8 인코딩)
		byte[] bytes = data.getBytes();
		System.out.println("arr1: " + Arrays.toString(bytes));

		// byte 배열 -> String(기본 UTF-8 인코딩)
		System.out.println("str1: " + new String(bytes));

		// byte 배열 -> String(EUC-KR 인코딩)
		System.out.println("str2: " + new String(bytes, "EUC-KR"));
	}
}
