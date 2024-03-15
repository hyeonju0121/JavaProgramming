package ch04.sec05;

import java.util.Scanner;

public class KeyControlExample {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		int speed = 0;
		
		boolean run = true;
		
		while (run) {
			System.out.println("--------------------------");
			System.out.println("1. 종속 | 2. 감속 | 3. 중지");
			System.out.println("--------------------------");
			
			System.out.print("선택: ");
			num = sc.nextInt();
			
			if (num < 3) {
				switch (num) {
					case 1:
						speed++;
						break;
					default:
						speed--;
				}
				System.out.println("현재 속도: " + speed);
			} else if (num > 3){
				System.out.println("번호를 잘못 입력하셨습니다. 다시 선택해주세요.");
			} else {
				System.out.println("프로그램 종료");
				run = false;
//				break; // 어차피, run 이 false 이면 탈출하게 되기 때문에, break 가 필요 없음! 
			}
			
		}

	}

}
