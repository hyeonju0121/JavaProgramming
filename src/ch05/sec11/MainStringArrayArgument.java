package ch05.sec11;

import java.util.Arrays;

public class MainStringArrayArgument {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (args.length != 2) {
			System.out.println("프로그램 입력값이 부족하다.");
			System.exit(0);
		}
		
		String strNum1 = args[0];
		String strNum2 = args[1];
		
		System.out.println(args.length);
		System.out.println(Arrays.toString(args));
		System.out.println(strNum1);
		System.out.println(strNum2);
		
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		System.out.println("sum: " + (num1 + num2));
	}

}
