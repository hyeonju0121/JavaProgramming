package ch06.move;

public class CarExample {

	public static void main(String[] args) {
		
		// company 필드와 info() 메소드는 정적 멤버로 선언 되었기 때문에
		// 객체 생성 없이 사용 가능
		System.out.println(Car.company);
		
		Car.info();
		
		
		// 객체 생성
		Car car1 = new Car("G80");
		
		car1.setSpeed(100);
		
		System.out.println("model: " + car1.model + 
				", speed: " + car1.speed);
		
		car1.run();
		
//		car1.info(); => Car.info();
//		info() 메소드는 정적 멤버여서 참조 변수에 직접 호출하는 건 옳지 않은 표현
	}

}
