package ch07.sec08.exam02;

public class DriverExample {

	public static void main(String[] args) {

		Driver driver = new Driver();

		Vehicle vehicle = new Vehicle();

		driver.drive(vehicle);

		// Vehicle vehicle = new Bus(); => 자동 타입 변환 발생
		driver.drive(new Bus());
		
		// Vehicle vehicle = new Taxi(); => 자동 타입 변환 발생
		driver.drive(new Taxi());

	}

}
