package ch15.sec05.exam03;

import lombok.ToString;

@ToString
public class Person implements Comparable<Person>{
	public String name;
	public int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Person o) {
		// 이름을 기준으로 Person 객체를 오름차순으로 정렬
		// String 에서 재정의된 compareTo 메소드 호출해서 리턴한 값을 기준으로 설정
		int result = name.compareTo(o.name); 
		return result;
//		return -result; 
		// 역순으로 출력하고 싶을 경우.. -result 하면 됨 
		// -1, 0, 1 이 1, 0, -1 이 되니까! 
	}

}
