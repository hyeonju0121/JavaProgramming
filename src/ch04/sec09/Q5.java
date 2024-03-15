package ch04.sec09;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum = 0;

		for (int x = 1; x <= 10; x++) {
			for (int y = 1; y <= 10; y++) {
				
				sum = (4 * x) + (5 * y);
				if (sum == 60) {
					System.out.printf("(%d,%d)", x, y);
					System.out.println();
				}
			}
		}

	}

}
