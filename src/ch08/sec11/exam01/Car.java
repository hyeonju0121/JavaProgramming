package ch08.sec11.exam01;

public class Car {
	Tire tire1 = new KumhoTire();
	Tire tire2 = new HankookTire();
	
	public void run() {
		tire1.roll();
		tire2.roll();
	}
}
