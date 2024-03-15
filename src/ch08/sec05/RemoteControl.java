package ch08.sec05;

public interface RemoteControl {
	// 상수 필드
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;

	// 추상 메소드 선언
	void turnOn();

	void turnOff();

	void setVolume(int volume);

	// 디폴트 메소드 선언
	default void setMute(boolean mute) {
		if (mute) {
			System.out.println("무음 처리 합니다.");
			setVolume(MIN_VOLUME);
		} else {
			// 무음을 해제할 시 기존 사운드를 가져오려면 어떻게 해야하지?
			// int originVolume 선언해서 기존 볼륨을 갖고 있다가
			// 무음 해제하는 경우 다시 setVolume(originVolume) 해주까?
			System.out.println("무음 해제 합니다.");
		}

	}

}
