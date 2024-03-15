package ch12.sec06;

public class BoxingUnBoxingExample {

	public static void main(String[] args) {
		// Boxing
		Integer obj = 100;
		System.out.println("value = " + obj.intValue());
		
		System.out.println(obj.toString()); // 이건 그냥 boxing 한 값 출력임 
		
		// UnBoxing
		int value = obj;
		System.out.println("value = " + value);

		// 연산 시 Unboxing
		int result = obj + 100;
		System.out.println("result = " + result);
		
		Integer x = 200;
		Integer y = 200;
		System.out.println(x == y);
		System.out.println(x.equals(y));
		
		Integer x1 = 50;
		Integer y1 = 50;
		System.out.println(x1 == y1);
		System.out.println(x1.equals(y1));
		
		Integer x2 = 350;
		Integer y2 = 320;
		System.out.println(x2 == y2);
		System.out.println(x2.equals(y2));
		
		Integer x3 = 130;
		Integer y3 = 127;
		System.out.println(x3 == y3);
		System.out.println(x3.equals(y3));
	}

}
