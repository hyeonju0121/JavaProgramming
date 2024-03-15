package ch12.exam.no01;

import java.util.HashSet;

public class StudentExample {

	public static void main(String[] args) {
		// Student 를 저장하는 HashSet 생성
		HashSet<Student> hashSet = new HashSet<Student>();
		
		// Student 저장
		hashSet.add(new Student("20183334"));
		hashSet.add(new Student("20183334")); // 같은 학번이므로 중복 저장이 안됨
		hashSet.add(new Student("20240315"));
		
		// 저장된 Student 수 출력
		System.out.println("저장된 Student 수: " + hashSet.size());

		/**
		 * hashCode() 와 equals() 메소드를 오버라이딩 해서
		 * studentName 값의 해시코드를 리턴하고,
		 * equals 메소드 인풋으로 Student 객체 타입이 들어오면, 
		 * studentNum 을 비교하면서 값이 동일해 true 가 나오게 되면 동등 객체가 된다.
		 * 
		 */
	}

}
