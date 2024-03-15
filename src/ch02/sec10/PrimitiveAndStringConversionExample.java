package ch02.sec10;

public class PrimitiveAndStringConversionExample {

	public static void main(String[] args) {

		int v1 = Integer.parseInt("10");
		double v2 = Double.parseDouble("3.14");
		boolean v3 = Boolean.parseBoolean("true");
		
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		
		String str1 = String.valueOf(10);
		String str2 = String.valueOf(3.14);
		String str3 = String.valueOf(true);
		String str4 = String.valueOf("  " + 35);
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);

	}

}
