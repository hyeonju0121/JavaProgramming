package ch08.sec04;

public interface RemoteControl {
	// 상수 필드
	int MAX_VOLUME = 10; // public static final int MAX_VOLUME = 10; -> public static final 이 생략됨
	int MIN_VOLUME = 0;
	
	// 추상 메소드 선언
	void turnOn();
	
	void turnOff();
	
	void setVolume(int volume);
	
}
