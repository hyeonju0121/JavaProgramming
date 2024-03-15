package ch05.sec05;

public class SplitExample {

	public static void main(String[] args) {
		/**
		 * 1, 자바 학습, 참조 타입 String을 학습합니다.,홍길동 => , 문자열 분리
		 * 번호, 제목, 내용, 성명 인덱스 별로 읽기
		 * for 문을 이용해 읽기
		 */
		
		String board = "1,자바 학습,참조 타입 String을 학습합니다.,홍길동";
		
		String[] token = board.split(",");
		
		System.out.println("번호: " + token[0]);
		System.out.println("제목: " + token[1]);
		System.out.println("내용: " + token[2]);
		System.out.println("성명: " + token[3]);
		
		for (int i = 0; i < token.length; i++) {
			System.out.println(token[i]);
		}
		
	

	}

}
