package ch13.sec02.exam01;

public class GenericExample {

	public static void main(String[] args) {
		Product<Tv, String> production1 = new Product<Tv, String>();
		production1.setKind(new Tv());
		production1.setModel("Smart TV");
		
		Tv tv = production1.getKind();
		String tvModel = production1.getModel();
		
		System.out.println("production1 = " + production1.toString());
		
		Product<Car, String> production2 = new Product<Car, String>();
		production2.setKind(new Car());
		production2.setModel("SUV Car");
		
		System.out.println("production2 = " + production2.toString());
		
		Car car = production2.getKind();
		String carModel = production2.getModel();
		
		
		
	}

}
