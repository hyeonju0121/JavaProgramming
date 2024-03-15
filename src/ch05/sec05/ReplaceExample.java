package ch05.sec05;

public class ReplaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String oldStr = "자바 문자열은 불변입니다. 자바 문자열은 String 입니다.";
		String newStr = oldStr.replace("자바", "Java");
		
		System.out.println(oldStr);
		System.out.println(newStr);
		
		String old = "안녕하세요? 유현주 입니다.";
		old = old.replace("유현주", "치치");
		
		System.out.println(old);
		// replace 메소드에서 새로운 문자열을 리턴하는 것을 
		// 새로운 객체로 받지 않는 다면, 기존 문자열은 쓰레기 객체가 되는 것인가?
		// 참조되는 String 객체가 바뀌는 것 ..? 이겠지? 
		
		// 그렇대..!! 
		

	}

}
