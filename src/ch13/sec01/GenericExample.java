package ch13.sec01;

public class GenericExample {

	public static void main(String[] args) {
		
		Box<String> box1 = new Box<String>();
		
		box1.content = "졸려요";
		
		String str = box1.content;
		System.out.println(str);
		
		Box<Integer> box2 = new Box<Integer>();
		box2.content = 100; // 자동 박싱
		int num = box2.content; // 자동 언박싱
		System.out.println(num);
		
		
		

	}

}
