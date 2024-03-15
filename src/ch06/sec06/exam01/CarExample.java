package ch06.sec06.exam01;

public class CarExample {

	public static void main(String[] args) {
		
		// main() {..}
		
		// Car 객체 생성
		Car myCar1 = new Car();
		
		// Car 객체의 필드값 변경
		myCar1.model = "캐스퍼";
		myCar1.start = true;
		myCar1.speed = 200;
		
		// Car 객체 내부의 필드값 읽기
		System.out.println("모델명: " + myCar1.model);
		System.out.println("시동 여부: " + myCar1.start);
		System.out.println("현재 속도: " + myCar1.speed);
	
		System.out.println("=====================");
		
		Car myCar2 = new Car();
		System.out.println("모델명: " + myCar2.model);
		System.out.println("시동 여부: " + myCar2.start);
		System.out.println("현재 속도: " + myCar2.speed);
	}

}
