package ch15.sec04.exam02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapExample {

	public static void main(String[] args) {
		
		Map<Member, Integer> map = new HashMap<>();
		
		map.put(new Member("홍길동", 20), 85);
		map.put(new Member("홍길동", 25), 85);
		map.put(new Member("홍길동", 28), 85);
		map.put(new Member("홍길동", 20), 85); // 동등 객체여서 해당 키와 값은 저장이 안됨
		
		System.out.println(map.size());
	}

}
