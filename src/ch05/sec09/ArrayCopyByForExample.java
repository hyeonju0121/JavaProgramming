package ch05.sec09;

import java.util.Arrays;

public class ArrayCopyByForExample {

	public static void main(String[] args) {
		// for 문을 사용해서 배열을 복사하는 방법
		
		String[] oldArr = {"this", "is", "hyeonju"};
		
		String[] newArr = new String[5];
		
		for (int i = 0; i < oldArr.length; i++) {
			newArr[i] = oldArr[i];
		}
		
		System.out.println("원본 배열: " + Arrays.toString(oldArr));
		System.out.println("복사 배열: " + Arrays.toString(newArr));
		
		// 배열 출력
		for (int i = 0; i < newArr.length; i++) {
			System.out.print(newArr[i] + " ");
		}
		
		System.out.println();
		
		
		int[] arr = {1, 2, 3, 4, 5};
		int[] arr2 = new int[5];
		
		System.arraycopy(arr, 0, arr2, 0, arr.length);
		
	
		System.out.println("arr: " + Arrays.toString(arr));
		System.out.println("arr2: " + Arrays.toString(arr2));
		
		arr2[0] = 10;
		arr2[2] = 30;
		
		System.out.println("arr: " + Arrays.toString(arr));
		System.out.println("arr2: " + Arrays.toString(arr2));
		
		String[] arr3 = {"a", "b", "c"};
		String[] arr4 = new String[3];
		
		System.arraycopy(arr3, 0, arr4, 0, arr3.length);
		
	
		System.out.println("arr3: " + Arrays.toString(arr3));
		System.out.println("arr4: " + Arrays.toString(arr4));
		
		arr4[0] = "aa";
		arr4[2] = "cc";
		
		System.out.println("arr3: " + Arrays.toString(arr3));
		System.out.println("arr4: " + Arrays.toString(arr4));
		
		
		
	}

}
