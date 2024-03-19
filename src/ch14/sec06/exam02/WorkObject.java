package ch14.sec06.exam02;

public class WorkObject {
	// 공유 객체
	
	// 하나의 스레드만 사용할 수 있도록, synchronized 를 사용해서 lock 을 걸어둠
	public synchronized void methodA() {
		Thread thread = Thread.currentThread(); // current thread
		System.out.println(thread.getName() + ": methodA 작업 실행"); // thread name
		
		// ThreadA
		// 상대방을 깨운다 -> 실행 대기 상태로 만든다.
		notify();
		try {
			wait(); // 자기 자신은 일시정지 상태로 만든다 -> ThreadA 일시정지
		} catch (InterruptedException e) {
		}
	}
	
	public synchronized void methodB() {
		Thread thread = Thread.currentThread(); // current thread
		System.out.println(thread.getName() + ": methodB 작업 실행"); // thread name
		
		// ThreadB
		notify();
		try {
			wait(); // 자기 자신은 일시정지 상태로 만든다 -> ThreadB 일시정지
		} catch (InterruptedException e) {
		}
	}

}
