package ch13.sec02.exam03;

public class Box<T> {
	public T content;

	public boolean compare(Box<T> other) {
		boolean result = content.equals(other.content);
		// 해당 클래스는 Object 의 equals 
		// 하지만, 객체 생성 시 해당 타입에 equals 로 호출된다.
		return result;
	}

}
