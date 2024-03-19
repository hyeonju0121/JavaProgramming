package ch14.sec06.exam02;

public class ThreadB extends Thread {
	// 공유 객체가 저장될 필드 선언
	private WorkObject workObject;
	
	public ThreadB(WorkObject workObject) {
		setName("ThreadB"); 
		this.workObject = workObject;
	}
	
	// method
	@Override
	public void run() {
		for (int i = 0; i < 10000; i++) {
			workObject.methodB();
		}
	}

}
