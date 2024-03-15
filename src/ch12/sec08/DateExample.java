package ch12.sec08;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Stack;

public class DateExample {

	public static void main(String[] args) {

		Date now = new Date();
		String strNow1 = now.toString();
		System.out.println(strNow1);
		
		// SimpleDateFormat 포맷 적용
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
		String strNow2 = sdf.format(now);
		System.out.println(strNow2);
		
		
		
		int[] arr = {4, 3, 6, 8, 7, 5, 2, 1};
		Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr));
		
		/**
		 *  	+
				+
				+
				+
				-
				-
				+
				+
				-
				+
				+
				-
				-
				-
				-
				-
		 */
		
		Stack<Integer> stack = new Stack<>();
		System.out.println(stack.size());
		

	}

}
