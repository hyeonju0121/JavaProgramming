package ch15.sec03.exam04;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratprRemoveExample {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		
		/*
		 * for (String item : list) { if (item.equals("C")) { list.remove(item); } } //
		 * 이 경우는 에러발생 -> Iterator 를 사용해서 제거해야한다.
		 * 만약에 코테 준비할 때, 반복하다가 지울 일 생기면 Iterator 사용해서 제거하기
		 */		
		
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {
			String item = iterator.next();
			if (item.equals("C")) {
				iterator.remove();
			}
		}
		
		System.out.println(list);

	}

}
