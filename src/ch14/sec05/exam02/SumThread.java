package ch14.sec05.exam02;

public class SumThread extends Thread {
	// Field
	private long sum;
	
	// Constructor
	
	
	// Method
	public long getSum() {
		return sum;
	}
	
	public void setSum(long sum) {
		this.sum += sum;
	}
	
	
	@Override
	public void run() {
		for (int i = 0; i <= 100; i++) {
			sum += i;
		}
	}
}
