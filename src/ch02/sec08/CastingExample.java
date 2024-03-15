package ch02.sec08;

public class CastingExample {

	public static void main(String[] args) {
		// 강제 형 변환
		
		int v1 = 10;
		byte v2 = (byte) v1;
		System.out.println(v2);
		
		long v3 = 300;
		int v4 = (int) v3;
		System.out.println(v4);
		
		int v5 = 65;
		char v6 = (char) v5;
		System.out.println(v6);
		
		double v7 = 3.14;
		int v8 = (int) v7;
		System.out.println(v8);

	}

}
