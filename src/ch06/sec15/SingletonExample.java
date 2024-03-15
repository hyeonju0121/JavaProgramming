package ch06.sec15;

public class SingletonExample {

	public static void main(String[] args) {
		
//		Singleton st = new Singleton();
		
		Singleton st1 = Singleton.getSingleton();
		Singleton st2 = Singleton.getSingleton();
		
		if (st1 == st2) {
			System.out.println("같음"); 
		} else {
			System.out.println("다름");
		}

	}

}
