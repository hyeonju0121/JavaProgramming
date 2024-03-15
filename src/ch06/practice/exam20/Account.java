package ch06.practice.exam20;

import java.util.*;

public class Account {
	// Field
	String accountNum;

	String name;

	int balance;

	BankApplication instance = BankApplication.getBankApplication();
	Random random = new Random();
	Calendar today;

	// Constructor

	// 계좌 생성
	public String[] createAccount(String name, String balance) {
		this.accountNum = createAccountNumber();
		this.name = name;
		this.balance = Integer.parseInt(balance);

		String[] accountArr = new String[5];
		
		int total = instance.totalAccountNum();
		
		accountArr[0] = String.valueOf(total);
		accountArr[1] = accountNum;
		accountArr[2] = name;
		accountArr[3] = balance;

		// 날짜 배열 생성 ----------------------------------------------
		today = Calendar.getInstance();

		int[] todayTempArr = new int[6];
		todayTempArr[0] = today.get(Calendar.YEAR);
		todayTempArr[1] = today.get(Calendar.MONTH) + 1;
		todayTempArr[2] = today.get(Calendar.DATE);
		todayTempArr[3] = today.get(Calendar.HOUR_OF_DAY);
		todayTempArr[4] = today.get(Calendar.MINUTE);
		todayTempArr[5] = today.get(Calendar.SECOND);

		String[] todaySplitArr = new String[6];
		for (int i = 0; i < 6; i++) {
			if (todayTempArr[i] < 10) {
				todaySplitArr[i] = "0" + String.valueOf(todayTempArr[i]);
			} else {
				todaySplitArr[i] = String.valueOf(todayTempArr[i]);
			}
		}

		String time = todaySplitArr[0] + "/" + todaySplitArr[1] + "/" + todaySplitArr[2] + "  " + todaySplitArr[3] + ":"
				+ todaySplitArr[4] + ":" + todaySplitArr[5];

		accountArr[4] = time;

		String[] result = instance.plusAccountBankApplication(accountArr);

		if (result == null) {
			return null;
		} else {
			return result;
		}
	}

	// 목록 조회
	public String[][] findAllAccount() {
		int totalAccount = instance.totalAccountNum();

		// validation(1) - 계좌를 생성한 사용자가 한 명도 없는 경우
		if (totalAccount == 0) {
			return null;
		} else {
			String[][] account = instance.readAccountBankApplication();

			return account;
		}
	}

	// 예금
	public boolean deposit(String accountNum, String money) {
		String[] account = instance.findAccount(accountNum);

		// validation(1) - 일치하는 사용자가 존재하지 않는 경우
		if (account == null) {
			return false;
		}

		int temp = Integer.parseInt(account[3]);
		int inputMoney = Integer.parseInt(money);
		temp += inputMoney;

		account[3] = String.valueOf(temp); // deposit success

		return true;
	}

	// 출금
	public boolean withdraw(String accountNum, String money) {
		String[] account = instance.findAccount(accountNum);
		int inputMoney = Integer.parseInt(money);

		// validation(1) - 일치하는 사용자가 존재하지 않는 경우
		if (account == null) {
			System.out.println("▶ 일치하는 계좌번호의 사용자가 존재하지 않습니다. 다시 입력해주세요.\n");
			return false;
		}

		// validation(2) - 잔액보다 출금액이 더 큰 경우
		int currentBalance = Integer.parseInt(account[3]);
		if (currentBalance < inputMoney) {
			System.out.println("▶ 현재 잔액보다 출금하려고 하는 금액이 더 큽니다. 출금할 수 없습니다.\n");
			return false;
		}

		currentBalance -= inputMoney;

		account[3] = String.valueOf(currentBalance); // withdraw success
		return true;
	}

	// 계좌 해지
	public boolean deleteAccount(String accountNum) {
		String[] account = instance.findAccount(accountNum);

		// validation(1) - 일치하는 사용자가 존재하지 않는 경우
		if (account == null) {
			System.out.println("▶ 일치하는 계좌번호의 사용자가 존재하지 않습니다. 다시 입력해주세요.\n");
			return false;
		}
		
		boolean result = instance.deleteAccountBankApplication(account);
		
		if (result) {
			return true;
		} else {
			return false;
		}
	}

	// 사용자마다 계좌번호는 유일해야 하고, 시스템에서 자동 발급되도록 관리해야 함
	// 우선, 내가 원하는 계좌번호에 형태는 'XXX-XXXX-XXXX-XX' 형태
	// 고유 계좌번호 생성 Method
	public String createAccountNumber() {
		int w = random.nextInt(900) + 100; // 3자리수 100~999
		int x = random.nextInt(9000) + 1000; // 4자리수 1000~9999
		int y = random.nextInt(9000) + 1000; // 4자리수 1000~9999
		int z = random.nextInt(90) + 10; // 2자리수 10~99

		String accountNumber = String.format("%d-%d-%d-%d", w, x, y, z);

		// 현재 계좌 목록에 계좌번호가 존재한다면, 다시 메서드 호출해서 계좌번호 생성 반복
		// 없는 경우에는 생성된 계좌번호로 결정
		if (instance.findAccount(accountNumber) == null) {
			return accountNumber;
		} else {
			createAccountNumber();
		}
		return null;
	}

}
