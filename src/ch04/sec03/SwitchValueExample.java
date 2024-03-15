package ch04.sec03;

public class SwitchValueExample {

	public static void main(String[] args) {
		// grade 에 따라 스위치된 점수를 score 변수에 대입하기
		// A 학점 : 100 , B 학점 : -20, 그 외 학점: 60
		
		String grade = "B";
		
		int score1 = 0;
		
		switch(grade) {
			case "A":
				score1 = 100;
				break;
			case "B":
				int result = 100 - 20;
				score1 = result;
				break;
			default :
				score1 = 60;
		}
		System.out.println("score1: " + score1);
		
		// ========================================
		
		int score2 = switch(grade) {
			case "A" -> 100;
			case "B" -> {
				int result2 = 100 - 20;
				yield result2;
			}
			default -> 60;
		};
		System.out.println("score2: " + score2);
		

	}

}
