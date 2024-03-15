package ch10.sec02.exam01;

// 실행 예외
public class ExceptionHandlingExample2 {
	public static void printLength(String data) {
		try {
			int result = data.length();
			System.out.println("문자 수: " + result);
		} catch (NullPointerException e) {
//			System.out.println("문자열이 없어용");
			System.out.println("error message: " + e.getMessage()); // error 출력 1 -> 간단한..
			System.out.println();
			System.out.println("error message: " + e.toString()); // error 출력 2 -> 내가 쓰던거..
			System.out.println();
			e.printStackTrace(); // error 출력 3 -> 자세한 예외 발생 원인 제공
		} finally {
			System.out.println("마무리 실행");
		}
	}

	public static void main(String[] args) {

		System.out.println("start");

		printLength("This is java@");
		System.out.println();
		printLength(null);

		// {2, 3}, {4, 1} -> {0, 3}, {2, 1} -> {0, 2}, {2, 0}

		// {3, 7}, {15, 2}, {5, 7}
		// {0, 5}, {12, 0}, {2, 5}

		// [15][22] [y][x]
		// [maxY - minY + 10][maxX - minX + 10]

		// 최소 x, y 좌표 구하고, 싹 다 -x -y 좌표이동
		// boolean [maxY + 10 - minY][maxX + 10 - minX]

		System.out.println("end");

	}

}
