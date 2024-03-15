package ch07.sec03.exam01;

public class SmartPhone extends Phone{
	// 필드
	public boolean wifi;
	
	
	// 생성자
	public SmartPhone(String model, String color) {
		// super(); -> 부모의 기본 생성자 호출
		System.out.println("자식 생성자 호출");
		
		this.model = model;
		this.color = color;
	}
	
	// 메소드
	public void setWifi(boolean wifi) {
		this.wifi = wifi;
		System.out.println("와이파이 상태 변경");
	}
	
	public void internet() {
		System.out.println("인터넷 연결합니다");
	}

}
