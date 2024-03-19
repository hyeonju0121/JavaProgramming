package ch15.sec03.exam02;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		// HashSet 컬렉션 객체 생성
		Set<Member> set = new HashSet<>();
		
		// 객체 저장
		Member m1 = new Member("person1", 26);
		Member m2 = new Member("person1", 26);
		System.out.println(m1.hashCode() == m2.hashCode());
		
		
		set.add(new Member("person1", 26));
		set.add(new Member("person2", 28));
		set.add(new Member("person3", 30));
		set.add(new Member("person4", 32));
		set.add(new Member("person5", 34));
		
		System.out.println("set.size() = " + set.size());
	}

}
