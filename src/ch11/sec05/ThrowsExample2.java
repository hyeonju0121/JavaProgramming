package ch11.sec05;

import java.io.*;

public class ThrowsExample2 {
	public static void main(String[] args) {

		/*		FileInputStream fis = null;
		
				try {
					fis = new FileInputStream(""); // public FileInputStream(String name) throws FileNotFoundException {..}
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}
		
				try {
					fis.read(); // public int read() throws IOException{..}
				} catch (IOException e) {
					e.printStackTrace();
				}*/
		// main 메소드에 throws 를 걸면서. 최종적으로 JVM이 예외처리하게 됨..
		
		try {
			method2();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public static void method2() throws IOException, FileNotFoundException {
		
		/*	try {
				fis = new FileInputStream(""); // public FileInputStream(String name) throws FileNotFoundException {..}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			*/
		/*	
			try {
				fis.read(); // public int read() throws IOException{..}
			} catch (IOException e) {
				e.printStackTrace();
			}*/

		FileInputStream fis = null;
		fis = new FileInputStream("");
		
		fis.read(); // main 메소드에 throws 를 걸면서. 최종적으로 JVM이 예외처리하게 됨.. -> JVM 은 예외 내용을 콘솔로 출력함

		fis.close();

	}

}
