package ch14.sec03.exam01;

import java.util.Calendar;

public class BeepPrintExample {

	public static void main(String[] args) { // 메인 스레드 실행
		/*
		 * Calendar today;
		 * 
		 * // # 작업 1 ==================================== for (int i = 0; i < 5; i++) {
		 * today = Calendar.getInstance(); int second = today.get(Calendar.SECOND);
		 * 
		 * // 메인 스레드가 작업할 내용 System.out.println("노래를 재생합니다.  -> " + second + "초");
		 * 
		 * 
		 * // 2.0초간 일시 정지 -> .sleep(2000) try { Thread.sleep(2000); } catch
		 * (InterruptedException e) { e.printStackTrace(); } }
		 */
		
		// # 작업 1 ====================================
		Runnable runnable = new MusicTask();
		Thread thread = new Thread(runnable);
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
