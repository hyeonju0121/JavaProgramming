package ch07.sec05.exam02;

public class Car {
	// Field
	public int speed;
	
	
	//Constructor
	
	// Method
	public void speedUp() {
		speed += 1;
	}
	
	// final Method
	public final void stop() {
		System.out.println("차를 멈춥니다.");
		speed = 0;
	}

}
