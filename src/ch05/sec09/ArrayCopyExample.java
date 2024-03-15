package ch05.sec09;

import java.util.Arrays;

public class ArrayCopyExample {

	public static void main(String[] args) {
		// 메소드를 사용해서 배열을 복사하는 방법
		// 길이가 3인 배열
		// 길이가 5인 배열 생성
		// 배열 항목을 복사해서 출력하기
		
		String[] oldArr = {"this", "is", "java"};
		
		String[] newArr = new String[5];
		
		System.arraycopy(oldArr, 0, newArr, 0, oldArr.length);
		
		System.out.println("원본 배열: " + Arrays.toString(oldArr));
		System.out.println("복사 배열: " + Arrays.toString(newArr));
		
		// 배열 출력
		for (int i = 0; i < newArr.length; i++) {
			System.out.print(newArr[i] + " ");
		}
		
		

	}

}
