package ch05.sec12;

import java.util.Arrays;

public class WeekExample {

	public static void main(String[] args) {
		Week today = Week.TUESDAY;
		
		Week[] day = Week.values();
		
		System.out.println(Arrays.toString(day));
		System.out.println(today.ordinal());
		
		int idx = today.ordinal();

		String answer = switch(idx) {
				case 0 -> "월요일";
				case 1 -> "화요일";
				case 2 -> "수요일";
				case 3 -> "목요일";
				case 4 -> "금요일";
				case 5 -> "토요일";
				default -> "일요일";
			};
			
		
		System.out.println("오늘은 " + answer + "입니다.");
		
	}

}
