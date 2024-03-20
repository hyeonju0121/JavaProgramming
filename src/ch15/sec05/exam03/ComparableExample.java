package ch15.sec05.exam03;

import java.util.TreeSet;

public class ComparableExample {

	public static void main(String[] args) {
		TreeSet<Person> treeSet = new TreeSet<>();
		/**
		 * [error] Exception in thread "main" java.lang.ClassCastException
		 * Person cannot be cast to class java.lang.Comparable
		 * => Person 을 comparable 타입으로 캐스트 할 수 없다.
		 * Comparable comparable = (Comparable) person; 
		 * 이렇게 강제로 변환할 수 없어 해당 오류가 발생하게 된 것이다.
		 * comparable 을 구현하지 않으면, 사용자 정의 객체에서 대소 비교를 할 수 없기 때문이다.
		 */
		
		treeSet.add(new Person("가현주", 26));
		treeSet.add(new Person("다현주", 100));
		treeSet.add(new Person("나현주", 31));
		
		for (Person person : treeSet) {
			System.out.println(person.name + ": " + person.age);
		}

	}

}
