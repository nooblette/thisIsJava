package part03.ch12.sec08.날짜와시간클래스;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {
	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now.toString());

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy년 MM월 dd일 HH:mm:ss");
		System.out.println(simpleDateFormat.format(now));
	}
}
