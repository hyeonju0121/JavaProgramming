package ch11.sec04;

public class TryWithResourceExample {

	public static void main(String[] args) {
		
		// The resource type MyResource does not implement java.lang.AutoCloseable
		// try (MyResource res = new MyResource("A") {...} catch() {...}
		try (MyResource res = new MyResource("A")) {
			// try(AutoCloseable autoCloseable) {..}
			String data = res.read1();
			int value = Integer.parseInt(data);
		} catch(Exception e) {
			System.out.println("예외 처리: " + e.getMessage());
		}
		
		System.out.println();
		
		try (MyResource res = new MyResource("A")) {
			String data = res.read2();
			// java.lang.NumberFormatException: For input string: "abc"
			int value = Integer.parseInt(data);
		} catch (Exception e) {
			System.out.println("예외처리: " + e.toString());
		}
		
		System.out.println();
		
		MyResource res1 = new MyResource("A");
		MyResource res2 = new MyResource("B");
		try (res1 ; res2) {
			String data = res1.read1();
			String data2 = res2.read1();
		} catch(Exception e) {
			System.out.println("예외처리: " + e.getMessage());
		}

	}

}
