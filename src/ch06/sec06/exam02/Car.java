package ch06.sec06.exam02;

public class Car {
	// 필드 선언 (객체에 포함되는 데이터 선언) - 초기화한 경우
	String company = "현대자동차";
	String model;
	String color;
	
	int maxSpeed = 350;
	int speed;


	// 생성자 선언
	// 생성자 선언하는 방법: 클래스와 동일한 이름() {}
	Car() {
		model = "그랜저";
		color = "검정";
	}
	
	
	// 메소드 선언
	void run() {
		speed = 60;
	}
	
	// 필드를 사용하려면, 객체를 생성해야함
	// 왜냐면 객체 안에 필드가 존재하기때문
	// 객체 안에 (필드 + 메소드) 로 구성되어있는데
	// 순서 1. new 연산자를 통해 먼저 객체 생성
	// 순서 2. 생성자를 통해 해당 필드의 값을 저장
	// 순서 3. 객체가 생성이 완료되면 변수한테 객체 번지를 저장함
}
