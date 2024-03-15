package ch05.sec03;

public class ReferenceVariableCompareExample {

	public static void main(String[] args) {
		
		// 배열 arr1, arr2, arr3 선언후
		// 배열 {1,2,3} 을 생성하고 각 arr1, arr2에 대입
		// arr1 과 arr2 같은 배열을 참조하는지 검사
		// arr2 와 arr3 같은 배열을 참조하는지 검사
		
		int[] arr1;
		int[] arr2;
		int[] arr3;
		
		arr1 = new int[] {1, 2, 3, 4, 5};
		arr2 = new int[] {1, 2, 3, 4, 5};
		arr3 = arr2;
		
		System.out.println(arr1 == arr2); // false
		System.out.println(arr1 != arr2); // true
		
		System.out.println(arr2 == arr3); // true
		System.out.println(arr2 != arr3); // false
		
	}

}
