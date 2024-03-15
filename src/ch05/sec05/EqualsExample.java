package ch05.sec05;

public class EqualsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "홍길동";
		String str2 = "홍길동";
		
		if (str1 == str2) {
			System.out.println("str1 과 str2는 참조하는 변수가 같다.");
		} else {
			System.out.println("str1 과 str2는 참조하는 변수가 다르다.");
		}
		
		if (str1.equals(str2)) {
			System.out.println("str1 과 str2는 문자열이 같다.");
		} else {
			System.out.println("str1과 str2는 문자열이 다르다.");
		}
		
		System.out.println("========================================");
		
		String str3 = new String("홍길동");
		String str4 = new String("홍길동");
		
		if (str3 == str4) {
			System.out.println("str3 과 str4는 참조하는 변수가 같다.");
		} else {
			System.out.println("str3 과 str4는 참조하는 변수가 다르다.");
		}
		
		if (str3.equals(str4)) {
			System.out.println("str1 과 str2는 문자열이 같다.");
		} else {
			System.out.println("str1과 str2는 문자열이 다르다.");
		}

	}

}
