package baekjoon;

import java.util.Scanner;
import java.util.Stack;

public class Bj9012 {
	public static String parenthesisCheck(String str) {
		String result = "YES";

		Stack<String> stack = new Stack<>();

		String[] arr = str.split("");
		for (String x : arr) {
			stack.push(x);
		}

		String check = stack.peek();
		stack.pop();

		int cnt = 1;
		while (!stack.isEmpty()) {
			String temp = stack.peek();

			if (check.equals("(") && cnt == 0) {
				return "NO";
			} 
			
			else if (check.equals(stack.peek())) {
				cnt++;
			} else if (!check.equals(stack.peek()) &&
					(temp + check).equals("()")) {
				cnt--;
				if ((cnt == 0) && stack.size() > 1) { 
					stack.pop();
					check = stack.peek();
					cnt = 1;
				}
			}
			
			stack.pop();

			if (cnt > stack.size()) { return "NO"; }
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			String str = sc.next();

			System.out.println(parenthesisCheck(str));
		}
	}
}
