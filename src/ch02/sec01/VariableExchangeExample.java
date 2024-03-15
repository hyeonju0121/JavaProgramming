package ch02.sec01;

public class VariableExchangeExample {

	public static void main(String[] args) {
		// 변수 x 와 y 값 교환
		
		int x = 3;
		int y = 5;
		
		System.out.println("x = " + x + ", y = " + y);
		System.out.println("x 번지 = " + System.identityHashCode(x) + 
				", y 번지 : " + System.identityHashCode(y) + "\n");
		
		System.out.println("===================================");
		
		int temp = x;
		x = y;
		y = temp;
		
		System.out.println("# x, y 값 교환한 경우");
		System.out.println("x = " + x + ", y = " + y);
		// --------- 값 교환 시 주소값 확인 ---------
		System.out.println("temp 번지 = " + System.identityHashCode(temp));
		System.out.println("x 번지 = " + System.identityHashCode(x) + 
				", y 번지 = " + System.identityHashCode(y)+ "\n");
		
		System.out.println("===================================");
		
		// --------- 주소값 확인 ------------------
		int a = 10;
		int b = 10;
		System.out.println("# 초기값이 같은 경우");
		System.out.println("a = " + a + ", b = " + b);
		System.out.println("a 번지 = " + System.identityHashCode(a) + 
				", b 번지 = " + System.identityHashCode(b));
		
		boolean result1 = a == b;
		System.out.println("result1 = " + result1);


	}

}
