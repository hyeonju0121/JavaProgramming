package ch03.sec01;

public class IncreaseDecreaseOperatorExample {

	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;
		
		x++; // 11
		++x; // 11 -> 12
		System.out.println(x);  // 12
		
		System.out.println("============");
		y--; // 9
		--y; // 9 -> 8
		System.out.println(y); // 8
		
		System.out.println("============");
		z = x++; // 12
		// x의 값을 먼저 z 에 저장함
		// 이유는? = 도 연산자다
		// = 먼저 진행되어 x의 값을 먼저 저장함! > 그 다음으로 ++
		System.out.println(z); // 12
		System.out.println(x); // 13
		
		System.out.println("============");
		z = ++x; // 13 -> 14
		System.out.println(z); // 14
		System.out.println(x); // 14
		
		System.out.println("============");
		z = ++x + y++; // 15 + 8
		System.out.println(z); // 23
		System.out.println(x); // 15
		System.out.println(y); // 9
		
		
	}

}
