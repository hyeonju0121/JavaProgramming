package ch02.sec13;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("x 값 입력 : ");
		String strX = scanner.nextLine();
		int x = Integer.parseInt(strX);
		
		System.out.print("y 값 입력 : ");
		String strY = scanner.nextLine();
		int y = Integer.parseInt(strY);
		
		System.out.printf("x + y: %d\n", x + y);

		while(true) {
			System.out.print("입력 문자열 : ");
			String temp = scanner.nextLine();
			
			if(temp.equals("q")) {
				System.out.println("종료");
				break;
			}
			
			System.out.printf("출력 문자열: %s\n", temp);
		}
	}

}
