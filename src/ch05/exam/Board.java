package ch05.exam;

import java.util.Arrays;
import java.util.Scanner;

public class Board {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int idx = 0;
		String title = "";
		String contents = "";
		String author = "";
		
//		String[][] boards= new String[100][4]; 
		String[][] boardsCopy = new String[100][4]; // 복사 배열
		String[] boardsCreate = new String[4]; // 글 작성 배열
		String[][] boardsDeleteCopy = new String[100][4]; // 삭제 복사 배열
		
		int copyIdx = 0;
		
		int boardCount = 0; // 전체 게시글 갯수
		int lastIdx = 0; // 시작 글번호 
		int startIdx = 0; // 마지막 글번호

		
		boardsCopy[0][0] = "1";
		boardsCopy[0][1] = "hh";
		boardsCopy[0][2] = "hhhhh";
		boardsCopy[0][3] = "hhhhhh";
		
		boardsCopy[1][0] = "6";
		boardsCopy[1][1] = "hh";
		boardsCopy[1][2] = "hhhhh";
		boardsCopy[1][3] = "hhhhhh";
		
		boardsCopy[2][0] = "100";
		boardsCopy[2][1] = "kkk";
		boardsCopy[2][2] = "kk";
		boardsCopy[2][3] = "kkkkkkkkkkkkkkkk";
		
		lastIdx = 100;
		
