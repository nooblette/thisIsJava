package part02.ch05.sec12.열거타입;

import java.time.LocalDate;

public class WeekExample {
	public static void main(String[] args) {
		// 열거 타입 변수 선언
		Week today = null;

		// 오늘 요일에 맞춰 열거 타입 변수에 열거 상수를 할당
		switch(LocalDate.now().getDayOfWeek()) {
			case MONDAY:
				today = Week.MONDAY;
				break;
			case TUESDAY:
				today = Week.TUESDAY;
				break;
			case WEDNESDAY:
				today = Week.WEDNESDAY;
				break;
			case THURSDAY:
				today = Week.THURSDAY;
				break;
			case FRIDAY:
				today = Week.FRIDAY;
				break;
			case SATURDAY:
				today = Week.SATURDAY;
				break;
			case SUNDAY:
				today = Week.SUNDAY;
				break;
		}

		if(today == Week.MONDAY) {
			System.out.println("오늘은 월요일입니다.");
		} else {
			System.out.println("오늘은 월요일이 아닙니다.");
		}
	}
}
