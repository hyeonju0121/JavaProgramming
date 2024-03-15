package ch06.practice.exam20;

import java.util.*;

public class AccountExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		boolean status = false;
		while (!false) {
			System.out.println("-----------------------------------------------------------------");
			System.out.println(" 1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 |  5.계좌 해지 | 6.종료 ");
			System.out.println("-----------------------------------------------------------------");

			System.out.print("선택> ");
			String check = sc.nextLine();
			System.out.println("-----------------------------------------------------------------");

			switch (check) {
				case "1": {
					System.out.println("                    계좌 생성");
					System.out.println("-----------------------------------------------------------------");
					
					System.out.print("계좌주: ");
					String name = sc.nextLine();
					while (name.equals("")) { // 비어 있는지 확인
						System.out.println("▶ 계좌주가 비어있습니다. 다시 입력해주세요.\n");
						System.out.print("계좌주: ");
						name = sc.nextLine();
					}
					
					System.out.print("초기 입금액: ");
					String balance = sc.nextLine();
					while (balance.equals("")) { // 비어 있는지 확인
						System.out.println("▶ 초기 입금액이 비어있습니다. 다시 입력해주세요.\n");
						System.out.print("초기 입금액: ");
						balance = sc.nextLine();
					}
					
					System.out.print("\n▶ ");
					
					Account account = new Account();
					String[] result = account.createAccount(name, balance);
					if(result == null) {
						System.out.print("100개의 계좌밖에 만들 수 없습니다. 다음에 이용해주세요.\n");	
					} else {
						System.out.print("축하드립니다. 계좌가 생성되었습니다.\n");
						System.out.println("생성된 계좌번호: " + result[1]);
						System.out.println("계좌주: " + result[2]);
						System.out.println("잔액: " + result[3]);
						System.out.println("생성일: " + result[4]);
					}
					
					System.out.println();
					break;
				}
				
				case "2": {
					System.out.println("\t\t\t계좌 목록");
					System.out.println("-----------------------------------------------------------------");
					System.out.printf("%-17s %-5s %-17s %-20s\n", 
							"계좌번호", "계좌주", "잔액", "계좌생성일");
					System.out.println("-----------------------------------------------------------------");
					
					Account account = new Account();
					BankApplication instance = BankApplication.getBankApplication();
					String[][] arr = account.findAllAccount();
					int totalAccount = instance.totalAccountNum();
					
					if (arr == null) {
						System.out.println("\n▶ 현재 생성된 계좌가 존재하지 않습니다.\n");
						break;
					} 
					
					for (int i = 0; i < totalAccount; i++) {
						String[] accountArr = arr[i];
						System.out.printf("%-19s %-5s %-17s %-20s\n", accountArr[1], accountArr[2], accountArr[3], accountArr[4]);
						System.out.println();
					}
					break;
				}
				case "3": {
					System.out.println("  예금  ");
					System.out.println("-----------------------------------------------------------------");
					
					System.out.print("계좌번호: ");
					String num = sc.nextLine();
					while (num.equals("")) { // 비어 있는지 확인
						System.out.println("▶ 계좌번호가 비어있습니다. 다시 입력해주세요.\n");
						System.out.print("계좌번호: ");
						num = sc.nextLine();
					}
					
					System.out.print("예금액: ");
					String balance = sc.nextLine();
					while (balance.equals("")) { // 비어 있는지 확인
						System.out.println("▶ 예금액이 비어있습니다. 다시 입력해주세요.\n");
						System.out.print("예금액: ");
						balance = sc.nextLine();
					}
					
					Account account = new Account();
					boolean result = account.deposit(num, balance);
					
					if (!result) {
						System.out.println("\n▶ 일치하는 계좌번호의 사용자가 존재하지 않습니다. 다시 입력해주세요.\n");
						
						break;
					} else {
						System.out.println("\n▶ 예금이 완료되었습니다.\n");
					}
					break;
				}
				case "4": {
					System.out.println("  출금  ");
					System.out.println("-----------------------------------------------------------------");
					
					System.out.print("계좌번호: ");
					String num = sc.nextLine();
					while (num.equals("")) { // 비어 있는지 확인
						System.out.println("▶ 계좌번호가 비어있습니다. 다시 입력해주세요.\n");
						System.out.print("계좌번호: ");
						num = sc.nextLine();
					}
					
					System.out.print("출금액: ");
					String balance = sc.nextLine();
					while (balance.equals("")) { // 비어 있는지 확인
						System.out.println("▶ 출금액이 비어있습니다. 다시 입력해주세요.\n");
						System.out.print("출금액: ");
						balance = sc.nextLine();
					}
					
					Account account = new Account();
					boolean result = account.withdraw(num, balance);
					
					if (!result) {
						System.out.println();
						break;
					} else {
						System.out.println("\n▶ 출금이 완료되었습니다.");
						System.out.println();
					}
				}
				
				case "5" : {
					System.out.println("  계좌 해지  ");
					System.out.println("-----------------------------------------------------------------");
					
					System.out.print("계좌번호: ");
					String num = sc.nextLine();
					while (num.equals("")) { // 비어 있는지 확인
						System.out.println("▶ 계좌번호가 비어있습니다. 다시 입력해주세요.\n");
						System.out.print("계좌번호: ");
						num = sc.nextLine();
					}
					
					Account account = new Account();
					boolean result = account.deleteAccount(num);
					if (result) {
						System.out.println("\n▶ 계좌가 해지되었습니다.");
					} else {
						System.out.println();
						break;
					}
				}
				
				case "6": {
					System.out.println("프로그램 종료\n\n");
					break;
				}
			}

		}
	}
}
