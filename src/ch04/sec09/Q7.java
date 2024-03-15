package ch04.sec09;

import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String num = "";
		String account = "";
		boolean status = true;
		int balance = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while(status) {
			System.out.println("-----------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("-----------------------------------");
			
			System.out.print("선택>");
			num = sc.nextLine();
			
			if (num.equals("4")) {
				System.out.println();
				System.out.println("프로그램 종료");
				status = false;
			} else {
				switch(num) {
					case "1": {
						System.out.print("예금액>");
						account = sc.nextLine();
						balance += Integer.parseInt(account);
						break;
					}
					case "2": {
						System.out.print("출금액>");
						String transfer = sc.nextLine();
						balance -= Integer.parseInt(transfer);
						break;
					}
					case "3": {
						System.out.println("잔고>" + balance);
					}
				}
				
			}
		}

	}

}