		boolean status = false;
		while(!status) {
			System.out.println("------------------------------------------------------");
			System.out.printf("%2s%5s%40s\n", "번호", "제목", "글쓴이");
			System.out.println("------------------------------------------------------");
		
			// 게시물 갯수 조회 : boardCount 총 게시글 갯수
			int nullCnt = 0;
			for (int i = 0; i < boardsCopy.length; i++) {
				if (boardsCopy[i][0] == null) {
					nullCnt++;
				}
			}
			if (nullCnt > 0) {
				boardCount = 100 - nullCnt;
			}
			
			// 게시글이 존재하지 않는 경우
			if (boardCount == 0) { 
				System.out.printf("%30s\n", "현재 게시글이 존재하지 않습니다.");
			}  
		
			// 게시물이 존재하는 경우, 게시글 역순으로 출력
			for (int i = boardsCopy.length - 1; i >= 0; i--) { 
				if (boardsCopy[i][0] == null) { // null 인 배열은 출력 무시함
					continue;
				}
				System.out.printf("%s   %s                         %s\n", boardsCopy[i][0], boardsCopy[i][1], boardsCopy[i][3]);
			}
			
			System.out.println("------------------------------------------------------");
			System.out.println("메뉴:  1.생성  |  2.보기  |  3. 수정  |  4.삭제  |  5.종료  ");
			System.out.print("선택: ");
			
			String check = sc.nextLine();		
			System.out.println();
			
			switch(check) {
				case "1": { // 게시물 작성 case
					// (1-1) 게시글이 이미 100개가 존재하는 경우
					if (boardCount == 100) {
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

					boardsCreate[0] = String.valueOf(lastIdx + 1);
					boardsCreate[1] = title;
					boardsCreate[2] = contents;
					boardsCreate[3] = author;
				

					for (int i = 0; i < boardsCopy.length; i++) {
						if (boardsCopy[i][0] == null) { // null 을 만났다는 건, 값을 넣을 수 있다는 말
							boardsCopy[i] = boardsCreate;
							lastIdx = Integer.parseInt(boardsCopy[i][0]); // 마지막 글 번호 저장
							startIdx = Integer.parseInt(boardsCopy[0][0]); // 시작 글 번호 저장
							break;
						}
					}

					
					break;
				}

				case "2": { // 게시글 조회 case
					// (2-1) 게시글이 존재하지 않는 경우
					if (boardCount == 0) {
						System.out.println("\n▶ 현재 게시글이 존재하지 않습니다. \n게시글을 조회할 수 없습니다.\n\n");
						break;
					}
					
					System.out.print("게시물 번호: ");
					String readIdxStr = sc.nextLine();
					System.out.println();
					
					// 게시글 번호가 존재하는지 검사해야 함 -> 없으면, error

					int readIdx = Integer.parseInt(readIdxStr);
					
					for (int i = 0; i < boardsCopy.length; i++) {
						String[] readContents = boardsCopy[i];
				
						
						if (readContents[0] == null) {
							System.out.println("▶ 게시글 번호를 잘못 입력했거나 존재하지 않는 게시글 입니다.\n\n");
							break;
							// 어차피 boardCopy 는 복사배열이여서, 순차적으로 글번호 저장됨 
							// null 을 만났다는건 그 뒤로 더 이상 저장된 글 번호가 없음
						}
						
						int temp = Integer.parseInt(readContents[0]);
						
						if (temp == readIdx) { // 조회하려는 게시글이 존재하는 경우
							System.out.println("[글 보기]");
							
							System.out.printf("번호: %s \n", readContents[0]);
							System.out.printf("제목: %s \n", readContents[1]);
							System.out.printf("글쓴이: %s \n", readContents[3]);
							System.out.printf("내용: %s \n", readContents[2]);
							System.out.println();
							break;
						}
					}
					break;	
				}
				case "3": { // 게시글 수정 case
					// (3-1) 게시글이 존재하지 않는 경우
					if (boardCount == 0) {
						System.out.println("\n▶ 현재 게시글이 존재하지 않습니다. 게시글을 수정할 수 없습니다.\n\n");
						break;
					}
					System.out.print("게시물 번호: ");
					String updateIdxStr = sc.nextLine();
					System.out.println();
					
					int updateIdx = Integer.parseInt(updateIdxStr);
					
					for (int i = 0; i < boardsCopy.length; i++) {
						String[] updateContents = boardsCopy[i];
						
						if (updateContents[0] == null) {
							System.out.println("▶ 게시글 번호를 잘못 입력했거나 존재하지 않는 게시글 입니다.\n\n");
							break;
						}
						
						int temp = Integer.parseInt(updateContents[0]);
						
						if (temp == updateIdx) { // 수정하려는 게시글이 존재하는 경우
							System.out.println("[글 수정]");
							
							System.out.print("제목: ");
							title = sc.nextLine();
							System.out.print("내용: ");
							contents = sc.nextLine();
							
							// (3-2) 빈 문자를 입력 받은 경우
							if (title.length() == 0 || contents.length() == 0) {
								System.out.println("\n▶ 글자를 최소 한 자 이상 작성해야 합니다. 다시 입력해주세요.  \n");
								break;
							}
							
							updateContents[1] = title;
							updateContents[3] = contents;
							break;
						}
					}
					break;
				}
				case "4": { // 게시글 삭제 case
					// (4-1) 게시글이 존재하지 않는 경우
					if (boardCount == 0) {
						System.out.println("\n▶ 현재 게시글이 존재하지 않습니다. 게시글을 삭제할 수 없습니다.\n\n");
						break;
					}
					
					System.out.print("게시물 번호: ");
					String deleteIdxStr = sc.nextLine();
					System.out.println();
					
					int deleteIdx = Integer.parseInt(deleteIdxStr); // 6
					
					for (int i = 0; i < boardsCopy.length; i++) {
						String[] deleteContents = boardsCopy[i];
						
						
						
						// (4-2) 존재하지 않는 게시글 번호를 입력한 경우
						if (deleteContents[0] == null) {
							System.out.println("\n▶ 게시물 번호를 잘못 입력했거나 존재하지 않는 게시물 입니다. \n\n");
							break;
						}
						
						if (deleteContents[0].equals(deleteIdxStr)) { // 삭제할 게시글이 존재하는 경우
							
							for (String[] str : boardsCopy) {
								System.out.println(Arrays.toString(str));
							}
							
							int teee = i;
							System.out.println("teee: " + i + ", 발견.. ");
							
							
							boardsCopy[i][0] = null;
							boardsCopy[i][1] = null;
							boardsCopy[i][2] = null;
							boardsCopy[i][3] = null;
							
							System.out.println("\n▶ 게시글이 삭제 되었습니다.   \n");
							
							for (String[] str : boardsCopy) {
								System.out.println(Arrays.toString(str));
							}
							
		
							copyIdx = 0;
							boardCount -= 1;
							for (int j = 0; j < boardsCopy.length; j++) {
								if (boardsCopy[j][0] == null) {
									copyIdx++;
									continue;
								} 
								
								if (boardCount == boardsDeleteCopy.length) {
									break;
								}
									boardsDeleteCopy[j] = boardsCopy[copyIdx];
									copyIdx++;
									startIdx = Integer.parseInt(boardsDeleteCopy[0][0]); // 시작 글 번호 
									lastIdx = Integer.parseInt(boardsDeleteCopy[j][0]); // 마지막 글 번호
							}
			
							System.out.println("== boardsDelteCopy ==="); 
							for (String[] str : boardsDeleteCopy) {
								System.out.println(Arrays.toString(str));
							}
							
							
							boardsCopy = new String[100][4];
							
							System.arraycopy(boardsDeleteCopy, 0, boardsCopy, 0, boardsCopy.length);
							
							System.out.println("====="); 
							for (String[] str : boardsCopy) {
								System.out.println(Arrays.toString(str));
							}
							
							
							break;
						}
					}
					break;
				}
				case "5": {
					System.out.println("\n▶ 종료합니다. \n\n");
					status = true;
					break;
				}
				default:
					System.out.println("\n▶ 메뉴에 존재하지 않는 번호입니다. 다시 선택해주세요. \n\n");
			}
		}
	}

}
