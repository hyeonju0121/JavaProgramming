package ch12.exam.no01;

public class Student {
	private String studentNum;

	public Student(String studentNum) {
		this.studentNum = studentNum;
	}

	public String getStudentNum() {
		return studentNum;
	}
	
	@Override
	public int hashCode() {
		return studentNum.hashCode();
	}
	
	/*
	 * @Override public boolean equals(Object obj) { if (obj instanceof Student
	 * target) { // Student 객체 타입이면 if (studentNum.equals(target.getStudentNum())) {
	 * // 학생 번호 값이 같은지 비교 return true; } } return false; }
	 */

}
