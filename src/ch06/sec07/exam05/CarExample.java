package ch06.sec07.exam05;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car car1 = new Car("자가용", "검정"); // 2번 생성자 호출
		System.out.println(car1.company);
		System.out.println(car1.model);
		System.out.println(car1.color);
		System.out.println(car1.maxSpeed);
		System.out.println(car1.carName);
		
		Car car2 = new Car("자가용"); // 1번 생성자 호출
		System.out.println(car2.company);
		System.out.println(car2.model);
		System.out.println(car2.color);
		System.out.println(car2.maxSpeed);
		System.out.println(car2.carName);
	}

}
