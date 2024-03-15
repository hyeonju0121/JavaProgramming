package ch04.sec04;

public class MultiplicationTableExample {

	public static void main(String[] args) {
		// 2단~ 9단 구구단 출력하기
		
		int num = 2;
		
		for (int i = num; i <= 9; i++) {
			System.out.println("==== " + i + "단 =====");
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%d * %d = %d", i, j, i * j);
				System.out.println();
			}
			System.out.println();
		}
		

	}

}
