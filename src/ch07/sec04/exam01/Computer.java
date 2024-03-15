package ch07.sec04.exam01;

public class Computer extends Calculator{
	// Field
	
	
	
	// Constructor
	
	
	// Method
	@Override
	public double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle() 실행");
		return Math.PI * r * r;
	}
	
}
