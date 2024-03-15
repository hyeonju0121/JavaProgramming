package ch08.sec05;

public class RemoteControlExample {

	public static void main(String[] args) {

		use(new Television(), 15);
		
		use(new Television(), -10);
		
		use(new Audio(), 8);
		
		
		RemoteControl rc = null;
		
		rc = new Audio();
		use(rc, 10);
		
		rc.setMute(true);
		rc.setMute(false);

	}
	
	public static void use(RemoteControl rc, int volume) {
		rc.turnOn();
		rc.setVolume(volume);
		rc.turnOff();
		
		System.out.println("--------------------");
	}

}
