package part03.ch12.sec09.형식클래스;

import java.text.DecimalFormat;

public class DecimalFormatExample {
	public static void main(String[] args) {
		double num = 1234567.89;

		DecimalFormat decimalFormat = new DecimalFormat("#,###");
		System.out.println(decimalFormat.format(num));

		decimalFormat = new DecimalFormat("#,###.0");
		System.out.println(decimalFormat.format(num));
	}
}
