package part03.ch12.sec08.날짜와시간클래스;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeOperationExample {
	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy.MM.dd a HH:mm:ss");
		System.out.println("현재 시간: " + now.format(dateTimeFormatter));

		LocalDateTime afterOneYears = now.plusYears(1);
		System.out.println("1년 후: " + afterOneYears.format(dateTimeFormatter));

		LocalDateTime beforeTowMonths = now.minusMonths(2);
		System.out.println("2개월 전: " + beforeTowMonths.format(dateTimeFormatter));

		LocalDateTime afterSevenDays = now.plusDays(7);
		System.out.println("7일 후 :" + afterSevenDays.format(dateTimeFormatter));
	}
}
