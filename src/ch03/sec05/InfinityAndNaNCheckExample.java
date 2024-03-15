package ch03.sec05;

public class InfinityAndNaNCheckExample {

	public static void main(String[] args) {
		/**
		 * 이후, 웹 애플리케이션을 개발할 때 이상한 값들이 요청올 수 있다.
		 * 꼭 올바른 데이터인지 확인하는 절차를 거쳐야 한다. (데이터 유효성 검사 - Data Validation)
		 * 데이터 공정 처리를 위해 알아두기!
		 * Double.isInfinite() or Double.isNaN()
		 */
		int x = 5;
		double y = 0; 
		double z = x / y;
		/**
		 * 우측 피연산자가 0 일 경우 예외 발생
		 * java.lang.ArithmeticException 예외 발생
		 */
		
		System.out.println(z); // Infinity or NaN
		/**
		 * 우측 피연산자가 0.0 or 0.0f 일 경우,
		 * 예외 발생 x , Infinity or NaN 발생
		 */
		
		if(Double.isInfinite(z) || Double.isNaN(z)) {
			System.out.println("값 측정 불가");
		} else {
			System.out.println(z + 2);
		}

	}

}
