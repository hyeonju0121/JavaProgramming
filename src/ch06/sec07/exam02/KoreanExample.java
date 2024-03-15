package ch06.sec07.exam02;

public class KoreanExample {

	public static void main(String[] args) {
		
		// Korean 객체 생성
		Korean p1 = new Korean("유현주", "123456-1234567");

		// Korean 객체 데이터 읽기
		System.out.println("p1.nation: " + p1.nation);
		System.out.println("p1.name: " + p1.name);
		System.out.println("p1.ssn: " + p1.ssn);
		
		// 또 다른 Korean 객체 생성
		Korean p2 = new Korean("홍길동", "456789-1234567");
		
		
		// 또 다른 Korean 객체 데이터 읽기
		System.out.println("p2.nation: " + p2.nation);
		System.out.println("p2.name: " + p2.name);
		System.out.println("p2.ssn: " + p2.ssn);

	}

}
