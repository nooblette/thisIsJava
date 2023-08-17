package part02.ch05;

public class SplitExample {
	public static void main(String[] args) {
		String board = "번호,제목,내용,성명";
		String[] array = board.split(",");

		System.out.println(board);
		for (String a: array) {
			System.out.println(a);
		}
	}
}
