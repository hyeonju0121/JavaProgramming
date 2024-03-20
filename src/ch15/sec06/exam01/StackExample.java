package ch15.sec06.exam01;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		Stack<Coin> stack = new Stack<>();
		
		stack.push(new Coin(100));
		stack.push(new Coin(50));
		stack.push(new Coin(280));
		stack.push(new Coin(350));
		stack.push(new Coin(200));
		
		while(!stack.isEmpty()) {
			Coin coin = stack.pop();
			System.out.println("꺼낸 동전: " + coin.getValue() + "원");
		}

	}

}
