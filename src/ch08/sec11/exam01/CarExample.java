package ch08.sec11.exam01;

public class CarExample {

	public static void main(String[] args) {
		// 자동차 객체 생성
		Car myCar = new Car();
		
		myCar.run();
		
		// 타이어 교체 
		myCar.tire2 = new KumhoTire();
		myCar.run();
		
		
	}

}
