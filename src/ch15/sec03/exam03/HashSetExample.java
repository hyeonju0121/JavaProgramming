package ch15.sec03.exam03;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		// HashSet 컬렉션 객체 생성
		Set<String> set = new HashSet<>();
		
		// 객체 저장
		set.add("Java");
		set.add("JDBC");
		set.add("JSP");
		set.add("Java"); // Set 은 중복 저장을 허용하지 않는다. 
		set.add("Spring");
		
		System.out.println("set.size() = " + set.size());
		
		System.out.println("===========================");
		
		// 하나씩 객체 가져오기 - 방법 1
		for (String item : set) {
			System.out.println(item);
		}
		
		System.out.println("===========================");
		
		// 하나씩 객체 가져오기 - 방법 2
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			// 객체를 하나씩 가져오기
			String item = iterator.next();
			System.out.println("item: " + item);
			
			if (item.equals("JSP")) {
				iterator.remove(); // set 에서 제거됨
			}
		}
		
		System.out.println("set.size() = " + set.size());
	}

}
