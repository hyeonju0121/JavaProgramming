package ch08.sec04;

public class Audio implements RemoteControl {
	// Field 선언
	public int volume;

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

}
