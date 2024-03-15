package ch06.sec10.exam02;

public class TelevisionExample {
	// Field
	String writer = "유현주"; // 인스턴스 필드
	
	static String animal = "치치"; // 정적 필드
	
	// Constructor
	
	// Method

	
	public static void main(String[] args) {
		
		System.out.println(Television.info);
		
		
		System.out.println(TelevisionExample.animal); 
		
//		System.out.println(writer); // 객체 생성 없이 인스턴스 멤버 접근 X
		
		TelevisionExample te = new TelevisionExample();
		System.out.println(te.writer); 

	}

}
