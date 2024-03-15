package ch08.sec05;

public class Audio implements RemoteControl {
	// Field 선언
	public int volume;
	public int memoryVolume;

	// turnOn() 추상 메소드 재정의
	@Override
	public void turnOn() {
		System.out.println("Audio를 켭니다.");
	}

	// turnOff() 추상 메소드 재정의
	@Override
	public void turnOff() {
		System.out.println("Audio를 끕니다.");
	}

	// setVolume(int volume) 추상 메소드 정의
	@Override
	public void setVolume(int volume) {
		if (volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 Audio 볼륨: " + this.volume);
	}
	
	// default method override
	@Override
	public void setMute(boolean mute) {
		if (mute) {
			System.out.println("무음 처리 합니다.");
			memoryVolume = volume;
			setVolume(MIN_VOLUME);
		} else {
			// 무음을 해제할 시 기존 사운드를 가져오려면 어떻게 해야하지?
			// int originVolume 선언해서 기존 볼륨을 갖고 있다가
			// 무음 해제하는 경우 다시 setVolume(originVolume) 해주까?
			System.out.println("무음 해제 합니다.");
			setVolume(memoryVolume);
		}
	}

}
