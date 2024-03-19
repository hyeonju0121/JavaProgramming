package ch14.sec06.exam01;

public class Calculator {
	// Field
	// 예제를 위해 필드를 선언했지만, 일반적으로 공유 객체는 일반적으로 필드를 갖지 않는다.
	private int memory;
	
	// Constructor
	
	// Method
	// getter
	public int getMemory() {
		return memory;
	}

	// setter
	/*
	 * public void setMemory(int memory) { this.memory = memory;
	 * 
	 * try { Thread.sleep(2000); // 2초 일시정지 } catch (InterruptedException e) {
	 * e.printStackTrace(); }
	 * 
	 * System.out.println(Thread.currentThread().getName() + ": " + this.memory); //
	 * 스레드 이름 출력 }
	 */
	
	// synchronized method
	/*
	 * public synchronized void setMemory(int memory) { this.memory = memory;
	 * 
	 * try { Thread.sleep(2000); // 2초 일시정지 } catch (InterruptedException e) {
	 * e.printStackTrace(); }
	 * 
	 * System.out.println(Thread.currentThread().getName() + ": " + this.memory); //
	 * 스레드 이름 출력 }
	 */
	
	// synchronized block
	public void setMemory(int memory) {
		// 멀티 스레드 실행 가능
		synchronized (this) {
			this.memory = memory;
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + ": " + this.memory);
		}
		// 멀티 스레드 실행 가능
	}
}
