package ch07.sec03.exam02;

public class SmartPhone extends Phone{
	// 필드
	public boolean wifi;
	
	// 생성자
	public SmartPhone(String model, String color) {
		super(model, color); 
		// 부모클래스가 매개변수를 입력받는 생성자가 존재한다면,
		// 자동으로 super() 가 호출되지 않는다. 
		// 즉, 부모 생성자의 매개변수 갯수와 맞는 super(,,)을 명시적으로 사용해야한다.
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
