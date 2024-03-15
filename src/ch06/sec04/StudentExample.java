package ch06.sec04;

public class StudentExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s1 = new Student();
		System.out.println("변수 s1이 Student 객체를 참조합니다.");

		Student s2 = new Student();
		System.out.println("변수 s2는 또다른 Student 객체를 참조합니다.");

		Student s3 = new Student();
		System.out.println("변수 s3는 또다른 Student 객체를 참조합니다.");

		if (s1 == s2) { // s1 과 s2가 참조하는 객체가 같으면 true 가 나옴 -> 하지만, 서로 다른 객체를 참조하고 있기 때문에 false 가 나온다.
			System.out.println("같은 객체");
		} else {
			System.out.println("다른 객체");
		}

	}

}
