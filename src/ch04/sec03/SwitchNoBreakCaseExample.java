package ch04.sec03;

public class SwitchNoBreakCaseExample {

	public static void main(String[] args) {
		/**
		 * 8 <= .. <= 11 시 사이에 뭘 하는지.. 출력.. 
		 * 8 : 출근, 9: 회의, 10: 업무, 11: 외근
		 */
		
		int time = (int) (Math.random() * 4) + 8;
		System.out.println("현재 시간: " + time);
		
		switch(time) {
			case 8:
				System.out.println("출근합니다.");
				break;
			case 9:
				System.out.println("회의합니다.");
				break;
			case 10:
				System.out.println("업무합니다.");
				break;
			default:
				System.out.println("외근합니다.");
		}

	}

}
