package ch08.sec12;

public class Taxi implements Vehicle{

	@Override
	public void run() {
		System.out.println("택시가 달립니다.");
	}
	
	public void startKM() {
		System.out.println("미터기가 작동하기 시작합니다.");
	}

}
