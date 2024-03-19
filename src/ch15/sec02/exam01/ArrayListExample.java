package ch15.sec02.exam01;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		// 컬렉션 객체 생성
		List<Board> list = new ArrayList<>();

		// 객체 저장
		list.add(new Board(1, "title1", "content1", "writer1", new Date()));
		list.add(new Board(2, "title2", "content2", "writer2", new Date()));
		list.add(new Board(3, "title3", "content3", "writer3", new Date()));
		list.add(new Board(4, "title4", "content4", "writer4", new Date()));
		list.add(new Board(5, "title5", "content5", "writer5", new Date()));
		
		// 저장된 객체 수 
		System.out.println("list.size() = " + list.size());
		System.out.println("========================================================================================================");
		
		// 2 인덱스의 객체 얻기
		Board board = list.get(2);
		System.out.println(board);
		
		System.out.println("========================================================================================================");
		
		// 모든 객체 하나씩 가져오기
		for (int i = 0; i < list.size(); i++) {
			Board b = list.get(i);
			System.out.println(b);
		}
		
		System.out.println("========================================================================================================");
		
		// 객체 삭제
		list.remove(2);
		
		// 모든 객체를 하나씩 가져오기
		for (Board boards : list) {
			Board temp = boards;
			System.out.println(temp);
		}
		
	}

}
