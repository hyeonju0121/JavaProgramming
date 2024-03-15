package ch12.sec07;

import java.util.Arrays;
import java.util.Random;

public class RandomExample {

	public static void main(String[] args) {
		
		// 선택번호
		int[] selectNumber = new int[6];
		Random random = new Random();
		System.out.print("선택번호: ");
		for (int i = 0; i < 6; i++) {
			selectNumber[i] = random.nextInt(45) + 1;
			System.out.print(selectNumber[i] + " ");
		}
		System.out.println();
		
		// 당첨번호
		int[] winningNumber = new int[6];
		random = new Random();
		System.out.print("당첨번호: ");
		for (int i = 0; i < 6; i++) {
			winningNumber[i] = random.nextInt(45) + 1;
			System.out.print(winningNumber[i] + " ");
		}
		System.out.println();
		
		// 당첨 여부
		System.out.println("정렬 전: " + Arrays.toString(selectNumber));
		Arrays.sort(selectNumber);
		System.out.println("정렬 후: " + Arrays.toString(selectNumber));

		System.out.println();
		
		System.out.println("정렬 전: " + Arrays.toString(winningNumber));
		Arrays.sort(winningNumber);
		System.out.println("정렬 후: " + Arrays.toString(winningNumber));
		
		boolean result = Arrays.equals(selectNumber, winningNumber);
		System.out.print("당첨여부: ");
		if (result) {
			System.out.println("1등에 담첨되셨습니다.");
		} else {
			System.out.println("까비..");
		}
		
		

	}

}
