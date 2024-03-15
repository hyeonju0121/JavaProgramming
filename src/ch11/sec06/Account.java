package ch11.sec06;

public class Account {
	// Field
	private long balance;

	// Constructor
	
	
	// Method
	public long getBalance() {
		return balance;
	}
	
	public void deposit(int amount) {
		balance += amount;
		System.out.println("입금 완료");
	}
	
	public void withdraw(int amount) throws InsufficientException{
		if (balance < amount) {
			// error
			// throw new 예외 발생 객체 -> method 라 throws 로 던져줌
			throw new InsufficientException("잔고 부족: " + (amount - balance) + "원 모자람");
		}
		balance -= amount;
	}
}
