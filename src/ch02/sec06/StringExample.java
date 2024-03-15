package ch02.sec06;

public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "홍길동";
		String job = "프로그래머";
		System.out.println(name);
		System.out.println(job);
		
		String str = "나는 \"자바\"를 배웁니다.";
		System.out.println(str);
		
		String str1 = "나는 \\자바\\를 배웁니다.";
		System.out.println(str1);
		// 파일 경로를 문자열로 입력 받고 싶을 때, 
		// C:\Program Files 이렇게 작성하면 안됨
		// C:\\Program Files 이렇게 작성해야 한다.
		
		String str2 = "나는\t자바를\t배웁니다.";
		System.out.println(str2);
		
		String str3 = "나는\n자바를\n배웁니다.";
		System.out.println(str3);
		
		String str4 = "나는\r자바를\r배웁니다.";
		System.out.println(str4);

	}

}
