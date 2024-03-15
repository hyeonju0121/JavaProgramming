package ch08.sec02;

public class Television implements RemoteControl{

	// turnOn() 추상 메소드 재정의
	@Override
	public void turnOn() {
		System.out.println("tv를 켭니다.");
	}

	// turnOff() 추상 메소드 재정의
	@Override
	public void turnOff() {
		System.out.println("tv를 끕니다.");
	}
	

}
