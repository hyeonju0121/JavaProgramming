package ch06.sec15;

public class Bank {
	// 필드
	private String branch; // 지점
	
	
	// 생성자
	public Bank(String branch) {
		this.branch = branch;
	}

	
	// 메소드
	public void deposit(int amount) {
		Account account = Account.getInstance();
		account.input(amount);
	}
	
	public void withdraw(int amount) {
		Account account = Account.getInstance();
		account.output(amount);
	}
	
	public void balanceInfo() {
		System.out.println(Account.getInstance().getBalance());
	}
	
	

}
