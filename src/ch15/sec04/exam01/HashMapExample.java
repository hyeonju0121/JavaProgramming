package ch15.sec04.exam01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapExample {

	public static void main(String[] args) {
		// 컬렉션 생성 
		Map<String, Integer> map = new HashMap<>();
		
		// 엔트리 저장
		map.put("홍길동", 85);
		map.put("신용권", 90);
		map.put("동장군", 80);
		map.put("홍길동", 100); // key 가 중복되기 때문에, 제일 마지막에 저장한 값만 저장됨
		
		// 저장된 엔트리 수 (키 수) -> .size()
		System.out.println("총 Entry 수: " + map.size());
		
		// 키로 값을 얻기 -> .get(Object key)
		String key = "홍길동";
		int value = map.get(key); // Integer -> int 자동 언박싱
		System.out.println("key: " + key + ", value: " + value);
		
		System.out.println();
		
		System.out.println(map.keySet());
		System.out.println(map.entrySet());
		
		System.out.println();
		
		// 모든 키를 하나씩 가져와서 키와 값을 출력
		for (String k : map.keySet()) {
			System.out.println("key: " + key + ", value: " + map.get(k));
		}
		
		System.out.println();
		
		// 엔트리를 하나씩 가져와서 키와 값을 출력
		for (Entry<String, Integer> entry : map.entrySet()) {
			String k = entry.getKey();
			int val = entry.getValue();
			System.out.println("key: " + k + ", value: " + val);
		}
		
		System.out.println();
		
		// 반복 중에 엔트리를 삭제할 경우
		Iterator<Entry<String, Integer>> iterator = map.entrySet().iterator();
		while(iterator.hasNext()) {
			Entry<String, Integer> entry = iterator.next();
			String k = entry.getKey();
			int val = entry.getValue();
			
			if(k.equals("홍길동")) {
				iterator.remove();
			} else {
				System.out.println("key: " + k + ", value: " + val);
			}
		}
		
		System.out.println(map);
	}

}
