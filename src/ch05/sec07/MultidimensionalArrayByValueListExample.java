package ch05.sec07;

public class MultidimensionalArrayByValueListExample {

	public static void main(String[] args) {
		/**
		 * 2차원 배열 scores 생성 -> {{80, 90, 96}, {76, 88}}
		 * 반의 수 출력
		 * 첫 번째 반의 학생 수 출력
		 * 두 번째 반의 학생 수 출력
		 * 
		 * 첫 번째 반의 세 번째 학생 점수 읽기
		 * 두 번째 반의 두 번째 학생 점수 읽기
		 * 
		 * 첫 번째 반의 평균 점수 구하기
		 * 두 번째 반의 평균 점수 구하기
		 * 
		 * 전체 학생 평균 점수 구하기
		 */
		
		int[][] scores = {{80, 90, 96}, {76, 88}};
		
		System.out.println("총 반의 수: " + scores.length);
		
		System.out.println("첫 번째 반의 학생 수: " + scores[0].length);
		System.out.println("두 번째 반의 학생 수: " + scores[1].length);
		
		System.out.println("===================================================");
		
		System.out.println("scores[0][2] 학생의 점수: " + scores[0][2]);
		System.out.println("scores[1][1] 학생의 점수: " + scores[1][1]);
		
		System.out.println("===================================================");
		
		int sumA = 0;
		for (int i = 0; i < scores[0].length; i++) {
			sumA += scores[0][i];
		}
		
		double avgA = (double) sumA / scores[0].length;
		
		System.out.println("첫 번째 반의 평균 점수: " + avgA + "점");
		
		int sumB = 0;
		for (int i = 0; i < scores[1].length; i++) {
			sumB += scores[1][i];
		}
		double avgB = (double) sumB / scores[1].length;
		System.out.println("두 번째 반의 평균 점수: " + avgB + "점");
		
		// 전체 학생 평균 점수 구하기
		int totalStudent = 0;
		int totalSum = 0;
		
		for (int i = 0; i < scores.length; i++) {
			totalStudent += scores[i].length; 
			for (int j = 0; j < scores[i].length; j++) {
				totalSum += scores[i][j];
			}
		}
		
		double totalAvg = (double) totalSum / totalStudent;
		System.out.println("전체 학생의 평균 점수: " + totalAvg + "점");
		

	}

}
