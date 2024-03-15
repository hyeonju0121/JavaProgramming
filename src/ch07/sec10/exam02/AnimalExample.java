package ch07.sec10.exam02;

public class AnimalExample {

	public static void main(String[] args) {

		Cat cat = new Cat("한국 고양이", "노랑");
		cat.breathe();
		cat.sound(); // 야옹
		cat.catchMouse();

		System.out.println("===================");

		Dog dog = new Dog("진돗개", "흰색");
		dog.breathe();
		dog.sound(); // 멍멍
		dog.keepHouse();

		System.out.println("==================");
		
		dailyLife(new Cat("한국 고양이", "노랑"));
		System.out.println();
		dailyLife(new Dog("믹스견", "검정"));
		System.out.println();
		

	}
	
	public static void dailyLife(Animal animal) {
		animal.breathe();
		animal.sound();
		
		if (animal instanceof Cat) {
			Cat cat = (Cat) animal;
			cat.catchMouse();
//			((Cat) animal).catchMouse();
		} else {
			Dog dog = (Dog) animal;
			dog.keepHouse();
//			((Dog) animal).keepHouse();
		}
	}

}
