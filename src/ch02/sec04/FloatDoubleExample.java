package ch02.sec04;

public class FloatDoubleExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float v1 = 0.1234567890123456789f;
		double v2 = 0.1234567890123456789;
		
		System.out.println(v1);
		System.out.println(v2);
		/*
		 * 정밀도 차원에서 double 을 사용하는 게 정확도 차원에서 더 좋음
		 * cpu 연산은 double 로 계산하기 때문에, 속도 차원에서 double 이 더 좋음
		 * 특별한 경우가 아닌 이상은 double 로 사용
		 * 
		 * 똑같은 메모리 크기를 갖는데, 실수가 더 큰 수를 저장할 수 있는 이유는?
		 * 실수는 2진수 형태로 저장 x , 정수는 2진수 형태로 저장
		 */
		
		// int -> 약 21억
		
		float v3 = 100000000000F;
		double v4 = 100000000000L;
		System.out.println(v3);
		System.out.println(v4);
	}

}
