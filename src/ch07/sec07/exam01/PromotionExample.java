package ch07.sec07.exam01;

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
		
		
		/**
		 * 어차피 b, c, d, e 는 A의 상속관계니까 자동 타입 변환이 가능
		 */
		A a1 = b; 
		A a2 = c;
		A a3 = d;
		A a4 = e;
		
		B b1 = d; // B와 D 는 상속관계 , 자동 타입 변환 O
		C c1 = e; // C와 E 는 상속관계 , 자동 타입 변환 O
		
//		B b3 = e; // B와 E는 상속관계 X -> 자동 타입 변환 X
//		C c2 = d; // C와 D는 상속관계 X -> 자동 타입 변환 X
		
	}

}
