package ch07.sec02;

public class SmartPhoneExample {

	public static void main(String[] args) {
		SmartPhone p = new SmartPhone("아이폰", "gold");
		
		System.out.println("model: " + p.model);
		System.out.println("color: " + p.color);
		
		System.out.println("와이파이 상태: " + p.wifi);
		
		p.bell();
		p.sendVoice("여보세요");
		p.reveiveVoice("안녕하세요, 저는 홍길동");
		p.sendVoice("반갑습ㄴㅣ다");
		p.hangUp();
		
		p.setWifi(true);
		p.internet();
		
		
	}

}
