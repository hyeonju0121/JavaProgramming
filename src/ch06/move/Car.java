package ch06.move;

public class Car {

	// 필드 선언
	// 객체마다 공유 데이터 속성이 강하면 정적 멤버로 선언하는게 좋다.
	// -> 현대 자동차 설계도 라고 가정했을 때
	// company 이름은 현대 자동차라고 고정

	static String company = "현대자동차";

	String model; // 객체마다 모델이 다 다르니까 인스턴스 멤버로 선언

	int speed;

	// 생성자 선언
	/**
	 * "필드 이름과 매개변수 이름이 동일할 경우", 
	 * 우선순위는 매개변수가 더 높음 따라서 이름이 동일한 경우에는
	 * 필드에다가 this 를 사용해야한다.
	 * 
	 * this 는 필드 이름과 매개변수 이름이 동일할 때, 구별하기 위해 사용하는 것
	 */
	Car(String model) {
		this.model = model;
	}

	// 메소드 선언
	static void info() {
		System.out.println(company + "가 설계한 자동차");
//		this.model = "그랜저";  // 컴파일 오류
		// this -> 객체 자신을 의미
		// 여기서 info 는 객체가 없어도 호출이 가능함
		// this 가 포함되어 있으면 객체를 갖고 있어야 하는데
		// 메소드는 객체가 없어도 실행이 가능함
		// this.model 을 사용하려면 정적 메소드로 선언하면 안됨
	}

	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	// 객체가 갖고 있는 필드임을 명시하기 위해 this. 사용
	void run() {
		setSpeed(100);
		System.out.println(this.model + 
				"가 달립니다. (시속: " + this.speed + "km/h)");
		
		
	}

}
