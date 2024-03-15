package ch06.sec15;

public class Singleton {
	// 필드
	private static Singleton singleton = new Singleton();
	
	
	// 생성자
	// private 을 설정 안하면, 자동으로 기본 생성자가 public 으로 생성됨
	// private 으로 설정 시, new 를 거치면 생성자를 호출 못하게 되면서
	// 외부에서 접근을 못하게 된다.
	private Singleton() {
		
	}
	
	
	// 메소드
	public static Singleton getSingleton() {
		return singleton;
	}

}
