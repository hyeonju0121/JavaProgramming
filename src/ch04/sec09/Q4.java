package ch04.sec09;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 0;
		int y = 0;
		
		int sum = 0;
		while(sum != 5) {
			x = (int) (Math.random() * 6) + 1;
			y = (int) (Math.random() * 6) + 1;
			
			System.out.printf("(%d,%d)", x, y);
			System.out.println();
			
			sum = x + y;
			
			if (sum == 5) {
				System.out.println("눈의 합이 5입니다. 실행을 멈춥니다.");
				break;
			}
		}

	}

}
