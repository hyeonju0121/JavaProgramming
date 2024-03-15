package ch10.sec02.exam02;

// 일반 예외 -> 컴파일러가 인지함
public class ExceptionHandlingExample1 {
	public static void main(String[] args) {
		// class path
//		Class.forName("java.lang.String");
		
		try {
			Class.forName("java.lang.String");
			System.out.println("해당 클래스가 존재함");
		} catch(ClassNotFoundException e) {
			System.out.println("해당 클래스가 존재하지 않음");
		} 
	}

}
