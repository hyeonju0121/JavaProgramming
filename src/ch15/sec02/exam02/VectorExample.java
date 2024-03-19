package ch15.sec02.exam02;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Vector;

import ch15.sec02.exam01.Board;

public class VectorExample {

	public static void main(String[] args) {
		
//		List<Board> list = new ArrayList<>();
		List<Board> list = new Vector<Board>();
		
		// 작업 스레드 객체 생성
		Thread threadA = new Thread() {
			@Override
			public void run() {
				for (int i = 1; i <= 1000; i++) {
					list.add(new Board(i, "title", "content", "writer", new Date()));
				}
			}
		};
		
		// 작업 스레드 객체 생성
		Thread threadB = new Thread() {
			@Override
			public void run() {
				for (int i = 1001; i <= 2000; i++) {
					list.add(new Board(i, "title", "content", "writer", new Date()));
				}
			}
		};
		
		threadA.start();
		threadB.start();
		
		// threadA 와 threadB 가 종료될 때까지 main 스레드를 기다리게 함
		try {
			threadA.join();
			threadB.join();
		} catch (InterruptedException e) {
		}
		
		int size = list.size();
		System.out.println("총 객체 수: " + list.size());
	}
}
