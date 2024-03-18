package ch14.sec03.exam01;

import java.util.Calendar;

public class MusicTask implements Runnable{
	Calendar today;
	
	// Runnable interface - abstract method run()
	@Override
	public void run() {
		// # 작업 1  ====================================
		for (int i = 0; i < 5; i++) {
			today = Calendar.getInstance();
			int second = today.get(Calendar.SECOND);
			
			// 메인 스레드가 작업할 내용
			System.out.println("노래를 재생합니다.  -> " + second + "초");
			
			
			// 2.0초간 일시 정지 -> .sleep(2000)
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}			
		}
	}
	

}
