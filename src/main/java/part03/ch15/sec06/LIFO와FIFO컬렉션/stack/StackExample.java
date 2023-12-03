package part03.ch15.sec06.LIFO와FIFO컬렉션.stack;

import java.util.Stack;

public class StackExample {
	public static void main(String[] args) {
		// Stack 컬렉션 생성
		Stack<Coin> stack = new Stack<>();

		// 동전 넣기
		stack.push(new Coin(100));
		stack.push(new Coin(50));
		stack.push(new Coin(500));
		stack.push(new Coin(10));

		// 동전 꺼내기
		while(!stack.isEmpty()){
			Coin coin = stack.pop();
			System.out.println(coin.getValue());
		}
	}
}
