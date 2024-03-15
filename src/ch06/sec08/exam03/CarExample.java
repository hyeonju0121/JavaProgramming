package ch06.sec08.exam03;

public class CarExample {

	public static void main(String[] args) {
		
		// 객체 생성
		Car car = new Car();
		
		// 메소드 호출
		car.setGas(10);
		
		if (car.isLeftGas()) {
			System.out.println("출발 ~~~~ ");
		}
		
		car.run();
		
		System.out.println("gas를 주입하세요.");

	}

}
