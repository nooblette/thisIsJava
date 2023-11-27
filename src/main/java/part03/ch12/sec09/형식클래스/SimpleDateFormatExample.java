package part03.ch12.sec09.형식클래스;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatExample {
	public static void main(String[] args) {
		Date now = new Date();

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(simpleDateFormat.format(now));

		simpleDateFormat = new SimpleDateFormat("yyyy년 MM월 dd일");
		System.out.println(simpleDateFormat.format(now));

		simpleDateFormat = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
		System.out.println(simpleDateFormat.format(now));

		simpleDateFormat = new SimpleDateFormat("오늘은 E요일");
		System.out.println(simpleDateFormat.format(now));

		simpleDateFormat = new SimpleDateFormat("오늘은 올해의 D번째 날");
		System.out.println(simpleDateFormat.format(now));

		simpleDateFormat = new SimpleDateFormat("M월의 d번째 날");
		System.out.println(simpleDateFormat.format(now));
	}
}
