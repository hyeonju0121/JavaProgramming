package ch05.sec08;

public class ArrayReferenceObjectExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] strArr = new String[3];
		strArr[0] = "Java";
		strArr[1] = "Java";
		strArr[2] = new String("Java");
		
		System.out.println(strArr[0] == strArr[1]); // true -> 같은 객체를 참조하고 있다.
		System.out.println(strArr[1] == strArr[2]); // false -> 다른 객체를 참조하고 있음
		System.out.println(strArr[0].equals(strArr[2])); 

	}

}
