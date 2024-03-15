package ch13.sec03.exam01;

public class GenericExample {
	public static <T> Box<T> boxing(T t) {
		Box<T> box = new Box<T>();
		box.set(t);
		
		return box;
	}

	public static void main(String[] args) {
		
		/*
		 * Box<String> box1 = new Box<>(); box1.set("ABC");
		 * System.out.println(box1.get());
		 */
		
		Box<String> box1 = boxing("ABC"); // 매개변수 입력값에 따라 <T> 타입은 해당 입력값 타입으로 대체됨 : Object -> String
		Box<Integer> box2 = boxing(100); // Object -> Integer 대체
	}

}
