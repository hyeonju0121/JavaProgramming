package ch07.sec02;

public class Phone {
	// 필드 -> 모델, 컬러
	public String model;
	public String color;
	
	
	// 생성자
	public Phone() {
		System.out.println("부모 생성자 호출");
	}
	
	
	// 메소드 
	public void bell() {
		System.out.println("띵동띵동");
	}
	
	public void sendVoice(String message) {
		System.out.println("나: " + message);
	}
	
	public void reveiveVoice(String message) {
		System.out.println("상대방: " + message);
	}
	
	public void hangUp() {
		System.out.println("뚝");
	}
	

}
