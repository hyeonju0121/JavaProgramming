package ch05.ex;

import java.util.Arrays;
import java.util.Scanner;

public class ex09 {

	public static void main(String[] args) {
		// 학생들의 점수 분석
		
		Scanner sc = new Scanner(System.in);
		

		int check = 0;
		int studentNum = 0;
		
		int[] temp;
		int[] scores = new int[0];
		
		// scoresArrStatus 가 true 이면, scores 배열에 점수가 입력된 상태
		// scoresArrStatus 가 false 이면, scores 배열에 점수가 입력되지 않은 상태
		boolean scoresArrStatus = true;
		boolean status = false; // while 문 종료 조건 ->  true 이면 종료
		
		while(!status) {
			System.out.println("-------------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("-------------------------------------------------");
			
			if (!scoresArrStatus) {
				scores = new int[studentNum];
			} 
			
			System.out.print("선택> ");
			String checkStr = sc.nextLine();
			check = Integer.parseInt(checkStr);
			
			switch(check) {
				case 1: { // 학생수 입력 case 
					System.out.print("학생수> ");
					String studentNumStr = sc.nextLine();
					studentNum = Integer.parseInt(studentNumStr);
					
					scoresArrStatus = false;
					
					break;
				}	
				case 2: { // 학생 점수 입력 case
					if (studentNum == 0) {
						System.out.println("아직 학생 수가 입력되지 않았습니다. 다시 선택해주세요.");
						break;
					} 
					
					temp = new int[studentNum];
					
					for (int i = 0; i < studentNum; i++) {
						System.out.printf("scores[%d]> ", i);
						String scoreStr = sc.nextLine();
						temp[i] = Integer.parseInt(scoreStr);
					}
					
					scoresArrStatus = true;
					
					System.arraycopy(temp, 0, scores, 0, studentNum);
					break;
				}
				case 3: { // 점수 리스트 출력 case
					if (studentNum == 0) {
						System.out.println("아직 학생 수가 입력되지 않았습니다. 다시 선택해주세요.");
						break;
					} 
					for (int i = 0; i < scores.length; i++) {
						System.out.printf("scores[%d]: %d \n", i, scores[i]);
					}
					
					scoresArrStatus = true;
					
					break;
				}
				case 4: { // 점수 분석 case
					if (studentNum == 0) {
						System.out.println("아직 학생 수가 입력되지 않았습니다. 다시 선택해주세요.");
						break;
					} 
					
					int maxScore = Integer.MIN_VALUE;
					int sum = 0;
					double avg = 0;
					
					for (int x : scores) {
						if (maxScore < x) {
							maxScore = x;
						} 
						sum += x;
					}
					
					avg = (double) sum / studentNum;
					
					System.out.println("최고 점수: " + maxScore);
					System.out.println("평균 점수: " + avg);
					
					scoresArrStatus = true;
					
					break; 
				}
				case 5: {
					System.out.println("프로그램 종료"); 
					status = true;
					break;
				}
				
			}
			
		}
	}

}
