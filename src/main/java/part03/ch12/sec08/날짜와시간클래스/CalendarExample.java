package part03.ch12.sec08.날짜와시간클래스;

import java.util.Calendar;

public class CalendarExample {
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();

		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH) + 1;
		int day = now.get(Calendar.DAY_OF_MONTH);
		int week = now.get(Calendar.DAY_OF_WEEK);
		String strWeek;
		switch (week){
			case Calendar.MONTH -> strWeek ="월";
			case Calendar.TUESDAY -> strWeek ="화";
			case Calendar.WEDNESDAY -> strWeek ="수";
			case Calendar.THURSDAY -> strWeek ="목";
			case Calendar.FRIDAY -> strWeek ="금";
			case Calendar.SATURDAY -> strWeek ="토";
			case Calendar.SUNDAY -> strWeek ="일";
			default -> strWeek="해당 요일 없음";
		}
		System.out.print(year + "년 ");
		System.out.print(month + "월 ");
		System.out.print(day + "일 ");
		System.out.println(strWeek + "요일");

		int amPm = now.get(Calendar.AM_PM);
		String strAmPm;
		if(amPm == Calendar.AM){
			strAmPm = "오전";
		} else {
			strAmPm = "오후";
		}

		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		System.out.print(strAmPm + " ");
		System.out.print(hour + "시 " + minute + "분 " + second + "초");

	}
}
