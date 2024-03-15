package ch07.sec03.exam01;

import java.util.*;

public class SmartPhoneExample {
	static int num;

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
		
		
		int i;
//		System.out.println(i);
		
		String str = "abs";
		System.out.println(str.length());// 0
		
		
		String str1 = "abs";
		
		System.out.println(str == str1);
		
		System.out.println(str.equals(str1));
		
		// .length()
		// substring
		// equals()
		// replace
		// split
		
		String[] arr = {"a", "b", "c"};
		
		String[] arr2 = {"a", "b", "c"};
		
		int n = 360;
		byte a = (byte) n;
		System.out.println(a);
		
		char c = '글';
		int code = c;
		System.out.println(code);
		
	}

}
