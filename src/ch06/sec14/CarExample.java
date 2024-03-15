package ch06.sec14;

public class CarExample {

	public static void main(String[] args) {
		
		Car myCar = new Car();
		System.out.println(myCar.getSpeed());
		
		myCar.setSpeed(-50);
		
		System.out.println(myCar.getSpeed());
		
		myCar.setSpeed(80);
		
		System.out.println(myCar.getSpeed());
		
		
		if (!myCar.isStop()) {
			myCar.setStop(true);
			System.out.println("정지 => " + myCar.getSpeed());
		} else {
			System.out.println(myCar.getSpeed());
		}

	}

}
