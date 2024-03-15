package ch06.sec07.exam02;

public class Korean {
	
	// 필드 선언
	String nation = "대한민국";
	String name; // 변하는 값들 이니까 초기화하지 않고 선언
	String ssn;  // 변하는 값들 이니까 초기화하지 않고 선언
	
	// 생성자 선언
	Korean(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	}
	
}
