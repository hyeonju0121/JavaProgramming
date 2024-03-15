package ch08.sec02;

public class RemoteControlExample {
	public static void main(String[] args) {
		// 리모콘 변수 선언 -> 인터페이스 선언
		RemoteControl rc;
		
		// 리모콘과 연결된 객체 대입 -> 인터페이스에 사용할 구현 객체 대입
		rc = new Television();
		
		// 리모콘을 통해서 TV 에 전원을 켬 -> Television 객체에 재정의된 메소드가 호출됨
		rc.turnOn();
		
		// 리모콘을 통해서 TV 에 전원을 끔
		rc.turnOff();
		
		System.out.println("=========================");
		
		use(new Audio());
		
		System.out.println("\n=========================");
		
		use(new Television());
	}
	
	// 매개변수가 인터페이스 타입인 메소드로 실제로 많이 사용한다.
	public static void use(RemoteControl rc) {
		rc.turnOn();
		rc.turnOff();
	}

}
