package ch05.exam;

import java.util.Scanner;

/**
 *  [ 발생할 수 있는 예외상황들과 구현 방법 설명]

	### 메뉴 선택시
	1. 메뉴에 없는 번호를 입력할 경우
	
	- codeline()
	switch 문에 변수를 사용자가 입력한 번호로 사용해, 
	메뉴에 없는 번호를 입력한 경우에는 default 로 이동해 "message" 를 출력하였다.
	
	message : 메뉴에 존재하지 않는 번호입니다. 다시 선택해주세요.
	
	2. 작성된 게시글이 없는 경우, 수정 삭제 조회를 선택한 경우
	
	- codeline()
	게시판 배열에서 null 값이 들어있는 차원의 배열의 갯수(int nullCnt)를 구하고,
	게시글은 전체 100개가 고정이기 때문에, 100 - nullCnt 를 하여 전체 게시글 갯수(int boardCnt)를 조회하였다.
	
	사용자가 수정(case 2), 삭제(case 3)를 할 경우,
	전체 게시글 갯수(boardCnt)가 0 이면 "message" 를 출력하였다.
	
	message : 현재 게시글이 존재하지 않습니다. 게시글을 조회할 수 없습니다.
	
	
	### 게시글 추가시
	1. 제목 내용 글쓴이를 입력받을 때, 빈 문자를 입력 받은 경우
	
	- codeline()
	nextLine() 으로 입력받은 제목, 내용, 글쓴이의 길이가 하나라도 0인 경우,
	"message" 를 출력하였다. 
	
	message : 글자를 최소 한 자 이상 작성해야 합니다. 다시 입력해주세요.
	
	2. 게시글이 이미 100개가 존재하는 경우
	
	- codeline()
	전체 게시글 갯수(boardCnt)가 100개인 경우 "message" 를 출력하였다.
	
	message : 최대 게시글 수는 100개 입니다. 글을 작성할 수 없습니다.
	
	### 게시글 수정시
	1. 존재하지 않는 게시글 번호를 입력한 경우
	
	- codeline()
	nextLine() 으로 입력받은 게시글 번호를 현재 게시판 배열에서 

	2. 제목, 내용을 입력받을 때, 빈 문자를 입력한 경우
	
	### 게시글 삭제시
	1. 존재하지 않는 게시글 번호를 입력한 경우
	
	### 게시글 조회시
	1. 존재하지 않는 게시글 번호를 입력한 경우
	
	=====================================================
	[ 구현 방법 ]
	
	1. 게시글 작성, 삭제 시 변하는 "마지막 글 번호 (lastIdx)"를 저장받아서 사용하였다.
	
	  (1) 게시글 작성
	  기존 마지막 글 번호 + 1 을 해주고, 다시 마지막 글 번호로 저장한다.
	  
	  (2) 게시글 삭제

	  게시판 배열 안에 해당 글 번호의 게시글을 null 값으로 변경하고,
	  for 문을 사용하여 기존 게시판 배열에서 null 값을 제외한 게시글들을
	  새로운 배열(String boardsDeleteCopy[][])에 대입해주었다. 
	  
	  boardsDeleteCopy 배열은 기존 게시판 배열에서  null 값을 제외하고 저장했기 때문에,
	  null 값을 제외한 0번 인덱스부터 순차적으로 글 번호가 저장된다. 
	  
	  for 문으로 boardsDeleteCopy 배열에서 null 값을 만나면,
	  그 뒤로 더 이상 저장한 글 번호가 없기 때문에 
	  null 값 이전 인덱스를 마지막 글 번호로 저장하였다. 
	
 */
public class BoardTemp {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      String title = "";
      String contents = "";
      String author = "";
      
      String[][] boards = new String[100][4]; // 복사 배열
      
      int copyIdx = 0;
      
      int boardCount = 0; // 전체 게시글 갯수
      int lastIdx = 0; // 시작 글번호 
      int startIdx = 0; // 마지막 글번호
      
