package ch05.sec06;

public class ArrayCreateByValueListExample2 {
	public static void printItem(int[] arr) {
		
		for (int i = 0; i < arr.length; i++) {
			System.out.printf("arr[%d]: %d \n", i, arr[i]);
		}
	}

	public static void main(String[] args) {
		/**
		 * scores 배열 변수 선언
		 * scores 배열에 {83, 90, 87} 값 대입
		 * 배열 항목의 총합을 구하고 출력
		 * 배열을 매개값으로 주고, printItem() 메소드 호출
		 * 
		 * printItem() 메소드 선언 -> 배열을 출력하는 메소드
		 */
		
		int[] scores;
		scores = new int[] {83, 90, 87};
		
		int sum = 0;
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		System.out.println("scores 총 합: " + sum);
		
		System.out.println("==========================");
		
		printItem(scores);
		
	}

}
