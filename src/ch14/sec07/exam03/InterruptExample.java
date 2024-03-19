package ch14.sec07.exam03;

public class InterruptExample {

	public static void main(String[] args) {
		PrintThread printThread = new PrintThread();
		printThread.start();
		
		try {
			Thread.sleep(3000); // printThread 를 3초 동안 쉬게 하고, interrupt 실행
		} catch (InterruptedException e) {
		}
		
		printThread.interrupt();
	}
}
