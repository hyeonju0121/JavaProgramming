package ch15.sec05.exam04;

import java.util.Comparator;

public class FruitComparator implements Comparator<Fruit> {
	@Override
	public int compare(Fruit o1, Fruit o2) {
		// 과일의 가격을 기준으로 비교
		if (o1.price < o2.price) {
			return -1;
		} else if (o1.price > o2.price) {
			return 1;
		} else {
			return 0;
		}
	}
}
