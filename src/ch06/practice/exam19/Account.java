package ch06.practice.exam19;

public class Account {
	// Field
	private int balance;
	
	final int MIN_BALANCE = 0;
	final int MAX_BALANCE = 1000000;
	
	// Constructor
	
	
	// Method
	public int getBalance() {
		return balance;
	}
	
	public void setBalance(int balance) {		
		if ((balance > MIN_BALANCE) && (balance < MAX_BALANCE)) {
			this.balance = balance;
		}
	}

}
