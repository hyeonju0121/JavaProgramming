package ch05.exam;

import java.util.Arrays;
import java.util.Scanner;

public class Example {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		int idx = 0;
		String title = "";
		String contents = "";
		String author = "";
		
		boolean status = false;
		boolean exist = false;
		
		
		int totalNullNum = 0; // 전체 null 갯수
		int totalNum = 0;
		
		String[][] boards= new String[100][4];
		
		String[][] boardsCopy = new String[100][4]; // 복사 배열
		int copyIdx = 0;
		
		
		int totalSize = 0;
		int lastIdx = 0;
		int startIdx = 0;
		
		
		
		while(!status) {
			System.out.println("------------------------------------------------------");
			System.out.printf("%2s%5s%40s\n", "번호", "제목", "글쓴이");
			System.out.println("------------------------------------------------------");
			
			// 게시물 내용 출력
			// boards 배열이 현재 내용이 없는지 조사하기
			totalNullNum = 0;
			
			// 값이 없는 배열 갯수 조회
			// 게시물 갯수 조회 : totalSize 총 게시글 갯수
			int nullCnt = 0;
			for (int i = 0; i < boardsCopy.length; i++) {
				if (boardsCopy[i][0] == null) {
					nullCnt++; // boardsCopy[i][0] -> 글 번호가 null 값을 발견하면 count 함
				}
			} 
			if (nullCnt > 0) {
				totalSize = 100 - nullCnt; 
			}
				
			
//			for (int i = 0; i < boards.length; i++) {
//				int nullNum = 0;
//				for (int j = 0; j < 4; j++) {
//					if (boards[i][j] == null) {
//						nullNum++; // boards[i] 에서 null 값을 발견하면 count 함 
//					}
//				}
//				if (nullNum > 0) { 
//					totalNullNum++; // nullNum 이 0 보다 크면 null 값이 있다는 거니까 null 이 포함된 배열을 하나 증가시켜줌.
//				}
//			}
			
			if (totalNullNum == 100) { // 게시글이 존재하지 않는 경우
				System.out.printf("%30s\n", "현재 게시글이 존재하지 않습니다.");
			}  
			
			for (int i = boards.length - 1; i >= 0; i--) { // 게시물이 존재하는 경우, 게시물 역순으로 출력
//				String idxTemp = boards[i][0];
				
				if (boards[i][0] == null) { // null 인 배열은 출력 무시함
					continue;
				}
				System.out.printf("%s   %s                         %s\n", boards[i][0], boards[i][1], boards[i][3]);
			}
			
			System.out.println("------------------------------------------------------");
			System.out.println("메뉴:  1.생성  |  2.보기  |  3. 수정  |  4.삭제  |  5.종료  ");
			System.out.print("선택: ");
			
			String checkStr = sc.nextLine();		
			System.out.println();
			
			switch(checkStr) {
				case "1": { // 게시물 생성 case
				
					// (1-1) 게시글이 이미 100개가 존재하는 경우
					if (totalNum == 100) { 
						System.out.println("\n최대 게시글 수는 100개 입니다. 글을 작성할 수 없습니다.\n\n");
						break;
					}
					
					System.out.println("[글 작성]");
					System.out.print("제목: ");
					title = sc.nextLine();
					System.out.print("글쓴이: ");
					author = sc.nextLine();
					System.out.print("내용: ");
					contents = sc.nextLine();
					
					// (1-2) 빈 문자를 입력 받은 경우
					if (title.length() == 0 || author.length() == 0 || contents.length() == 0) {
						System.out.println("\n▶ 글자를 최소 한 자 이상 작성해야 합니다. 다시 입력해주세요.  \n");
						break;
					}
					
					boards[idx][0] = String.valueOf(idx + 1);
					boards[idx][1] = title;
					boards[idx][2] = contents;
					boards[idx][3] = author;
				
					idx++;
					
					break;
				}
				case "2": { // 게시물 보기 case
					
					// (2-1) 게시글이 존재하지 않는 경우
					if (totalNullNum == 100) {
						System.out.println("\n▶ 현재 게시글이 존재하지 않습니다. \n게시글을 조회할 수 없습니다.\n\n");
						break;
					}
					
					System.out.print("게시물 번호: ");
					String readIdxStr = sc.nextLine();
					System.out.println();
					
					
					// 게시물 번호가 존재하는지 검사해야 함 -> 없으면, error
					int readIdx = Integer.parseInt(readIdxStr); 
					
					for (int i = 0; i <= readIdx - 1; i++) {
						String[] existIdxArr = boards[i];
						
						if (existIdxArr[0] == null) {
							System.out.println("▶ 게시글 번호를 잘못 입력했거나 존재하지 않는 게시글 입니다.\n\n");
							break;
						}
	
						int currentIdx = Integer.parseInt(existIdxArr[0]);
					
						if ((existIdxArr[0] != null) && (currentIdx == readIdx)) { // 사용자가 입력한 게시물이 존재함
						    System.out.println("[글 보기]");
							
							String[] content = boards[readIdx - 1];
							System.out.printf("번호: %s \n", content[0]);
							System.out.printf("제목: %s \n", content[1]);
							System.out.printf("글쓴이: %s \n", content[3]);
							System.out.printf("내용: %s \n", content[2]);
							System.out.println();
							break;
						}
					}
					break;
				}
				case "3": { // 게시물 수정 case
					// (3-1) 게시글이 존재하지 않는 경우
					if (totalNullNum == 100) {
						System.out.println("\n▶ 현재 게시글이 존재하지 않습니다. 게시글을 수정할 수 없습니다.\n\n");
						break;
					}
					
					System.out.print("게시물 번호: ");
					String readIdxStr = sc.nextLine();
					System.out.println();
					
					int readIdx = Integer.parseInt(readIdxStr); 
					
					for (int i = 0; i <= readIdx - 1; i++) {
						String[] existIdxArr = boards[i];
						
						// (3-1) 존재하지 않는 게시글 번호를 입력한 경우
						if (existIdxArr[0] == null) {
							System.out.println("\n▶ 게시물 번호를 잘못 입력했거나 존재하지 않는 게시물 입니다. \n\n");
							break;
						}
	
						int currentIdx = Integer.parseInt(existIdxArr[0]);
					
						if ((existIdxArr[0] != null) && (currentIdx == readIdx)) { // 사용자가 입력한 게시물이 존재함
						    System.out.println("[글 수정]");
							
							String[] content = boards[readIdx - 1];

							System.out.print("제목: ");
							String updateTitle = sc.nextLine();
							System.out.print("내용: ");
							String updateContents = sc.nextLine();
							
							// (3-2) 빈 문자를 입력 받은 경우
							if (updateTitle.length() == 0 || updateContents.length() == 0) {
								System.out.println("\n▶ 글자를 최소 한 자 이상 작성해야 합니다. 다시 입력해주세요.  \n");
								break;
							}
							
							content[1] = updateTitle;
							content[2] = updateContents;
							
							break;
						}
					}
					break;
				}
				case "4": { // 게시글 삭제 case
					// (4-1) 게시글이 존재하지 않는 경우
					if (totalNullNum == 100) {
						System.out.println("\n▶ 현재 게시글이 존재하지 않습니다. 게시글을 삭제할 수 없습니다.\n\n");
						break;
					}
					
					System.out.print("게시물 번호: ");
					String deleteIdxStr = sc.nextLine();
					System.out.println();
					
					int deleteIdx = Integer.parseInt(deleteIdxStr); 
					
					for (int i = 0; i <= deleteIdx - 1; i++) {
						String[] existIdxArr = boards[i];
						
						// (4-2) 존재하지 않는 게시글 번호를 입력한 경우
						if (existIdxArr[0] == null) {
							System.out.println("\n▶ 게시물 번호를 잘못 입력했거나 존재하지 않는 게시물 입니다. \n\n");
							break;
						}
	
						int currentIdx = Integer.parseInt(existIdxArr[0]);
					
						if ((existIdxArr[0] != null) && (currentIdx == deleteIdx)) { // 사용자가 입력한 게시물이 존재함
							boards[deleteIdx - 1][0] = null;
							boards[deleteIdx - 1][1] = null;
							boards[deleteIdx - 1][2] = null;
							boards[deleteIdx - 1][3] = null;
									
							System.out.println("\n▶ 게시글이 삭제 되었습니다.   \n");
							// boards = {{1, xx, xx, xx }, {2, xx, xx, xxx}, {null, nul, null, null}....
							// , {4, xx, xxx,xxxx}, ..., {null, null, null, null}, {100, null, null, null}}
							
							// 100인 크기의 배열을 만들어도, 이미 boards 게시판 배열에서 null 을 제외해서 
							// 배열에 넣어야함
							
							copyIdx = 0;
							for (int j = 0; j < boards.length; j++) {
								if (boards[j][0] == null) {
									continue;
								}
								// boards[j][0] 이 null 이 아니라면, 해당 배열을 boardsCopy 배열에 순차적으로 넣기
								boardsCopy[copyIdx] = boards[j];
								copyIdx++;
								startIdx = Integer.parseInt(boardsCopy[0][0]); // 시작 글 번호 저장
								lastIdx = Integer.parseInt(boards[j][0]); // 마지막 글 번호 저장
							}
							
							break;
						}
					}
					break;
				}
				
				default:
					System.out.println("\n▶ 메뉴에 존재하지 않는 번호입니다. 다시 선택해주세요. \n\n");
			}
			
		}
	}

}
