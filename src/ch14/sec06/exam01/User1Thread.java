package ch14.sec06.exam01;

public class User1Thread extends Thread {
	// Field
	// 공유 객체가 저장될 필드 선언
	private Calculator calculator;
	
	// Constructor
	public User1Thread() {
		// Thread method - setName() 스레드 이름 지정
		setName("User1Thread"); 
	}
	
	// Method
	// setter
	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}
	
	@Override
	public void run() {
		calculator.setMemory(100);
	}
}
