package ch05.sec05;

public class CharExample {

	public static void main(String[] args) {
		// 주민번호에서 성별에 해당하는 7번째 문자를 읽고 남자 또는 여자인지 출력
		
		String ssn = "0001214234567";
		
		char sex = ssn.charAt(7);
		
		switch(sex) {
			case '1':
			case '3':
				System.out.println("남자입니다.");
				break;
			case '2':
			case '4':
				System.out.println("여자입니다.");
				break;
		}

	}

}
