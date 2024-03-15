package ch07.sec07.exam02;

public class ChildExample {

	public static void main(String[] args) {
		Child child = new Child();
		Parent parent = child; // 자동 타입 변환
		
		parent.method2();
		parent.method1();
//		parent.method3(); -> 호출 불가능
		// parent 변수는 Parent 타입이니까,
		// parent 에 선언된 method1, method2만 호출이 가능하다.
		// method2는 parent 안에 선언된 메소드이기도 하고,
		// 자식 클래스인 child 에서 재정의되어있기 때문에
		// 재정의된 메소드가 우선적으로 실행된 것이다. 
		child.method3();
		
		if (child == parent) {
			System.out.println("같은 객체를 참조");
		} else {
			System.out.println("다른 객체를 참조");
		}
		
		// 같은 객체를 참조하고 있긴 하지만,
		// parent 타입으로 child 객체의 선언된 메소드를 호출할 수 없음!! 

	}

}
