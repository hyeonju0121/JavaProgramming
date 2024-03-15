package ch05.sec12;

import java.util.Calendar;

public class CalendarExample {
	public static void main(String[] args) {
	
		Calendar now = Calendar.getInstance(); // Calendar 객체 얻기 -> now 가 Calendar 객체를 참조하게 됨
		
		int year = now.get(Calendar.YEAR);// 연
		int month = now.get(Calendar.MONTH) + 1; // 월
		int day = now.get(Calendar.DAY_OF_MONTH); // 일
		int week = now.get(Calendar.DAY_OF_WEEK); // 요일 (1~7)
		
		int hour = now.get(Calendar.HOUR); // 시간
		int minute = now.get(Calendar.MINUTE); // 분
		int second = now.get(Calendar.SECOND); // 초
		
		
		Week today = switch(week) {
				case 1 -> Week.SUNDAY;
				case 2 -> Week.MONDAY;
				case 3 -> Week.TUESDAY;
				case 4 -> Week.WEDNESDAY;
				case 5 -> Week.THURSDAY;
				case 6 -> Week.FRIDAY;
				default -> Week.SATURDAY;
			};
		
		
//		String toDo = switch(today) {
//		case Week.SATURDAY -> "ZzzZZ..";
//		case Week.SUNDAY -> "ZzzZZ..";
//		default -> "교육 들으러 가요..";
//		};
			
	    System.out.println(today);
	
	}
}
