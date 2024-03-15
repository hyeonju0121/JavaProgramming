package ch07.sec06.package1;

public class B {
	// Field
	
	
	// Constructor
	
	
	// Method
	public void method() { // 같은 패키지 내에서는 접근 허용
		A a = new A();
		a.field = "a";
		a.method();
	}

}
