package ch07.sec04.exam02;

public class SupersonicAirplane extends Airplane{
	// Enum 타입 선언 (외부에 선언하지 않고, 클래스 안에 선언하는 방법)
	/*	public enum FlyMode {
			NOMAL,
			SUPERSONIC
		}*/

	public FlyModeType flyMode = FlyModeType.NOMAL;
	
	
	@Override
	public void fly() {
		if (flyMode == FlyModeType.SUPERSONIC) {
			System.out.println("초음속 비행합니다.");
		} else {
			super.fly();
		}
	}
}
