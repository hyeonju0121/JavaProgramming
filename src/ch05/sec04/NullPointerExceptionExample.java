package ch05.sec04;

import java.util.Arrays;

public class NullPointerExceptionExample {

	public static void main(String[] args) {
		// int[] 배열을 null 로 초기화해서 선언
		// 해당 배열에 인덱스에 값 대입
		
		// String 값에 null 로 초기화해서 선언
		// 해당 문자열에 길이 출력
		
		int[] arr = null;
		// arr[0] = 100; // java.lang.NullPointerException
		
		String str = null;
		// System.out.println(str.length()); // java.lang.NullPointerException
		

	}

}
