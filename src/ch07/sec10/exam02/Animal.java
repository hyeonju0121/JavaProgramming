package ch07.sec10.exam02;

public abstract class Animal {
	String kind;
	String color;
	
	public Animal(String kind, String color) {
		this.kind = kind;
		this.color = color;
	}
	
	public void breathe() {
		System.out.println("숨을 쉰다.");
	}
	
	public abstract void sound();
	

}
