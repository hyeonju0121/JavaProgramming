package ch07.sec10.exam02;

public class Dog extends Animal {
	public Dog(String kind, String color) {
		super(kind, color);
	}
	
	@Override
	public void sound() {
		System.out.println("멍멍 !!! ");
	}
	
	public void keepHouse() {
		System.out.println("집을 지킨다.");
	}
	

}
