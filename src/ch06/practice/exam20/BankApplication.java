package ch06.practice.exam20;

import java.util.*;

// 싱글톤
public class BankApplication {
	// Field
	private static BankApplication instance = new BankApplication();

	private static String[][] account = new String[100][];

	int copyIdx;

	// Constructor
	private BankApplication() {

	}

	// Method
	public static BankApplication getBankApplication() {
		return instance;
	}

	// 계좌 전체 이용 수
	public int totalAccountNum() {
		int total = 0;

		for (int i = 0; i < account.length; i++) {
			if (account[i] != null) {
				total++;
			} else if (account[i] == null) {
				return total;
			}
		}
		return total;
	}

	// 계좌번호에 해당하는 계좌 조회하기
	public String[] findAccount(String accountNum) {
		String[] account = new String[5];
		// account = {idx, accountNum, name, balance, time}

		for (int i = 0; i < totalAccountNum(); i++) {
			String[] temp = BankApplication.account[i];

			if (temp[1].equals(accountNum)) {
				return temp;
			}
		}
		return null;
	}

	// 계좌 생성 -> 계좌어플리케이션에 배열 추가 +1
	public String[] plusAccountBankApplication(String[] account) {

		int idx = totalAccountNum();

		BankApplication.account[idx] = account;

//		System.out.println(Arrays.toString(BankApplication.account[idx]));

		if (totalAccountNum() >= 100) {
			return null;
		}
		return account;
	}

	// 계좌 해지
	public boolean deleteAccountBankApplication(String[] account) {
		String[][] deleteCopy = new String[100][];

		for (int i = 0; i < deleteCopy.length; i++) {
			String[] deleteContents = BankApplication.account[i];

			if (deleteContents[1].equals(account[1])) { // 삭제할 계좌와 일치하는 경우

				BankApplication.account[i][0] = null;
				BankApplication.account[i][1] = null;
				BankApplication.account[i][2] = null;
				BankApplication.account[i][3] = null;
				BankApplication.account[i][4] = null;

				int total = totalAccountNum();
				System.out.println("total: " + total);

				System.out.println("\n▶ 계좌가 삭제 되었습니다.   \n");

				total -= 1;

				copyIdx = 0;
				int copyCnt = 0;
				for (int j = 1; j <= BankApplication.account.length; j++) {
					System.out.println("현재 배열: " + Arrays.toString(BankApplication.account[j - 1]));
					// 현재 배열: [null, null, null, null, null]
					
					if (BankApplication.account[j - 1][0] == null) {
						copyIdx++;
						continue;
					} else {
						// 계좌가 1개인 경우에 해지할 때, total 은 0으로 바뀜
						// total 이 0인 경우를 생각 못했다.. 
						if (total == (j - 1) && copyCnt == total) {
							break;
						}
						
						deleteCopy[copyCnt] = BankApplication.account[copyIdx];

						copyIdx++;
						copyCnt++;
					}
				}
				System.out.println("deleteCopy: " + Arrays.toString(deleteCopy));
				
				
				System.arraycopy(deleteCopy, 0, BankApplication.account, 
						0, BankApplication.account.length);
				
				
				System.out.println("삭제 후 배열: " + Arrays.toString(BankApplication.account[0]));
				
				break;
			}
			return true;
		}
		return false;
	}

	// 계좌 목록
	public String[][] readAccountBankApplication() {
		return BankApplication.account;
	}

}
