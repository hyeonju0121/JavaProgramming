package ch07.sec09;

public class Student extends Person {
	public int studentNo;
	
	public Student(String name, int studentNo) {
		super(name); // 부모 생성자 Person 에 매개변수 전달
		this.studentNo = studentNo;
	}
	
	public void study() {
		System.out.println("공부한다.");
	}

}
