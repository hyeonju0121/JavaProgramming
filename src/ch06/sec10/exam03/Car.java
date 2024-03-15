package ch06.sec10.exam03;

public class Car {
	
	// 인스턴스 필드
	int speed; 
	
	// 인스턴스 메소드
	void run( ) {
		System.out.println(speed + "으로 달린다.");
	}
	
	// 정적 메소드 선언
	static void simulate() {
		Car car1 = new Car();
		
		car1.speed = 100;
		
		car1.run();
	}

	public static void main(String[] args) {
		
		// 정적 메소드 호출
		simulate();
		
		// 객체 생성
		Car myCar = new Car();
		
		myCar.speed = 60;
		
		myCar.run();
		
	}

}
