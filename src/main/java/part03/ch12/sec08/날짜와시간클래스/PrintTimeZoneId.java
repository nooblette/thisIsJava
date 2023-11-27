package part03.ch12.sec08.날짜와시간클래스;

import java.util.TimeZone;

public class PrintTimeZoneId {
	public static void main(String[] args) {
		String[] availableIds = TimeZone.getAvailableIDs();
		for(String availableId : availableIds){
			System.out.println(availableId);
		}
	}
}
