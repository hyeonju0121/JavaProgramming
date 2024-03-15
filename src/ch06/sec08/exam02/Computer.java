package ch06.sec08.exam02;

public class Computer {
	// Field 선언
	
	
	// Constructor 선언
	
	
	
	// Method 선언
	int sum1(int[] values) {
		int result = 0;
		
		for (int x : values) {
			result += x;
		}
		
		return result;
	}
	
	// 가변길이를 갖는 메소드 선언
	int sum2(int ... values) {
		int result = 0;
		
		for (int x : values) {
			result += x;
		}
		
		return result;
	}

}
