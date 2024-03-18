package ch14.sec03.exam02;

import java.util.Calendar;

public class BeepPrintExample {

	public static void main(String[] args) { // 메인 스레드 실행
		// # 작업 1 ====================================
		Thread thread = new MusicThread();
		thread.start();
		// ============================================
		
		// # 작업 2  ====================================
		for (int i = 0; i < 5; i++) {
			// 메인 스레드가 작업할 내용
			System.out.println("가사를 출력합니다. ~~~ ");
			System.out.println("~~~ ~~~~~~~~~~~~~~ ");
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}			
		}

	}

}
