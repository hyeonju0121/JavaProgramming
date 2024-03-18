package ch14.sec05.exam03;

public class WorkThread extends Thread {
	// Field
	public boolean work = true;

	// Constructor
	public WorkThread(String name) {
		// Thread 를 상속 받았으니까 setName 메소드를 통해 thread 의 이름 변경
		setName(name);
	}
	
	// Method
	@Override
	public void run() {
		while(true) {
			if(work) {
				System.out.println(getName() + ": 작업 처리");
			} else {
				Thread.yield(); // 무의미한 반복을 하지 않도록, 실행 대기 상태로 이동
			}
		}
	}

}
