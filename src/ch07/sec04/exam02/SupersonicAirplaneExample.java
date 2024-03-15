package ch07.sec04.exam02;

public class SupersonicAirplaneExample {

	public static void main(String[] args) {

		SupersonicAirplane sa = new SupersonicAirplane();

		sa.takeOff();
		sa.fly(); // 재정의된 자식 클래스 fly() 메소드 실행
		sa.flyMode = FlyModeType.SUPERSONIC;
		sa.fly();
		sa.flyMode = FlyModeType.NOMAL;
		sa.fly(); // flyMode type 이 NOMAL 이 되면서, else 문 안에 부모 클래스 super.fly() 메소드 실행
		sa.land();

	}

}
