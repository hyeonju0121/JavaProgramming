package ch07.sec06.package2;

import ch07.sec06.package1.*;

public class D extends A { 

	@Override
	protected void method() { // 다른 패키지여도 상속 받으면, 접근이 가능함
		field = "a";
		method();
	}
}
