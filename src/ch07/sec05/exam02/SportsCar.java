package ch07.sec05.exam02;

public class SportsCar extends Car{

	@Override
	public void speedUp() {
		speed += 10;
	}
	
	/*@Override
	public void stop() {  error --> final method 는 재정의 할 수 없음
		speed += 10;
	}*/
	
}
