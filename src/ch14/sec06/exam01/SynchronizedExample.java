package ch14.sec06.exam01;

public class SynchronizedExample {

	public static void main(String[] args) {
		// 공유 객체 생성
		Calculator calculator = new Calculator();

		// 공유 객체를 Uesr1Thread 에 주입
		User1Thread user1Thread = new User1Thread();
		user1Thread.setCalculator(calculator);
		// 외부에 객체를 세터를 이용해서 매개값으로 객체 주입 -> 매개값이 저장되는 곳은 필드에 저장되게 됨
		// 외부에서 받아서 필드에 저장하는 것을 "세터 주입" 이라고 함

		// 공유 객체를 Uesr1Thread 에 주입
		User2Thread user2Thread = new User2Thread();
		user2Thread.setCalculator(calculator);

		// User1Thread 가 계산기 먼저 사용
		user1Thread.start();
		// User1Thread 가 계산기 나중에 사용
		user2Thread.start();

	}

}
