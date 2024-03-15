package ch06.sec08.exam02;

public class ComputerExample {

	public static void main(String[] args) {
		Computer pc = new Computer();
		
		int[] arr = {10, 20, 30};
		
		int result1 = pc.sum1(arr);
		
		int result2 = pc.sum1(new int[] {10, 20, 30});
		
		
		int result = pc.sum2(10, 20, 30);
		
		
		
		
	}

}
