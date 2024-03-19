package ch15.sec02.exam03;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	public static void main(String[] args) {
		// ArrayList 컬렉션 객체 생성
		List<String> list1 = new ArrayList<>();
		
		// LinkedList 컬렉션 객체 생성
		List<String> list2 = new LinkedList<>();
		
		long startTime;
		long endTime;
		
		// ArrayList 시간 측정
		startTime = System.nanoTime();
		for (int i =0; i < 10000; i++) {
			list1.add(0, String.valueOf(i));
			// 0번 인덱스에 계속 삽입하게 되면서, 기존에 삽입했던 인덱스가 뒤로 밀려나게 됨
		}
		endTime = System.nanoTime();
		System.out.println(endTime - startTime + " ns");

		
		// LinkedList 시간 측정
		startTime = System.nanoTime();
		for (int i =0; i < 10000; i++) {
			list2.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println(endTime - startTime + " ns");
		
	}

}
