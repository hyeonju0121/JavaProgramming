package ch14.sec05.exam02;

public class JoinExample {

	public static void main(String[] args) {

		SumThread thread = new SumThread();
		thread.start();

		// sumThread 가 계산 작업을 모두 마칠 때까지
		// 메인 스레드가 일지 정지 상태에 있다가
		// sumThread가 최종 계산된 결과값을 산출하고 종료하면
		// 메인 스레드가 결과값을 받고 출력

		try {
			System.out.println("main thread: 기다려주께.. !!!");
			thread.join(); // 메인 스레드가 sumThread 끝날때까지 기다려줌
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("1 ~ 100 sum: " + thread.getSum());

	}

}
