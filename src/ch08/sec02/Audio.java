package ch08.sec02;

public class Audio implements RemoteControl{

	@Override
	public void turnOn() {
		System.out.println("Audio 를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("Audio 를 켭니다.");
	}

}
