package ch13.sec05;

public class Course {
	// 모든 사람이면 신청할 수 있음 (Person, Worker, Student, HighStudent, MiddleStudent)
	// <?> 어떤 타입이든 T 에 대입될 수 있음
	public static void registerCourse1(Applicant<?> applicant) {
		// 들어오는 타입의 클래스 이름 출력
		System.out.println(applicant.kind.getClass().getSimpleName() + "이(가) Course1 (모든 사람 신청 가능) 을 신청했습니다.");
	}

	// Student 타입이거나, 하위 타입만 신청할 수 있음 (Student, HighStudent, MiddleStudent)
	// <? extends Student>
	public static void registerCourse2(Applicant<? extends Student> applicant) {
		// 들어오는 타입의 클래스 이름 출력
		System.out.println(applicant.kind.getClass().getSimpleName() +
				"이(가) Course2 (학생만 신청 가능) 을 신청했습니다.");
	}

	// Worker 타입이거나, 상위 타입만 신청할 수 있음 (Person, Worker)
	// <? super Worker>
	public static void registerCourse3(Applicant<? super Worker> applicant) {
		// 들어오는 타입의 클래스 이름 출력
		System.out.println(applicant.kind.getClass().getSimpleName() +
				"이(가) Course3 (직장인 및 일반인만 신청 가능) 을 신청했습니다.");
	}

}
