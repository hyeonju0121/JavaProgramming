package ch07.sec10.exam01;

public class IPhone extends MobilePhone{
	/*public String owner;
	
	public IPhone(String owner) {
		this.owner = owner;
	}
	
	public void turnOn() {
		System.out.println("폰 전원을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("폰 전원을 끕니다.");
	}*/
	
	public IPhone(String owner) {
		super(owner);
	}

	@Override
	public void internetSearch() {
		System.out.println("사파리로 인터넷을 검색합니다.");
	}
	

}
