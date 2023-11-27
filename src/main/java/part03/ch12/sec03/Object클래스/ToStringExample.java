package part03.ch12.sec03.Object클래스;

public class ToStringExample {
	public static void main(String[] args) {
		SmartPhone smartPhone = new SmartPhone("애플", "iPhone");

		System.out.println(smartPhone.toString());
		System.out.println(smartPhone.getCompany().toString());
	}
}
