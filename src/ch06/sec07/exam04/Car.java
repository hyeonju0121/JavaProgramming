package ch06.sec07.exam04;

public class Car {
	// 필드 선언
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	String name;
	
	// 생성자 선언
	Car() {}  // 기본 생성자 -> company 만 값이 있고, 나머지 필드는 null
	
	Car(String model) {
		this.model = model;
	}
	
	Car(String model, String color) {
		this.model = model;
		this.color = color;
	}
	
//	Car(String color, String model) { 오버로딩 아님
//		this.color = color;
//		this.model = model;
//	}

	Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}

	
	// 메소드 호출

}
