package ch05.exam.sunghwan;

import java.util.Scanner;

public class BankApplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int accountsLimit = 100;
		Account[] accounts = new Account[accountsLimit];

		String option = "";
		while (!option.equals("5")) {
			System.out.println("---------------");
			System.out.println("1.계좌생성|2.계좌목록|3.예금|4.출금|5.종료");
			System.out.println("---------------");
			System.out.print("선택> ");
			option = sc.nextLine();
			switch (option) {
			case "1":
				int num = emptyAccountNum(accounts);
				if (num == -1) {
					System.out.println("더 이상 계좌를 생성할 수 없습니다.");
					break;
				}
				System.out.println("---------------");
				System.out.println("계좌생성");
				System.out.println("---------------");
				accounts[num] = new Account();

				System.out.print("계좌번호: ");
				String accountNum = sc.nextLine();
//				if (checkDuplication(accounts, accountNum)) {
//					System.out.println("입력한 계좌번호가 이미 존재합니다.");
//					break;
//				}
				accounts[num].setAccountNum(accountNum);

				System.out.print("계좌주: ");
				accounts[num].setName(sc.nextLine());

				System.out.print("초기입금액: ");
				String initialDeposit = sc.nextLine();
				if (isValidNumber(initialDeposit)) {
					accounts[num].setBalance(initialDeposit);
				} else {
					System.out.println("유효하지 않은 금액입니다.");
					accounts[num] = null; // 초기화
					break;
				}
				break;
			case "2":
				System.out.println("---------------");
				System.out.println("계좌목록");
				System.out.println("---------------");
				for (Account account : accounts) {
					if (account != null) {
						System.out.printf("%-10s %-10s %-10d\n", account.getAccountNum(), account.getName(),
								account.getBalance());
					}
				}
				break;
			case "3":
				System.out.println("---------------");
				System.out.println("예금");
				System.out.println("---------------");
				System.out.print("계좌번호: ");
				int index = findIndexNum(accounts, sc.nextLine());
				if (index == -1) {
					System.out.println("일치하는 계좌가 없습니다.");
					break;
				}

				System.out.print("예금액: ");
				String depositAmount = sc.nextLine();
				if (isValidNumber(depositAmount)) {
					System.out.println(accounts[index].deposit(depositAmount));
				} else {
					System.out.println("유효하지 않은 금액입니다.");
				}
				break;
			case "4":
				System.out.println("---------------");
				System.out.println("출금");
				System.out.println("---------------");
				System.out.print("계좌번호: ");
				index = findIndexNum(accounts, sc.nextLine());
				if (index == -1) {
					System.out.println("일치하는 계좌가 없습니다.");
					break;
				}

				System.out.print("출금액: ");
				String withdrawAmount = sc.nextLine();
				if (isValidNumber(withdrawAmount)
						&& accounts[index].getBalance() - Integer.parseInt(withdrawAmount) > 0) {
					System.out.println(accounts[index].withdraw(withdrawAmount));
				} else {
					System.out.println("현재 잔고 금액보다 크거나 유효하지 않은 금액입니다.");
				}
				break;
			case "5":
				break;
			default:
				System.out.println("\n잘못된 옵션입니다. 다시 입력해주세요\n");
			}
		}
		System.out.println("프로그램 종료");
		sc.close();
	}

	// 귀찮아서 여기에 그냥 메소드를 만듦
	// 계좌번호가 null이라면 해당 index 번호를, 아니면 -1을 리턴하는 정적 메소드
	static int emptyAccountNum(Account[] accounts) {
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] == null) {
				return i;
			}
		}
		return -1;
	}

	// 입력된 계좌번호와 일치하는 index 번호를, 없다면 -1을 반환하는 정적 메소드
	static int findIndexNum(Account[] accounts, String accountNum) {
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i] != null && accounts[i].getAccountNum().equals(accountNum)) {
				return i;
			}
		}
		return -1;
	}

//	static boolean checkDuplication(Account[] accounts, String inputAccountNum) {
//		if (accounts == null)
//			return false;
//		for (Account account : accounts) {
//			if (account != null) {
//				account.getAccountNum().equals(inputAccountNum);
//				return true;
//			}
//			return false;
//		}
//		return false;
//	}

	// 유저로부터 입력받음 값이 숫자인지 아닌지 판별하는 정적 메소드
	static boolean isValidNumber(String number) {
		// 빈 문자열이나 null인 경우는 유효한 숫자가 아님
		if (number == null || number.isEmpty()) {
			return false;
		}
		// 숫자가 아닌 입력값은 false
		for (int i = 0; i < number.length(); i++) {
			char c = number.charAt(i);
			if (c < '0' || c > '9') {
				return false;
			}
		}
		// 모든 검사를 통과했으면 true 반환
		return true;
	}

}
