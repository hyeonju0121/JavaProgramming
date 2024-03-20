package ch15.sec05.exam04;

import java.util.TreeSet;

public class ComparatorExample{
	public static void main(String[] args) {
		
		TreeSet<Fruit> treeSet = new TreeSet<>(new FruitComparator());
		
		treeSet.add(new Fruit("포도", 3000));
		treeSet.add(new Fruit("수박", 12000));
		treeSet.add(new Fruit("딸기", 9900));
		treeSet.add(new Fruit("오렌지", 4500));
		treeSet.add(new Fruit("사과", 8000));
		
		for (Fruit fruit : treeSet) {
			System.out.println(fruit.name + ": " + fruit.price);
		}
	}
}
