package ch02.sec09;

public class OperationPromotionExample {

	public static void main(String[] args) {
		// 연산식에서 자동 타입 변환
		
		byte result1 = 10 + 20;
		System.out.println(result1);
		
		byte v1 = 10;
		byte v2 = 20;
		int result2 = v1 + v2;
		System.out.println(result2);
		
		byte v3 = 10;
		int v4 = 100;
		long v5 = 1000l;
		long result3 = v3 + v4 + v5;
		System.out.println(result3);
		
		char v6 = 'A';
		char v7 = 1;
		int result4 = v6 + v7;
		System.out.println(result4);
		System.out.println((char) result4);
		
		int v8 = 10;
		int result5 = v8 / 4;
		double result6 = (double) v8 / 4;
		System.out.println(result5);
		System.out.println(result6);
		
		
		
		
		// ABCDE
		
		char c = 'A';
		
		String str = "" + c;
		
		for (int i = 1; i <= 4; i++) {
			int temp = c + 1;			
			c =(char) temp;
			
			str += c;
		}
		
		System.out.println(str);
		

	}

}
