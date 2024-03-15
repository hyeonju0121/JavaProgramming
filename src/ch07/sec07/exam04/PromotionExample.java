package ch07.sec07.exam04;

class A {
	
} 

class B extends A {
	
} 

class C extends A {
	
}

class D extends B {
	
}

class E extends C {
	
}


public class PromotionExample {
	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		A a1 = b; // 부모 - 자식 
		A a2 = c; // 부모 - 자식
		A a3 = d; // 상속관계에서 상위 타입 - 하위 타입
		A a4 = e; // 상속관계에서 상위 타입 - 하위 타입
		
		B b1 = d; // 부모 - 자식
		C c1 = e; // 부모 - 자식
		
//		B b2 = e; // 상속관계 X
//		C c2 = d; // 상속관계 X
	}
}
