package ch06.sec08.exam01;

public class CalculatorExample {

	public static void main(String[] args) {
		
		// 객체 생성
		Calculator cal = new Calculator();
		
		cal.powerOn();
		
		int plusResult = cal.plus(3, 5);
		System.out.println(plusResult);
		
		double divideResult = cal.divide(3, 5);
		System.out.println(divideResult);
		
		cal.powerOff();

	}

}
