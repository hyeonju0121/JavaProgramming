package ch04.sec05;

public class SumFrom1To100Example {

	public static void main(String[] args) {
		// 1~100 까지의 합 구하기 (while 문 사용)
		
		int num = 1;
		int sum = 0;
		
		while (num <= 100) {
			sum += num;
			num++;
		}
		
		System.out.println("1 ~ " + (num - 1) + " 까지의 합: " + sum);
	}

}
