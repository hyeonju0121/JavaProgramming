package ch06.sec09;

public class Car {
		// TODO Auto-generated method stub
		//Field Declaration
		static String company = "Hyundai Car";
		static String model;
		int speed;
		
		// Constructor
		Car(String model){
			this.model = model;
		}
		
		//Method
		static void info() {
			System.out.println(company + "가 설계한 자동차");
			model = "그랜저";
		}
		
		void setSpeed(int speed) {
			this.speed = speed;
		}
		
		void run() {
			setSpeed(100);
			System.out.println(model + "가 달립니다.(시속:" + speed + "km/h");
		}
}
