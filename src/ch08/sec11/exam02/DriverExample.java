package ch08.sec11.exam02;

public class DriverExample {

	public static void main(String[] args) {
		Driver driver = new Driver();
		
		// 자동 타입 변환 (Vehicle 인터페이스에 Bus 구현 객체 대입)
		Vehicle vehicle = new Bus();
		
		// 오버라이딩 메소드 호출 
		driver.drive(vehicle);
		
		
		driver.drive(new Bus());
		driver.drive(new Taxi());

	}

}
