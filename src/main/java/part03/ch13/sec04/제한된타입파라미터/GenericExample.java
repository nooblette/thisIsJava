package part03.ch13.sec04.제한된타입파라미터;

public class GenericExample {
	public static<T extends Number> boolean compare(T t1, T t2){
		double v1 = t1.doubleValue();
		double v2 = t2.doubleValue();
		return v1 == v2;
	}
	public static void main(String[] args) {
		// 제네릭 메서드 호출
		boolean result = compare(2.5, 4.5);
		System.out.println(result);

		// 제네릭 메서드 호출
		result = compare(2.5, 2.5);
		System.out.println(result);
	}
}
