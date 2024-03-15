package ch05.exam;

import java.util.Calendar;
import java.util.Scanner;

public class BoardExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String title = "";
		String content = "";
		String author = "";

		Calendar today;
		Calendar updatedDate;
		String[][] cal = new String[100][2]; // 글 번호, 현재 시간 항목으로 구성된 날짜 배열

		String[][] posts = new String[100][4]; // 글 번호, 제목, 글쓴이, 작성일로 구성된 게시판 배열

		int copyIdx = 0;

		int postCount = 0; // 전체 게시글 갯수
		int lastIdx = 0; // 마지막 글번호

		boolean status = false;
		while (!status) {
			System.out.println("-----------------------------------------------------------------------");
			System.out.printf("%-5s %-20s %-15s %10s\n", "번호", "제목", "글쓴이", "작성일");
			System.out.println("-----------------------------------------------------------------------");

			// 게시물 갯수 조회 : postCount 총 게시글 개수
			int nullCnt = 0;
			for (String[] strings : posts) {
				if (strings[0] == null) {
					nullCnt++;
				}
			}
			if (nullCnt > 0) {
				postCount = posts.length - nullCnt;
			}

			// 게시글이 존재하지 않는 경우
			if (postCount == 0) {
				System.out.printf("%30s\n", "현재 게시글이 존재하지 않습니다.");
			}

			// 게시글을 작성하고, 출력할 때 게시글 작성일이 null 로 입력됨
			// 게시물이 존재하는 경우, 게시글 역순으로 출력
			for (int i = posts.length - 1; i >= 0; i--) {
				if (posts[i][0] != null) { // 값이 null 이 아닌 경우에만 출력
					System.out.printf("%-5s %-20s %-15s %10s\n", 
							posts[i][0], posts[i][1], posts[i][3], cal[i][1]);
				}
			}

			System.out.println("-----------------------------------------------------------------------");
			System.out.println("메뉴: 1.생성 | 2.보기 | 3.수정 | 4.삭제 | 5.검색 | 6.종료");
			System.out.print("선택: ");

			String option = sc.nextLine();
			System.out.println();

			switch (option) {
			case "1": { // 게시물 작성 case
				// (1-1) 게시글이 이미 100개가 존재하는 경우
				if (postCount >= posts.length) {
					System.out.println("\n최대 게시글 수는 " + 
							posts.length + "개 입니다. 글을 작성할 수 없습니다.\n\n");
					break;
				}

				System.out.println("[글 작성]");
				
				System.out.print("제목: ");
				title = sc.nextLine();
				while (title.equals("")) { // 비어 있는지 확인
					System.out.println("▶ 제목이 비어있습니다. 다시 입력해주세요.\n");
					System.out.print("제목: ");
					title = sc.nextLine();
				}
				
				System.out.print("글쓴이: ");
				author = sc.nextLine();
				while (author.equals("")) { // 비어 있는지 확인
					System.out.println("▶ 글쓴이가 비어있습니다. 다시 입력해주세요.\n");
					System.out.print("글쓴이: ");
					author = sc.nextLine();
				}
				
				System.out.print("내용: ");
				content = sc.nextLine();
				while (content.equals("")) { // 비어 있는지 확인
					System.out.println("▶ 내용이 비어있습니다. 다시 입력해주세요.\n");
					System.out.print("내용: ");
					content = sc.nextLine();
				}
				
				// 날짜 배열 생성 ----------------------------------------------
				today = Calendar.getInstance();

				int[] todayTempArr = new int[6];
				todayTempArr[0] = today.get(Calendar.YEAR);
				todayTempArr[1] = today.get(Calendar.MONTH) + 1;
				todayTempArr[2] = today.get(Calendar.DATE);
				todayTempArr[3] = today.get(Calendar.HOUR_OF_DAY);
				todayTempArr[4] = today.get(Calendar.MINUTE);
				todayTempArr[5] = today.get(Calendar.SECOND);

				String[] todaySplitArr = new String[6];
				for (int i = 0; i < 6; i++) {
					if (todayTempArr[i] < 10) {
						todaySplitArr[i] = "0" + String.valueOf(todayTempArr[i]);
					} else {
						todaySplitArr[i] = String.valueOf(todayTempArr[i]);
					}
				}

				String time = todaySplitArr[0] + "/" + todaySplitArr[1] + "/" + todaySplitArr[2] + "  "
						+ todaySplitArr[3] + ":" + todaySplitArr[4] + ":" + todaySplitArr[5];

				for (int i = 0; i < posts.length; i++) {
					if (posts[i][0] == null) { // null 을 만났다는 건, 값을 넣을 수 있다는 말!! 
						posts[i][0] = String.valueOf(lastIdx + 1);
						posts[i][1] = title;
						posts[i][2] = content;
						posts[i][3] = author;

						postCount++;
						lastIdx = Integer.parseInt(posts[i][0]); // 마지막 글 번호 저장
						
						// 글 작성 시, 해당 글 번호에 현재 작성시간을 배열에 저장해줌
						cal[i][0] = String.valueOf(i + 1);
						cal[i][1] = time;
						break;
					}
				}

				break;
			}

			case "2": { // 게시글 조회 case
				// (2-1) 게시글이 존재하지 않는 경우
				if (postCount == 0) {
					System.out.println("\n▶ 현재 게시글이 존재하지 않습니다. \n게시글을 조회할 수 없습니다.\n\n");
					break;
				}

				System.out.print("게시물 번호: ");
				String readIdxStr = sc.nextLine();
				System.out.println();

				// 게시글 번호가 존재하는지 검사해야 함 -> 없으면, error

				int readIdx = Integer.parseInt(readIdxStr);

				for (String[] readContents : posts) {
					if (readContents[0] == null) {
						System.out.println("▶ 게시글 번호를 잘못 입력했거나 존재하지 않는 게시글 입니다.\n\n");
						break;
						// 어차피 posts 는 복사배열이여서, 순차적으로 글번호 저장됨
						// null 을 만났다는건 그 뒤로 더 이상 저장된 글 번호가 없음
					}

					int temp = Integer.parseInt(readContents[0]);

					// 조회할 글 번호에 해당되는 날짜 배열 갖고 오기
					String createDate = cal[Integer.parseInt(readContents[0])][1];

					if (temp == readIdx) { // 조회하려는 게시글이 존재하는 경우
						System.out.println("[글 보기]");

						System.out.printf("번호: %s \n", readContents[0]);
						System.out.printf("제목: %s \n", readContents[1]);
						System.out.printf("글쓴이: %s \n", readContents[3]);
						System.out.printf("내용: %s \n", readContents[2]);
						System.out.printf("작성일: %s \n", createDate);
						System.out.println();
						break;
					}
				}
				break;
			}
			case "3": { // 게시글 수정 case
				// (3-1) 게시글이 존재하지 않는 경우
				// 게시물 번호를 영어로 입력할 경우 NumberFormatException 에러 발생 ㅠ ㅠ
				// 따라서, 알파벳과 공백을 검증하는 while 문을 구현 진행
				if (postCount == 0) {
					System.out.println("\n▶ 현재 게시글이 존재하지 않습니다. 게시글을 수정할 수 없습니다.\n\n");
					break;
				}
				System.out.print("게시물 번호: ");
				String updateIdxStr = sc.nextLine();
				System.out.println();

				// updateIdxStr 이 영어인지 숫자인지 공백인지 검증해야함
				boolean val = false;

				while (!val) {
					boolean alpha = false;
					for (int i = 0; i < updateIdxStr.length(); i++) {
						int updateStr = updateIdxStr.charAt(i);
						if (updateStr >= 65 && updateStr <= 122) {
							alpha = true;
							break;
						}
					}

					// 알파벳인 경우
					if (alpha) {
						System.out.println("▶ 게시글 번호에 영어를 넣을 수 없습니다. 숫자만 입력해주세요.\n\n");
						System.out.print("게시물 번호: ");
						updateIdxStr = sc.nextLine();
						val = true;
					}

					// 공백인 경우
					if (updateIdxStr.equals(" ")) {
						System.out.println("\n▶ 글자를 최소 한 자 이상 작성해야 합니다. 다시 입력해주세요.  \n");
						updateIdxStr = sc.nextLine();
						val = true;
					}
				}

				// updateIdxStr 이 숫자인 경우
				int updateIdx = Integer.parseInt(updateIdxStr);

				for (int i = 0; i < posts.length; i++) {
					String[] updateContents = posts[i];

					if (updateContents[0] == null) {
						System.out.println("▶ 게시글 번호를 잘못 입력했거나 존재하지 않는 게시글 입니다.\n\n");
						System.out.print("게시물 번호: ");
						updateIdxStr = sc.nextLine();

						break;
					}

					int temp = Integer.parseInt(updateContents[0]);

					if (temp == updateIdx) { // 수정하려는 게시글이 존재하는 경우
						System.out.println("[글 수정]");

						System.out.print("제목: ");
						title = sc.nextLine();
						System.out.print("내용: ");
						content = sc.nextLine();

						// (3-2) 빈 문자를 입력 받은 경우
						if (title.length() == 0 || content.length() == 0) {
							System.out.println("\n▶ 글자를 최소 한 자 이상 작성해야 합니다. 다시 입력해주세요.  \n");
							break;
						}

						// 날짜 수정 -> 업데이트 날짜 생성
						updatedDate = Calendar.getInstance();

						int[] updatedTempArr = new int[6];
						updatedTempArr[0] = updatedDate.get(Calendar.YEAR);
						updatedTempArr[1] = updatedDate.get(Calendar.MONTH) + 1;
						updatedTempArr[2] = updatedDate.get(Calendar.DATE);
						updatedTempArr[3] = updatedDate.get(Calendar.HOUR_OF_DAY);
						updatedTempArr[4] = updatedDate.get(Calendar.MINUTE);
						updatedTempArr[5] = updatedDate.get(Calendar.SECOND);

						String[] updatedSplitArr = new String[6];
						for (int id = 0; id < 6; id++) {
							if (updatedTempArr[id] < 10) {
								updatedSplitArr[id] = "0" + String.valueOf(updatedTempArr[id]);
							} else {
								updatedSplitArr[id] = String.valueOf(updatedTempArr[id]);
							}
						}

						String time = updatedSplitArr[0] + "/" + updatedSplitArr[1] + "/" + updatedSplitArr[2] + "  "
								+ updatedSplitArr[3] + ":" + updatedSplitArr[4] + ":" + updatedSplitArr[5];

						updateContents[1] = title;
						updateContents[3] = content;
						cal[i][1] = time;

						break;
					}
				}
				break;
			}
			case "4": { // 게시글 삭제 case
				// (4-1) 게시글이 존재하지 않는 경우
				if (postCount == 0) {
					System.out.println("\n▶ 현재 게시글이 존재하지 않습니다. 게시글을 삭제할 수 없습니다.\n\n");
					break;
				}

				System.out.print("게시물 번호: ");
				String deleteIdxStr = sc.nextLine();
				System.out.println();

				// updateIdxStr 이 영어인지 숫자인지 공백인지 검증해야함
				boolean val = false;

				while (!val) {
					boolean alpha = false;
					for (int i = 0; i < deleteIdxStr.length(); i++) {
						int updateStr = deleteIdxStr.charAt(i);
						if (updateStr >= 65 && updateStr <= 122) {
							alpha = true;
							break;
						}
					}

					// 알파벳인 경우
					if (alpha) {
						System.out.println("▶ 게시글 번호에 영어를 넣을 수 없습니다. 숫자만 입력해주세요.\n\n");
						System.out.print("게시물 번호: ");
						deleteIdxStr = sc.nextLine();
						val = true;
					}

					// 공백인 경우
					if (deleteIdxStr.equals(" ")) {
						System.out.println("\n▶ 글자를 최소 한 자 이상 작성해야 합니다. 다시 입력해주세요.  \n");
						deleteIdxStr = sc.nextLine();
						val = true;
					}
				}

				String[][] boardsDeleteCopy = new String[100][4]; // 게시판 삭제 복사 배열
				String[][] calDeleteCopy = new String[100][2]; // 날짜 삭제 복사 배열

				for (int i = 0; i < posts.length; i++) {
					String[] deleteContents = posts[i];

					// (4-2) 존재하지 않는 게시글 번호를 입력한 경우
					if (deleteContents[0] == null) {
						System.out.println("▶ 게시글 번호를 잘못 입력했거나 존재하지 않는 게시글 입니다.\n\n");
						System.out.print("게시물 번호: ");
						deleteIdxStr = sc.nextLine();

						break;
					}

					if (deleteContents[0].equals(deleteIdxStr)) { // 삭제할 게시글이 존재하는 경우

						posts[i][0] = null;
						posts[i][1] = null;
						posts[i][2] = null;
						posts[i][3] = null;

						// 삭제한 게시글 날짜도 null 로 변경
						cal[i][0] = null;
						cal[i][1] = null;

						System.out.println("\n▶ 게시글이 삭제 되었습니다.   \n");

						postCount -= 1; // 총 게시글 수 하나 빼주기

						copyIdx = 0;
						int copyCnt = 0;
						for (int j = 1; j <= posts.length; j++) {
							if (posts[j - 1][0] == null) { // 0 (j - 1)째 인덱스가 null 인 경우 -> continue
								copyIdx++;
								continue;
							} else {
								if (postCount == (j - 1) && copyCnt == postCount) {
									break;
								}
								boardsDeleteCopy[copyCnt] = posts[copyIdx];
								calDeleteCopy[copyCnt] = cal[copyIdx];

								copyIdx++;
								lastIdx = Integer.parseInt(boardsDeleteCopy[copyCnt][0]); // 마지막 글 번호

								copyCnt++;
							}
						}

						System.arraycopy(boardsDeleteCopy, 0, posts, 0, posts.length);
						System.arraycopy(calDeleteCopy, 0, cal, 0, cal.length);
						break;
					}
				}
				break;
			}
			case "5": // 게시글 검색 case
				if (postCount == 0) {
					System.out.println("▶ 현재 게시글이 존재하지 않습니다. 게시글을 검색할 수 없습니다.\n");
					break;
				}
				System.out.print("대소문자를 구분하여 검색할 키워드를 입력하세요: ");
				String keyword = sc.nextLine();
				boolean found = false;

				// 일치하는 게시물 정보 출력 (대소문자 구분하여 검색)
				System.out.println("-----------------------------------------------------------------------");
				System.out.printf("%30s\n", "검색 결과"); // 칼럼 제목 출력
				System.out.println("-----------------------------------------------------------------------");
				System.out.printf("%-5s %-20s %-15s %10s\n", "번호", "제목", "글쓴이", "작성일"); // 칼럼 제목 출력
				System.out.println("-----------------------------------------------------------------------");

				for (int i = 0; i < postCount; i++) {
					if ((posts[i][1] != null && posts[i][1].contains(keyword))
							|| (posts[i][3] != null && posts[i][3].contains(keyword))) {

						System.out.printf("%-5d %-20s %-15s %10s\n", 
								Integer.parseInt(posts[i][0]), posts[i][1], posts[i][3], cal[i][1]);
						System.out.println("\n");

						found = true;
					}
				}
				if (!found) {
					System.out.println("▶ 일치하는 게시물을 찾을 수 없습니다.");
				}
				break;

			case "6": // 종료 case
				status = true;
				break;

			default:
				System.out.println("\n▶ 유효하지 않은 옵션입니다. 다시 입력해주세요. \n\n");
			}
		}
		System.out.println("프로그램 종료");
		
		sc.close();
	}

}