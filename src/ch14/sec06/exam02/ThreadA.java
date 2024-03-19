package ch14.sec06.exam02;

public class ThreadA extends Thread {
	// 공유 객체가 저장될 필드 선언
	private WorkObject workObject;
	
	/**
	 * 이전에 공유 객체를 주입받을 때, 세터를 이용해서 주입 받았음
	 * 이번에는 생성자를 통해서 외부 객체를 주입 받음 -> "생성자 주입"
	 */
	public ThreadA(WorkObject workObject) {
		setName("ThreadA"); // 스레드 이름 설정
		this.workObject = workObject;
	}
	
	// method
	@Override
	public void run() {
		for (int i = 0; i < 10000; i++) {
			workObject.methodA();
		}
	}

}
