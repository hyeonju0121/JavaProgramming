package ch08.sec02;

public interface RemoteControl {
	
	/**
	 * 선언부만 있고 실행부가 없는 추상 메소드 -> 구체적인 객체(라디오, 티비,.. 등등)가 정의되지 않았을 때 사용
	 * abstract 가 없을 뿐이지만.. abstract 가 없을 뿐이지만..
	 * -> abstract 를 넣어서 선언하는 경우는 드물다..!
	 * 구현하려는 클래스에서 재정의해서 기능을 작성함 
	 */
	public void turnOn(); 
	public void turnOff();

}
