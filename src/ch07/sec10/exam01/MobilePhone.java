package ch07.sec10.exam01;

// abstract class
public abstract class MobilePhone {
	public String owner;
	
	public MobilePhone(String owner) {
		this.owner = owner;
	}
	
	public void turnOn() {
		System.out.println("폰 전원을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("폰 전원을 끕니다.");
	}
	
	public abstract void internetSearch(); // 공통적인 기능 (추상 메소드)
	
}
