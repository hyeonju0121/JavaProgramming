package ch05.sec06;

public class ArrayCreateByValueListExample1 {

	public static void main(String[] args) {
		/**
		 * 봄, 여름, 가을, 겨울 배열로 선언
		 * 배열의 항목값 읽기
		 * 
		 * 인덱스 1번 항목의 값 변경 
		 * 
		 * 83, 90, 87 배열 선언
		 * 총합과 평균 구하기
		 */
		
		String[] season = {"Spring", "Summer", "Fall", "Winter"};
		
		for (int i = 0; i < season.length; i++) {
			System.out.printf("season[%d]: %s \n", i, season[i]);
		}
		
		season[1] = "여름";
		
	
		System.out.println("===============================");
		
		int[] arr = {83, 90, 87};
		
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		
		double avg = (double) sum / arr.length;
		
		System.out.println("sum: " + sum + ", avg: " + avg);
		

	}

}
