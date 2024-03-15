package ch06.sec11.exam01;

public class Korean {
	// 인스턴스 final 필드 선언 -> 국가만 초기화, 주민은 ㄴ
	final String nation = "대한민국";
	final String ssn;
	
	// 인스턴스 필드 선언
	String name;
	
	// 생성자 선언
	Korean(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}

}
