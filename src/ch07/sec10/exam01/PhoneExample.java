package ch07.sec10.exam01;

public class PhoneExample {

	public static void main(String[] args) {
		
//		MobilePhone mp = new MobilePhone(); -> 추상 클래스는 객체 생성 불가능
		
//		AndroidPhone ap = new AndroidPhone("홍길동");
		MobilePhone mp;
		
		mp = new AndroidPhone("홍길동");
		mp.turnOn();
		mp.internetSearch(); // 재정의된 자식 클래스의 메소드가 실행됨 
		mp.turnOff();
		
		System.out.println("------------------------------");
		
//		IPhone ip = new IPhone("유현주");
		mp = new IPhone("유현주");
		mp.turnOn();
		mp.internetSearch(); // 재정의된 자식 클래스의 메소드가 실행됨 
		mp.turnOff();
		
	}

}
