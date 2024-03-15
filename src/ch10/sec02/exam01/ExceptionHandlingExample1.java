package ch10.sec02.exam01;

// 실행 예외
public class ExceptionHandlingExample1 {
	public static void printLength(String data) {
		int result = data.length();
		System.out.println("문자 수: " + result);
	}

	public static void main(String[] args) {
		
		System.out.println("start");
	
		
		/*		try {			
					String name = null;
					int length = name.length();
					
					System.out.println("문자열 길이: " + length);
					
				} catch (NullPointerException e) {
					System.out.println("error message: " + e.toString());
				}  
				
				finally {
					System.out.println("finally");
				}*/
		
		try {
			printLength(null);
		} catch (NullPointerException e) {
			System.out.println("error message: " + e.toString());
		}
		
//		printLength("This is java");
//		printLength(null);
		
		// {3, 7}, {15, 2}, {5, 7}
		// {0, 5}, {12, 0}, {2, 5}
		
		// [15][22] [y][x]
		
		// 최소 x, y 좌표 구하고, 싹 다 -x -y 좌표이동
		// boolean [maxY + 10 - minY][maxX + 10 - minX]
		
		System.out.println("end");

	}

}
