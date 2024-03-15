package ch06.sec10.exam02;

public class Television {
	// Field
	static String company = "MyCompany";
	static String model = "LCD";
	static String info;  // 초기화되지 않은 정적 필드 -> 기본 값으로 null
	
	// static block : 정적 필드 초기화
	static {
		// 정적 블록 내부에는 인스턴스 필드가 들어가면 안됨
		// 인스턴스 필드 초기화 작업은 생성자에서 하잖슈
		info = company + "-" + model;
	}
	
	
	// Constructor : 인스턴스 필드 초기화
	
	// Method

}
