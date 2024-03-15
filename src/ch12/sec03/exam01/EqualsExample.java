package ch12.sec03.exam01;

public class EqualsExample {

	public static void main(String[] args) {
		Member obj1 = new Member("red");
		Member obj2 = new Member("red");
		Member obj3 = new Member("blue");
		
		// equals 를 재정의 하지 않은 경우, 주소값을 비교하게 되서 
		// 모두 false 가 나오게 된다.
		// obj1, obj2, obj3 의 문자열이 동등한지 비교하려면
		// equals 를 재정의해야 한다.
		if (obj1.equals(obj2)) {
			System.out.println("obj1 과 obj2 는 동등하다.");
		} else {
			System.out.println("obj1 과 obj2 는 동등하지 않다.");
		}
		
		if (obj1.equals(obj3)) {
			System.out.println("obj1 과 obj3 는 동등하다.");
		} else {
			System.out.println("obj1 과 obj3 는 동등하지 않다.");
		}

	}

}
