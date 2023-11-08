package part02.ch06.sec10.정적멤버;

public class Television {
	static String company = "Samsung";
	static String model = "LCD";
	static String info;

	static {
		info = company + "-" + model;
	}
}
