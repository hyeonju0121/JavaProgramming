package ch06.sec13.exam03.package2;

import ch06.sec13.exam03.package1.*;

public class C {
	// Field
	A a = new A();
	
	// Constructor
	public C() {
		a.field1 = 1;
//		a.field2 = 1; -> default
//		a.field3 = 1; -> private
		
		a.method1();
//		a.method2();
//		a.method3();
	}
	
	
	// Method
	
}

