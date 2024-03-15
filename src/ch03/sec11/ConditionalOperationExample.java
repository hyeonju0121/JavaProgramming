package ch03.sec11;

public class ConditionalOperationExample {

	public static void main(String[] args) {
		// 삼항연산자
		int score = 85;
		
//		char grade = (score > 90)? 'A' : 'B';
		char grade = (score > 90)? 'A' : ((score > 80) ? 'B' : 'C');
		
		System.out.println(grade);

	}

}
