package ch14.sec07.exam03;

public class PrintThread extends Thread {
	@Override
	public void run() {
		while (true) {
			System.out.println("실행 중");
			// interrupt 메소드가 호출되면 true 리턴하면서 while 문 탈출
			if (Thread.interrupted()) { 
				break;
			}
		}
		System.out.println("리소스 정리");
		System.out.println("실행 종료");
	}

}
