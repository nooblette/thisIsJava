package part03.ch12.sec07.수학클래스;

public class MathExample {
	public static void main(String[] args) {
		// 올림값 얻기
		double v1 = Math.ceil(5.3);
		System.out.println("v1: " + v1);

		// 내림값 얻기
		double v2 = Math.floor(5.3);
		System.out.println("v2: " + v2);

		// 큰 값 얻기
		long v3 = Math.max(3, 7);
		System.out.println("v3: " + v3);

		// 작은값 얻기
		long v4 = Math.min(3, 7);
		System.out.println("v4: " + v4);

		// 반올림값 얻기
		double value = 12.3456;
		double temp1 = value * 100;
		long temp2 = Math.round(temp1);
		System.out.println("temp2: " + temp2);
	}
}
