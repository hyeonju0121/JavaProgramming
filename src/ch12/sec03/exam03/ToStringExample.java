package ch12.sec03.exam03;

import java.util.Arrays;

public class ToStringExample {

	public static void main(String[] args) {
		SmartPhone phone = new SmartPhone("Samsung", "Android");
		
		String str1 = phone.toString();
		System.out.println(str1);
		
		System.out.println(phone);
		
		int[] arr = {1, 2, 3, 4, 5};
		
		System.out.println(arr);
		
		System.out.println(Arrays.toString(arr));
		
		
		

		
	}

}
