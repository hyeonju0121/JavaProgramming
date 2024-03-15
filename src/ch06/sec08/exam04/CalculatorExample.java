package ch06.sec08.exam04;

public class CalculatorExample {

	public static void main(String[] args) {
		
		Calculator rectangle1 = new Calculator();
		
		double result1 = rectangle1.areaRectangle(10);
		System.out.println("result1: " + result1);
		
		Calculator rectangle2 = new Calculator();
		double result2 = rectangle2.areaRectangle(20, 10);
		System.out.println("result2: " + result2);
	}

}
