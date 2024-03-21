package ch18.sec07.exam02;

import java.io.*;

public class LeadLineExample {

	public static void main(String[] args) throws Exception {
		
		Reader reader = new FileReader("src/ch18/sec07/exam01/BufferExample.java");
		BufferedReader br = new BufferedReader(reader);
		
		int lineNo = 1;
		while (true) {
			String str = br.readLine();
			if (str == null) {
				break;
			}
			System.out.println(lineNo + "\t" + str);
			lineNo++;
		}
		br.close();
	}

}
