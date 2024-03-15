package ch11.sec06;

public class AccountExample {

	public static void main(String[] args) {
		Account account = new Account();
		account.deposit(10000);

//		account.withdraw(30000);

		System.out.println("balance: " + account.getBalance());

		try {
			account.withdraw(30000);
		} catch (InsufficientException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("balance: " + account.getBalance());

	}

}
