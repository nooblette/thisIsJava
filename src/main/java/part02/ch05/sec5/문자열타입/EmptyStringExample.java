package part02.ch05.sec5.문자열타입;

public class EmptyStringExample {
	public static void main(String[] args) {
		String hobby = "";
		if(hobby.equals("")){
			System.out.println("hobby 변수가 참조하는 String 객체는 빈 문자열(\"\")");
		}
	}
}
