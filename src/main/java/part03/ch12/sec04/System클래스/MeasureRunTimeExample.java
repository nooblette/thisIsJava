package part03.ch12.sec04.System클래스;

public class MeasureRunTimeExample {
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		int sum = 0;
		for(int i = 1; i < 1000000; i++){
			sum += i;
		}
		long endTime = System.nanoTime();

		System.out.println("1~1000000까지의 합 :" + sum);
		System.out.println("계산 소요 시간 : " + (endTime - startTime) + "ns");
	}
}
