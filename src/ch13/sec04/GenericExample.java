package ch13.sec04;

public class GenericExample {
	// 제한된 타입 파라미터를 갖는 제네릭 메소드 
	// Number 클래스를 상속하는 타입 (즉, 자식 객체만 T 타입으로 올 수 있다.)
	public static <T extends Number> boolean compare(T t1, T t2) {
		// T 타입 출력 
		// .getClass() : 해당 타입의 클래스 이름 갖고오기
		// .getSimpleName() : 해당 클래스의 이름 리턴
		System.out.println("compare(" + t1.getClass().getSimpleName() + 
				", " + t2.getClass().getSimpleName() + ")");
		
		// Number 클래스의 메소드 사용 
		double v1 = t1.doubleValue();
		double v2 = t2.doubleValue();
		
		return (v1 == v2);                                            
	}

	public static void main(String[] args) {
		// 제네릭 메소드 호출
		boolean result1 = compare(10, 20);                    
		System.out.println();
		
		// 제네릭 메소드 호출
		boolean result2 = compare(4.5, 4.5);
		System.out.println("result2 = " + result2);
	}

}
