package ch15.sec05.exam01;

import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		// TreeSet 컬렉션 생성
		TreeSet<Integer> scores = new TreeSet<>();

		// Integer 객체 저장 -> TreeSet 이 내부적으로 대소비교해서 저장됨
		scores.add(87); // int 타입인 87이 Integer 로 박싱되면서 저장되기 때문에, 객체가 저장되는게 맞음
		scores.add(98);
		scores.add(75);
		scores.add(95);
		scores.add(80);

		// TreeSet method
		System.out.println("가장 낮은 점수: " + scores.first());
		System.out.println("가장 높은 점수: " + scores.last());
		System.out.println("95점 아래 점수: " + scores.lower(95));
		System.out.println("95점 위의 점수: " + scores.higher(95));
		System.out.println("94점 이거나 바로 아래 점수: " + scores.floor(94));
		System.out.println("96점 이거나 바로 위의 점수: " + scores.ceiling(96));

		System.out.println();

		// 하나씩 객체를 오름차순으로 가져오기
		for (int score : scores) {
			System.out.print(score + " ");
		}

		System.out.println("\n");

		// 하나씩 객체를 내림차순으로 가져오기
		for (int score : scores.descendingSet()) {
			System.out.print(score + " ");
		}

		System.out.println("\n");

		// 범위 검색 (80 <= x)
		System.out.print("범위 검색 (80 <= score):  ");
		for (int score : scores.tailSet(80, true)) {
			System.out.print(score + " ");
		}

		System.out.println("\n");
		
		// 범위 검색 (80 <= x < 90)
		System.out.print("범위 검색 (80 <= score < 90):  ");
		for (int score : scores.subSet(80, true, 90, false)) {
			System.out.print(score + " ");
		}

	}

}
