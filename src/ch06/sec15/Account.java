package ch06.sec15;

public class Account {
	
	// 필드
	// 잔고 
	private int balance;
	private static Account instance = new Account();
	
	// 생성자
	private Account() {
		
	}
	
	
	// 메소드
	// 입금, 출금
	public void input(int amount) {
		this.balance += amount;
	}
	
	public void  output(int amount) {
		this.balance -= amount;
	}
	
	public static Account getInstance() {
		return instance;
	}
	
	public int getBalance() {
		return balance;
	}
	
	

}
