package baekjoon;

import java.util.*;

public class Bj2563 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[][] arr = new int[n][4];

		int sum = 0;
		for (int i = 0; i < n; i++) {
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
			arr[i][2] = arr[i][0] + 10;
			arr[i][3] = arr[i][1] + 10;

			// 정사각형의 넓이 누적 합 구하기
			sum += (arr[i][2] - arr[i][0]) * (arr[i][3] - arr[i][1]);
		}

		int cnt = 0;
		int tempSum = 0;
		int totalSum = 0;
		for (int i = 0; i < arr.length; i++) {
			// 겹친 부분 넓이 구하고, 누적 합에서 빼기
			for (int j = i + 1; j < arr.length; j++) {
				int x1 = arr[j][0];
				int x = arr[i][0];
				
				if (Math.abs(x1 - x) < 10) { // 겹치는 부분
					cnt++; // 겹치는 부분을 발견하면 cnt++
					
					int num1 = arr[i][2] - arr[j][0];
					int num2 = (arr[j][1] + 10) - arr[i][1];
					tempSum = num1 * num2; // 겹치는 부분의 넓이
					
					totalSum += tempSum;
					tempSum = 0;
				}

			}

			// cnt 범위 -> 최대 (arr.length - 1)
		}
		int result = sum - totalSum;
		System.out.println(result);
	}

}
