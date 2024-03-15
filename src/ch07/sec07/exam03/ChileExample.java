package ch07.sec07.exam03;

public class ChileExample {

	public static void main(String[] args) {
		Parent parent = new Child();
		
		parent.method1();
		parent.method2();
		
//		parent.field2 = ""; -> Parent 타입이여서 Child 타입의 필드 접근 불가
//		parent.method3(); -> Parent 타입이여서 Child 타입의 메소드 접근 불가
		
		// 강제 타입 변환
		Child child = (Child) parent;
		
		child.field2 = "data"; // Child 타입으로 변환되면서, Child 타입의 필드 접근 가능
		child.method3(); // Child 타입으로 변환되면서, Child 타입의 필드 접근 가능
		
	}

}
