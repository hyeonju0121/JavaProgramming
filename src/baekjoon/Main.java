package baekjoon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static StringBuilder solution(int[] arr) {
		StringBuilder sb = new StringBuilder();

		int[] arr2 = new int[arr.length];
		System.arraycopy(arr, 0, arr2, 0, arr.length);

		Arrays.sort(arr);
		ArrayList<Integer> data = new ArrayList<>();
		for (int n : arr) {
			data.add(n);
		}

		System.out.println("arr: " + Arrays.toString(arr));
		System.out.println("arr2: " + Arrays.toString(arr2));

		int top = 0;
		int check = 0;
		Stack<Integer> stack = new Stack<Integer>();
		for (int i = 0; i < arr2.length; i++) {
			for (int j = check; j < data.size(); j++) {
				System.out.println("========================");
				System.out.println("data: " + data);
				System.out.println("arr2[]: " + Arrays.toString(arr2));

				System.out.println("current stack.peek : " + top + ", current data[j]: " + data.get(j)
						+ ", current arr2[i] -> " + arr2[i]);

				if (stack.size() == 0) {
					stack.push(data.get(j));
					sb.append("+").append("\n");
					top = stack.peek();
				}

				else if (top == arr2[i]) {
					top = stack.peek();
					int idx = stack.indexOf(top);
					System.out.println("idx: " + idx);
					stack.pop();
					top = stack.peek();
					data.remove(idx);
					sb.append("-").append("\n");
					
					check = j - 1;
					
					System.out.println("After data: " + data);
					System.out.println("stack: " + stack);
					break;
				} else if (top != arr2[i]) {
					int idx = stack.indexOf(top);
					stack.push(data.get(j));
					top = stack.peek();
					sb.append("+").append("\n");
				
				}

				System.out.println("After data: " + data);
				System.out.println("stack: " + stack);
			}
		}

		return sb;
	}

	public static void main(String[] args) {
		Main main = new Main();
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println(solution(arr));
	}
}
