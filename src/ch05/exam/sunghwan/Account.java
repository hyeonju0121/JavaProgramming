package ch05.exam.sunghwan;

public class Account {
	private String accountNum;
	private String name;
	private int balance;

	public String withdraw(String amount) {
		balance -= Integer.parseInt(amount);
		return "출금이 성공되었습니다.";
	}

	public String deposit(String amount) {
		balance += Integer.parseInt(amount);
		return "입금이 성공되었습니다.";
	}

	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setBalance(String amount) {
		this.balance = Integer.parseInt(amount);
	}

	public String getAccountNum() {
		return accountNum;
	}

	public String getName() {
		return name;
	}

	public int getBalance() {
		return balance;
	}
}
