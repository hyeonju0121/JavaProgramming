package ch05.ex;

public class ex07 {

	public static void main(String[] args) {

		int[] array = {1, 5, 3, 8, 2};
		
		int max = Integer.MIN_VALUE;
		for (int x : array) {
			if (max < x) {
				max = x;
			}
		}
		
		System.out.println("최댓값: " + max);
	}

}
