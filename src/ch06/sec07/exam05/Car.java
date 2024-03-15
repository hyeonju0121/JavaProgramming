package ch06.sec07.exam05;

public class Car {
	// 필드 선언
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	String carName; 
	
	Car(String model) {
		this(model, "은색", 250, "붕붕이");
	}
	
	Car(String model, String color) {
		this(model, color, 250, "붕붕이");
	}
	
	Car(String model, String color, int maxSpeed, String carName){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
		this.carName = carName;
	}
	
}
