package ch06.sec06.exam02;

public class CarExample {

	public static void main(String[] args) {
		// 객체 생성 및 셍성자 호출
		Car myCar1 = new Car();
		
		// 필드 값 읽기
		System.out.println(myCar1.company); // 현대자동차
		System.out.println(myCar1.model); // 그랜저
		System.out.println(myCar1.color); // 검정
		System.out.println(myCar1.maxSpeed); // 350
		System.out.println(myCar1.speed); // 0
		
		// 메소드 호출
		myCar1.run();
		
		System.out.println(myCar1.speed);
		

	}

}
