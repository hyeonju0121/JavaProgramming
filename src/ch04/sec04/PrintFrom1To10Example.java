package ch04.sec04;

public class PrintFrom1To10Example {

	public static void main(String[] args) {
		// 1 부터 10까지 출력하기
		
		for (int i = 1; i <= 10; i++) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		System.out.println("=============================");
		System.out.println("x와 y의 합이 10이 되는 x, y 출력");
		
		for (int x = 1, y = 9; x <= 5 && y >= 5; x++, y--) {
			System.out.println(x + ", " + y);
		}
		
		System.out.println("=============================");
		
		int temp = 10;
		for (int z = 1; z <= 5; z++) {
			temp -= z;
			System.out.println(z + ", " + temp);
			temp = 10;
		}
		// 기존에 이중 for 문으로 배열 탐색을 할 때, 
		// 차라리 이중 for 문 말고, for 문 한 개에 변수를 두 개 추가한다면 오히려 메모리 낭비일까?
		// 아니면, 배열 데이터가 많다면 시간복잡도상 오히려 변수 두 개 추가하는게 나을까? 
		
		// -> 가독성은 이중 for 문이 더 좋다! 
		

	}

}
