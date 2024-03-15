package ch08.sec10.exam02;

public class CastingExample {

	public static void main(String[] args) {
		// 자동 타입 변환 
		Vehicle vehicle = new Bus();
		
		vehicle.run(); // 구현 객체 Bus 에서 재정의된 메소드 호출
		
//		vehicle.checkFare(); -> Vehicle 타입이여서, Vehicle 인터페이스 안에 선언된 추상 메소드밖에 사용 못한다.
		
		// 강제 타입 변환
		Bus bus = (Bus) vehicle; 
		bus.run();
		bus.checkFare();
		
		
		
		
	}

}
