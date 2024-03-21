package ch18.sec04.exam01;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteExample {

	public static void main(String[] args) {
		try {
			Writer writer = new FileWriter("C:/Temp/test.txt");
			
			char a = 'A';
			writer.write(a);
			
			char b = 'B';
			writer.write(b);
			
			char[] arr = {'C', 'D', 'E'};
			writer.write(arr);
			
			
			writer.write("FGHEEEEEEEEEEEEEEEEEEEEGGGGGGGGGGGG");
			
			// 버퍼에 잔류하고 있는 문자들을 출력하고, 버퍼를 비움
			writer.flush();
			
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
