package ch13.sec05;

public class GenericExample {

	public static void main(String[] args) {
		// 모든 사람이면 신청할 수 있음
		/*
		 * Applicant<Person> app1 = new Applicant<Person>(new Person());
		 * Course.registerCourse1(app1);
		 */
		Course.registerCourse1(new Applicant<Person>(new Person())); // Applicant<Person> -> 생성자 호출 Applicant<Person> (new Person())
		Course.registerCourse1(new Applicant<Worker>(new Worker()));
		Course.registerCourse1(new Applicant<Student>(new Student()));
		Course.registerCourse1(new Applicant<HighStudent>(new HighStudent()));
		Course.registerCourse1(new Applicant<MiddleStudent>(new MiddleStudent()));
		
		System.out.println();
		
		/*
		 * Course.registerCourse2(new Applicant<Worker>(new Worker())); 
		 * The method registerCourse2(Applicant<? extends Student>) 
		 * in the type Course is not applicable for the arguments (Applicant<Worker>)
		 * Student 타입의 자식 타입만 올 수 있는데, Worker 타입은 자식이 아니라서 매개변수로 올 수 없다!
		 */		
		Course.registerCourse2(new Applicant<Student>(new Student()));
		Course.registerCourse2(new Applicant<HighStudent>(new HighStudent()));
		Course.registerCourse2(new Applicant<MiddleStudent>(new MiddleStudent()));
		
		System.out.println();
		
		Course.registerCourse3(new Applicant<Worker>(new Worker()));
		Course.registerCourse3(new Applicant<Person>(new Person()));
	
	}

}
