package ch08.sec12;

public class InstanceOfExample {

	public static void main(String[] args) {
		Taxi taxi = new Taxi();
		Bus bus = new Bus();
		
		ride(bus);
		System.out.println("====================");
		ride(taxi);
	}
	
	public static void ride(Vehicle vehicle) {
		if (vehicle instanceof Bus) {
			Bus bus = (Bus) vehicle;
			bus.checkFare();
		} else {
			Taxi taxi = (Taxi) vehicle;
			taxi.startKM();
		} vehicle.run();
	}

}
