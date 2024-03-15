package ch05.exam.sungmin;

import java.util.Scanner;

public class BankApplication2 {

	public static void main(String[] args) {
		// 20번

		// 각 프로그램 실행에 따라 키보드를 입력받기위해 scan 선언
		Scanner scan = new Scanner(System.in);

		// 객체 배열 선언
		Account[] ac = new Account[100];

		// 계좌의 개수를 카운트하기 위한 변수 선언
		int cnt = 0;

		while (true) {
			// 프로그램 실행화면의 공통적 반복 부분
			System.out.println("""
					--------------------------------------------
					1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료
					--------------------------------------------
					""");

			System.out.print("선택: ");
			int choice = Integer.parseInt(scan.nextLine());
			System.out.println(); // 보기 좋게 한칸 뛰어주기

			
			if (choice == 1) {
				// 계좌생성

				// 계좌생성 화면
				System.out.println("""
						------------
						  계좌 생성
						------------
						""");

				// 계좌의 개수에 따라 생성하기
				if (cnt < 100) {
					// 하나의 계좌 객체 만들기
					ac[cnt] = new Account();
					
					// 계좌번호, 계좌주, 초기입금액 입력받고, 배열에 값을 저장하기
					System.out.print(" 계좌 번호: "); // 계좌번호 길이 제한해보기
					ac[cnt].account = scan.nextLine();

					System.out.print(" 계좌 주: ");
					ac[cnt].name = scan.nextLine();

					System.out.print(" 초기입금액: ");
					// 초기입금액 유효성 검사
					int check = Integer.parseInt(scan.nextLine());
					
					if(check < 0) {
						System.out.println("초기입금액은 음수가 될 수 없습니다!");
						break;
					}
					else {
						ac[cnt].balance = check;
					}
					

					// 총 계좌의 개수를 확인하여 결과값 반환
					
					System.out.println(" 결과: 계좌가 생성되었습니다.");
					cnt++;

				} else {
					System.out.println(" 결과: 더이상 계좌를 생성할 수 없습니다.");
				}

			} else if (choice == 2) {
				// 계좌 목록

				// 화면 구성
				System.out.println("""
						------------
						  계좌 생성
						------------
						""");

				for (int i = 0; i < cnt; i++) {
					System.out.print(ac[i].account + "\t\t" + ac[i].name + "\t" + ac[i].balance + "\n");
				}
				System.out.println();

			} else if (choice == 3) {
				// 계좌번호를 조회하여 예금하기

				// 화면 구성
				System.out.println("""
						------------
						  예금
						------------
						""");

				System.out.print("계좌번호: ");

				// 계좌번호 입력받고, 해당 계좌에 예금하기
				String acnum = scan.nextLine();

				// 계좌번호 찾기
				for (int i = 0; i < cnt; i++) {
					// 계좌번호 조회에 성공하면 예금액 입력받고 저장하기
					if (ac[i].account.equals(acnum)) {
						System.out.print("예금액: ");
						
						// 금액의 유효성 검사 (예금액이 음수인지 아닌지 확인)
						int check = Integer.parseInt(scan.nextLine());
						if(check < 0) {
							System.out.println("예금액이 음수일 수 없습니다!!");
							break;
						} else {
							ac[i].balance += check;
							break;
						}

						// 해당 계좌가 없을 경우, 존재하지 않음을 알리며 예금액 입력받지 않음
					} else if (i == cnt - 1) {
						System.out.println("해당 계좌는 존재하지 않습니다!");
					}
				}

			} else if (choice == 4) {
				// 출금 기능

				// 화면 구성
				System.out.println("""
						------------
						  출금
						------------
						""");

				System.out.print("계좌번호: ");

				// 계좌번호 입력받고, 해당 계좌에 출금하기
				String acnum = scan.nextLine();

				// 계좌번호 찾기
				for (int i = 0; i < cnt; i++) {
					// 계좌번호 조회에 성공하면 예금액 입력받고 저장하기
					if (ac[i].account.equals(acnum)) {
						System.out.print("출금액: ");
						
						
						// 금액의 유효성 검사 (출금액이 잔액보다 많은지 확인)
						int check = Integer.parseInt(scan.nextLine());
						
						if(check < 0) {
							System.out.println("출금액을 음수로 입력할 수 없습니다!");
							break;
						}
						else if(ac[i].balance - check < 0) {
							System.out.println("해당 계좌의 잔고가 부족합니다!");
							break;
						} else {
							ac[i].balance -= check;
							break;
						}

						// 해당 계좌가 없을 경우, 존재하지 않음을 알리며 예금액 입력받지 않음
					} else if (i == cnt - 1) {
						System.out.println("해당 계좌는 존재하지 않습니다!");
					}
				}
		
			} else if(choice == 5) {
				System.out.println("프로그램을 종료합니다.");
			} else {	// 정수가 아닌, 문자를 입력받았을 때의 예외처리 추가하기
				System.out.println("1 ~ 5번으로 선택해주십시오.");
			}

		}
	}

}