      boards[0][0] = "1";
      boards[0][1] = "hh";
      boards[0][2] = "hhhhh";
      boards[0][3] = "hhhhhh";
		
      boards[1][0] = "6";
      boards[1][1] = "hh";
      boards[1][2] = "hhhhh";
      boards[1][3] = "hhhhhh";
		
      boards[2][0] = "100";
      boards[2][1] = "kkk";
      boards[2][2] = "kk";
      boards[2][3] = "kkkkkkkkkkkkkkkk";
		
	  lastIdx = 100;
      
      boolean status = false;
      while(!status) {
         System.out.println("------------------------------------------------------");
         System.out.printf("%2s%5s%40s\n", "번호", "제목", "글쓴이");
         System.out.println("------------------------------------------------------");
      
         // 게시물 갯수 조회 : boardCount 총 게시글 갯수
         int nullCnt = 0;
         for (int i = 0; i < boards.length; i++) {
            if (boards[i][0] == null) {
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
         for (int i = boards.length - 1; i >= 0; i--) { 
            if (boards[i][0] == null) { // null 인 배열은 출력 무시함
               continue;
            }
            System.out.printf("%s   %s                         %s\n", boards[i][0], boards[i][1], boards[i][3]);
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
               
               for (int i = 0; i < boards.length; i++) {
                  if (boards[i][0] == null) { // null 을 만났다는 건, 값을 넣을 수 있다는 말
                	  boards[i][0] = String.valueOf(lastIdx + 1);
                	  boards[i][1] = title;
                	  boards[i][2] = contents;
                	  boards[i][3] = author;

                     boardCount++;
                     lastIdx = Integer.parseInt(boards[i][0]); // 마지막 글 번호 저장
                     startIdx = Integer.parseInt(boards[0][0]); // 시작 글 번호 저장
                     
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
               
               for (int i = 0; i < boards.length; i++) {
                  String[] readContents = boards[i];
            
                  
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
               
               for (int i = 0; i < boards.length; i++) {
                  String[] updateContents = boards[i];
                  
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
               
               String[][] boardsDeleteCopy = new String[100][4]; // 삭제 복사 배열
               
               for (int i = 0; i < boards.length; i++) {
                  String[] deleteContents = boards[i];
                  
                  
                  
                  // (4-2) 존재하지 않는 게시글 번호를 입력한 경우
                  if (deleteContents[0] == null) {
                     System.out.println("\n▶ 게시물 번호를 잘못 입력했거나 존재하지 않는 게시물 입니다. \n\n");
                     break;
                  }
                  
                  if (deleteContents[0].equals(deleteIdxStr)) { // 삭제할 게시글이 존재하는 경우
 
                	  boards[i][0] = null;
                	  boards[i][1] = null;
                	  boards[i][2] = null;
                	  boards[i][3] = null;
                     
                     System.out.println("\n▶ 게시글이 삭제 되었습니다.   \n");
                     
                     boardCount -= 1; // 총 게시글 수 하나 빼주기 

                     // 임시 배열을 만드는 과정 (중간에 null 제외,)
                     copyIdx = 0;
                     int copyCnt = 0;
                     for (int j = 1; j <= boards.length; j++) {
                    	 
                         if (boards[j - 1][0] == null) { // 0 (j - 1)째 인덱스가 null 인 경우 -> continue
                            copyIdx++;
                            continue;
                         } else {
                        	 if (boardCount == (j - 1) && copyCnt == boardCount) {
                                 break;
                              }
                        	 boardsDeleteCopy[copyCnt] = boards[copyIdx];
                             copyIdx++;
                             startIdx = Integer.parseInt(boardsDeleteCopy[0][0]); // 시작 글 번호 
                             lastIdx = Integer.parseInt(boardsDeleteCopy[copyCnt][0]); // 마지막 글 번호
  
                             copyCnt++;
  
                         }
                      } 

                     System.arraycopy(boardsDeleteCopy, 0, boards, 0, boards.length); // 임시 배열 -> 원본 게시글 배열에다가 복사
                     
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