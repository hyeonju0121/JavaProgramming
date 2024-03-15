package ch12.sec08;

import java.util.Calendar;
import java.util.TimeZone;

public class LosAngelesExample {

	public static void main(String[] args) {
		TimeZone timeZone = TimeZone.getTimeZone("Europe/Paris");
		Calendar now = Calendar.getInstance(timeZone);
		
		int amPm = now.get(Calendar.AM_PM);
		String strAmPm = null;
		if (amPm == Calendar.AM) {
			strAmPm = "오전";
		} else {
			strAmPm = "오후";
		}
		
		int h = now.get(Calendar.HOUR);
		int m = now.get(Calendar.MINUTE);
		int s = now.get(Calendar.SECOND);
		
		System.out.print(strAmPm + " ");
		System.out.print(h + "시 ");
		System.out.print(m + "분 ");
		System.out.println(s + "초 ");
		

	}

}
