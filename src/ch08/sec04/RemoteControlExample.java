package ch08.sec04;

public class RemoteControlExample {

	public static void main(String[] args) {
		
		/*		// 인터페이스 변수 선언
				RemoteControl rc;
				
				// 인터페이스로 사용할 구현 객체 연결
				rc = new Television();
				
				rc.turnOn();
				rc.setVolume(15);
				rc.turnOff();*/
		
		use(new Television(), 15);
		
		use(new Television(), -10);
		
		use(new Audio(), 8);

	}
	
	public static void use(RemoteControl rc, int volume) {
		rc.turnOn();
		rc.setVolume(volume);
		rc.turnOff();
		
		System.out.println("--------------------");
	}

}
