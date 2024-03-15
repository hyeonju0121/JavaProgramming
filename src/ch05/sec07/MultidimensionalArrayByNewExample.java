package ch05.sec07;

public class MultidimensionalArrayByNewExample {

	public static void main(String[] args) {
		/**
		 * 각 반의 학생 수가 3명으로 동일할 경우 점수 저장을 위한 2차원 배열 생성
		 * 배열 항목 초기값 출력하기
		 * 배열 항목 값 변경 {{80, 83, 85}, {86, 90, 92}}
		 * 전체 학생의 수학 평균 구하기
		 * 각 반의 학생 수가 다를 경우 점수 저장을 위한 2차원 배열 생성
		 * 배열 항목 초기값 출력하기
		 * 배열 항목 값 변경 {{90, 91}, {92, 93, 94}}
		 * 전체 학생의 영어 평균 구하기
		 */
		
		int[][] mathScores = new int[2][3];
		
		// 배열 항목 초기값 출력
		for (int i = 0; i < mathScores.length; i++) {
			for (int j = 0; j < mathScores[i].length; j++) {
				System.out.printf("mathScores[%d][%d]: %d \n", i, j, mathScores[i][j]);
			}
		}
		
		// 배열 항목 값 변경
		mathScores[0][0] = 80;
		mathScores[0][1] = 83;
		mathScores[0][2] = 85;
		mathScores[1][0] = 86;
		mathScores[1][1] = 90;
		mathScores[1][2] = 92;
		
		// 전체 학생의 수학 점수 평균
		int totalStudent = 0;
		int totalSum = 0;
		for (int i = 0; i < mathScores.length; i++) {
			totalStudent += mathScores[i].length;
			for (int j = 0; j < mathScores[i].length; j++) {
				totalSum += mathScores[i][j];
			}
		}
		
		double totalMathAvg = (double) totalSum / totalStudent;
		System.out.println("전체 학생의 수학 평균 점수: " + totalMathAvg);
		
		System.out.println("==========================================");
		
		int[][] englishScores = new int[2][];
		englishScores[0] = new int[2];
		englishScores[1] = new int[3];
		
		// 배열 항목 초기값 출력
		for (int i = 0; i < englishScores.length; i++) {
			for (int j = 0; j < englishScores[i].length; j++) {
				System.out.printf("englishScores[%d][%d]: %d \n", i, j, englishScores[i][j]);
			}
		}
		
		// 배열 항목 값 변경 {{90, 91}, {92, 93, 94}}
		englishScores[0][0] = 90;
		englishScores[0][1] = 91;
		englishScores[1][0] = 92;
		englishScores[1][1] = 93;
		englishScores[1][2] = 94;
		
		// 전체 학생의 영어 평균 구하기
		totalStudent = 0;
		totalSum = 0;
		
		for (int i = 0; i < englishScores.length; i++) {
			totalStudent += englishScores[i].length;
			for (int j = 0; j < englishScores[i].length; j++) {
				totalSum += englishScores[i][j];
			}
		}
		
		double totalEnglishAvg = (double) totalSum / totalStudent;
		System.out.println("전체 학생의 영어 평균 점수: " + totalEnglishAvg);	

	}

}
