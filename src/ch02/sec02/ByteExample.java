package ch02.sec02;

public class ByteExample {

	public static void main(String[] args) {
		/*
		 * byte : -128 ~ 127
		 * 허용 범위가 벗어나는 경우, 에러 발생
		 * Type mismatch: cannot convert from int to byte
		 */
		byte v1 = 100;
		short v2 = 100;
		int v3 = 100;
		long v4 = 100;
		// 메모리를 제일 적게 잡는 타입으로 하는 게 프로그램에 좋다.
		// but, 연산을 할 경우에는 cpu 에 영향을 많이 받는다.
		// byte 를 맞춰두고 계산을 함 (cpu 계산 방식..) 
		// byte v1 + byte v5 를 하려고해도, 1byte를 int 타입인 4byte로 변환해서 계산하기 때문에
		// 오히려 더 연산이 느려짐 ..! 
		// 정수끼리 계산을 할 때는, 타입은 int 로 하는 게 제일 좋다. 
		
		byte a = 30;
		byte b = 50;
		
		// byte result = a + b; // (before)
		int result = a + b; // (after)
		System.out.println(result);
		// Type mismatch: cannot convert from int to byte
		// a + b 한 80 값은 byte 에 들어가는 값임에도 불구하고,
		// + 연산은 기본 정수형 타입인 int 로 바뀌기 때문에, (1byte 가 4byte로 바뀌어서 연산됨 -> 4byte + 4byte)
		// byte 로 선언된 result 값은 타입 에러가 발생한다. result 를 int or long 으로 선언해야함!
		
		byte var1 = -128;
		byte var2 = -30;
		byte var3 = 0;
		byte var4 = 30;
		byte var5 = 127;
		// byte var6 = 128; // 허용 범위가 벗어나는 경우, 에러 발생
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		System.out.println(var5);
		
	}

}
