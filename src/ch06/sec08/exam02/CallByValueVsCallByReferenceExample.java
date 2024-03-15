package ch06.sec08.exam02;

public class CallByValueVsCallByReferenceExample {

	public static void main(String[] args) {

		int value1 = 1; // value1 -> 기본 타입이여서 값만 저장되어 있음
		int[] value2 = { 1 }; // value2 -> 배열의 번지가 저장되어 있음
		
		callByValue(value1);
		System.out.println("value1: " + value1); // 1
		// int arg = value1; 의미와 동일
		// 
		
		callByReference(value2);
		System.out.println("value2[0]: " + value2[0]); // 2
		// int[] arg = value2; 의미와 동일
		
		/**
		 * 기본 타입은 다른 변수에 대입될 때 값 복사가 일어남
		 * 참조 타입은 다른 변수에 대입될 때 번지 복사가 일어난다.
		 * 번지가 전달 -> 객체가 공유된다 -> 값을 변경하면 해당 객체의 값도 변경됨 (같은 번지를 참조하기 때문)
		 * 
		 */
		
		Member member = new Member("유현주");
		System.out.println(member.name);
		callByReference(member);
		System.out.println(member.name);

	}

	public static void callByValue(int arg) { // int arg = value1; 의미와 동일
		arg = 2;

	}

	public static void callByReference(int[] arg) { // int[] arg = value2; 의미와 동일
		arg[0] = 2;
	}
	
	public static void callByReference(Member arg) { // Member arg = > arg.name = "감자바";
		arg.name = "감자바";
	}
}
