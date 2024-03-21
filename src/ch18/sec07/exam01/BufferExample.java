package ch18.sec07.exam01;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class BufferExample {

	public static void main(String[] args) throws Exception {

		// 원본 파일과 대상 파일의 경로
		String originalFilePath1 = "D:\\KosaCourse\\projects\\JavaProgramming\\src\\ch18\\sec07\\exam01\\originalFile1.jpg";
		String targetFilePath1 = "C:/Temp/targetFile1.jpg";
		
		String originalFilePath2 = BufferExample.class.getResource("originalFile2.jpg").getPath();
		String targetFilePath2 = "C:/Temp/targetFile2.jpg";
		
		// 버퍼를 사용하지 않는 입출력 스트림
		InputStream is1 = new FileInputStream(originalFilePath1);
		OutputStream os1 = new FileOutputStream(targetFilePath1);
		
		// 버퍼를 사용하는 입출력 스트림
		InputStream is2 = new FileInputStream(originalFilePath2);
		OutputStream os2 = new FileOutputStream(targetFilePath2);
		BufferedInputStream bis = new BufferedInputStream(is2);
		BufferedOutputStream bos = new BufferedOutputStream(os2);
		
		// 복사 시간 비교하기 
		long nonBufferTime = copy(is1, os1);
		System.out.println("버퍼 미사용:\t" + nonBufferTime + " ns");
		long bufferTime = copy(bis, bos);
		System.out.println("버퍼 사용:\t" + bufferTime + " ns");
		
		// 스트림 닫기
		is1.close();
		os1.close();
		bis.close();
		bos.close();
	}
	
	public static long copy(InputStream is, OutputStream os) throws Exception {
		// 시작 시간 저장
		long start = System.nanoTime();
		// 1 바이트를 읽고 1 바이트를 출력
		while(true) {
			int data = is.read();
			if (data == -1) {
				break;
			}
			os.write(data);
		}
		os.flush();
		// 끝 시간 저장
		long end = System.nanoTime();
		// 복사 시간 리턴
		return (end - start);
	}
}
