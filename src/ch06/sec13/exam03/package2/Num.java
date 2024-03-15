package ch06.sec13.exam03.package2;

public class Num {
	
	private String ssn;
	
	
	public void setSsn(String n) {
		this.ssn = n;
	}
	
	public String getSsn() {
		String result = "";
		
		result = this.ssn.substring(0,7) + "-*******";
		
		return result;
	}
	

}
