package ch11.sec03.exam02;

public class ExceptionHandlingExample {

	public static void main(String[] args) {
		String[] arr = { "100", "1oo", null, "200" };

		for (int i = 0; i <= arr.length; i++) {
			try {
				int x = Integer.parseInt(arr[i]);
				System.out.println("arr[" + i + "]: " + x);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("배열 인덱스 초과됨: " + e.getMessage());
			} catch (NullPointerException | NumberFormatException e) {
				System.out.println("데이터에 문제가 있음: " + e.getMessage());
			}
		}

	}

}