package part02.ch06.sec8.메서드선언과_호출;

public class ComputerExample {
	public static void main(String[] args) {
		Computer computer = new Computer();
		System.out.println(computer.sum(1, 2));
		System.out.println(computer.sum(1, 2, 3, 4, 5));

		int[] values = {1, 2, 3};
		System.out.println(computer.sum(values));
		System.out.println(computer.sum(new int[] {1, 2, 3}));
	}
}
