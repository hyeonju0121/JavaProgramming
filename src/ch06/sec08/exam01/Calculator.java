package ch06.sec08.exam01;

// powerOn(), plus(), divide(), powerOff() 메소드 생성
public class Calculator {
	// 필드 선언
	
	
	
	// 생성자 선언
	
	
	
	// 메소드 선언
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	
	// 더하기 메소드
	int plus(int p1, int p2) {
		int result = p1 + p2;
		
		return result;
	}
	
	double divide(int x, int y) {
		double result = (double) x / y;
		return result;
	}
	

}
