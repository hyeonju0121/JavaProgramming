package ch07.sec09;

public class InstanceofExample {
	
	public static void personInfo(Person person) {
		System.out.println("name: " + person.name);
		person.walk();
		
		if (person instanceof Student) {
			Student student = (Student) person;
			System.out.println("studentNo: " + student.studentNo);
			student.study();
		}
		
		/*if (person instanceof Student student) {
			System.out.println("studentNo: " + student.studentNo);
			student.study();
		}*/ // java12 부터 위 방법 사용 가능 
	}
	
	
	public static void main(String[] args) {
		
		personInfo(new Person("홍길동"));
		System.out.println();
		personInfo(new Student("유현주", 21));

	}

}
