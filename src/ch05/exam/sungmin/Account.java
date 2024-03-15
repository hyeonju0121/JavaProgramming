package ch05.exam.sungmin;

public class Account {

	// 필드 선언
//	public final String account;	// 계좌번호는 각 객체마다 가지는 고유한 값..
	// final로 선언해야하지 않을까?
	// private로 하면 계좌번호 조회가 안됨, 확인?

	public String account; // 계좌번호
	public String name; // 계좌주
	public int balance; // 잔고
	public int deposit; // 예금액
	public int withdraw; // 출금액

	// 생성자 선언
	Account() {
		// final 변수가 있다면 생성자에서 초기화를 진행
	}

	/*Account(String account, String name) {
		this.account = account;
		this.name = name;
	}
	
	Account(String account, String name, int balance) {
		this.account = account;
		this.name = name;
		this.balance = balance;
	}*/

	// 메소드 선언
	/*public int deposit(int balance) {
		if(balance < 0) {
			System.out.println("예금액은 음수가 될 수 없습니다!");
			return 0;
		}
		else {
			return balance;
		}
	}

	public int withdraw(int balance) {
		if(this.balance - balance < 0) {
			System.out.println("잔고보다 출금액이 더 높습니다!");
			return 0;
		}
		else {
			return balance;
		}

	}*/

}
