package ch06.move;

public class Calculator {
	
	// 불변의 값의 성질을 갖는 데이터는 정적 멤버로 선언하는게 좋다.
	static double pi = 3.14159;
	
	static int plus(int x, int y) {
		return x + y;
	}
	
	// 메소드 오버로딩 
	static int plus(int x, int y, int z) {
		return x + y + x;
	}
	
	// static 으로 선언된 plus 메소드는 
	// 
	// 메소드 실행 블록에 인스턴스 멤버나 필드를 사용하지 않는 메소드라면
	// static 메소드로 선언하는게 관례임

	static int minus (int x, int y)  {
		return x - y;
	}

}
