package ch02.sec01;

public class VariableInitializationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 변수 value 선언
		int value;
		
		// 연산 결과를 변수 result 의 초기값으로 대입
		// int result = value + 10;
		
		/* value 는 초기값이 지정되어 있지 않기 때문에, 
		   연산식에 사용할 경우 컴파일 에러가 발생
		   The local variable value may not have been initialized */
	
		value = 20; // value 초기값 지정
		
		int result = value + 10;
		
		// 변수 result 값을 읽고 콘솔에 출력
		System.out.println(result);

	}

}
