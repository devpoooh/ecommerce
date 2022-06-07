package addressBook;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) throws Exception {
		/*
		 * column: 이름, 나이, 전화번호, 주소, 메모
		 * 
		 * 2차원 배열 활용 => rows=100
		 * 
		 * 데이터는 파일에서 불러오기
		 * 
		 * Menu 1. 추가 2. 삭제 3. 이름 검색 extends. 전화번호 / 동명이인도 모두 출력 4. 수정 5. 모든 데이터 출력 6.
		 * 데이터 (파일)저장 7. 종료
		 */

		Scanner sc = new Scanner(System.in);
		String[][] book = new String[100][5];

		System.out.println("주소록");
		System.out.println("==============================================================");

		// 파일 생성하기
		fileCreate();

		// 기존 데이터 불러오기
		int i = 0;
		i = fileImport(i, book);

		while (true) {
			System.out.println("\n\t\t\tMenu");
			System.out.println("==============================================================");
			System.out.println("1. 추가\t 2. 삭제\t 3. 이름 검색\t 4. 수정\t " + "5. 주소록 출력\t 6. 데이터 저장\t 7. 종료");

			// 입력
			System.out.print("입력: ");
			int cho = sc.nextInt();

			switch (cho) {
			// 1. 추가
			case 1:
				i = bookAdd(i, book);
				break;

			// 2. 삭제
			case 2:
				i = bookDelete(i, book);
				break;

			// 3. 이름 검색
			case 3:
				bookSearch(i, book);
				break;

			// 4. 수정
			case 4:
				bookRevise(i, book);
				break;

			// 5. 주소록 출력
			case 5:
				bookPrint(i, book);
				break;

			// 6. 데이터 저장
			case 6:
				fileWrite(i, book);
				break;

			// 7. 종료
			case 7:
				System.out.println("\n프로그램을 종료합니다.");
				System.exit(0);
			}
		}

	}

	// 파일 생성
	static void fileCreate() throws Exception {
		File bookFile = new File("c:\\Temp\\addressBook.txt");
		if (bookFile.createNewFile()) {
			System.out.println("주소록 생성 성공");
		} else {
			System.out.println("주소록이 이미 존재합니다.");
		}
	}

	// 기존 데이터 가져오기
	static int fileImport(int idx, String[][] book) throws Exception {
		File file = new File("c:\\Temp\\addressBook.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));

		String str = "";
		while ((str = br.readLine()) != null) {
//			System.out.println(str); //txt의 한 줄씩 출력해준다.
			String[] strArr = str.split(" ");

			for (int j = 0; j < 5; j++) {
				book[idx][j] = strArr[j];
			}
			idx++;

		}

		br.close();

		return idx;
	}

	// 1. 주소록 추가
	static int bookAdd(int idx, String[][] book) {
		Scanner sc = new Scanner(System.in);

		System.out.println("\n주소록 추가를 시작합니다.");
		System.out.print("이름: ");
		book[idx][0] = sc.next();
		System.out.print("나이: ");
		book[idx][1] = sc.next();
		System.out.print("전화번호: ");
		book[idx][2] = sc.next();
		System.out.print("주소: ");
		book[idx][3] = sc.next();
		System.out.print("메모: ");
		book[idx][4] = sc.next();
		System.out.println("추가 완료");

		idx++;

		return idx;
	}

	// 2. 삭제
	static int bookDelete(int idx, String[][] book) {
		Scanner sc = new Scanner(System.in);
		boolean success = false; //삭제 성공 시 true

		System.out.println("\n주소록 삭제를 시작합니다.");
		System.out.print("삭제할 이름 입력: ");
		String name = sc.next();

		for (int i = 0; i < idx; i++) {
			if (name.equals(book[i][0])) {
				System.out.printf("%s님의 기록을 삭제합니다.\n", name);

				for (int j = 0; j < 5; j++) {
					book[i][j] = book[i + 1][j]; // 다음 배열 요소로 덮기
				}

				System.out.printf("%s님의 기록이 삭제되었습니다.\n", name);
				success=true;
				
				break;
			} 
			
		}
		
		if(!success) { //삭제 실패				
			System.out.printf("%s님의 기록을 찾을 수 없습니다.\n", name);
		}
		
		idx--;

		return idx;
	}

	// 5. 주소록 출력
	static void bookPrint(int idx, String[][] book) {
		System.out.println("\n주소록을 출력합니다.");
		System.out.println("이름\t 나이\t 전화번호\t 주소\t 메모\t");
		System.out.println("=====================================================");
		for (int j = 0; j < idx; j++) {
			for (int k = 0; k < 5; k++) {
				System.out.printf("%s\t", book[j][k]);
			}
			System.out.println();
		}

	}

	// 3. 이름 검색
	static void bookSearch(int idx, String[][] book) {
		Scanner sc = new Scanner(System.in);

		int cnt = 0; // 출력 인원 카운트
		System.out.println("\n검색할 이름을 입력해주십시오");
		System.out.print("입력: ");
		String name = sc.next();

		for (int i = 0; i < idx; i++) {
			if (name.equals(book[i][0])) {
				cnt++;
				System.out.println("이름\t 나이\t 전화번호\t\t 주소\t 메모\t");
				System.out.println("=====================================================");
				System.out.printf("%s\t %s\t %s\t %s\t %s\n", book[i][0], book[i][1], book[i][2], book[i][3],
						book[i][4]);
				System.out.println("=====================================================");
				System.out.printf("총 %d명\n", cnt);
			}

		}

		if (cnt == 0) {
			System.out.println("검색 결과 없습니다.");
		}
	}

	// 4. 수정
	static void bookRevise(int idx, String[][] book) {
		Scanner sc = new Scanner(System.in);

		System.out.println("\n수정 작업을 시작합니다.");
		System.out.print("수정할 이름 입력: ");
		String name = sc.next();
		boolean search = false; // 수정할 이름 찾으면 true

		for (int i = 0; i < idx; i++) {
			// 동명이인?처리?
			if (name.equals(book[i][0])) {
				// 수정
				System.out.printf("%s님의 정보 수정을 시작합니다\n", name);
				System.out.print("이름: ");
				book[i][0] = sc.next();
				System.out.print("나이: ");
				book[i][1] = sc.next();
				System.out.print("전화번호: ");
				book[i][2] = sc.next();
				System.out.print("주소: ");
				book[i][3] = sc.next();
				System.out.print("메모: ");
				book[i][4] = sc.next();
				System.out.println("수정 완료");

				search = true;
				break;
			}

		}

		if (!search) { // 수정할 이름을 못찾으면
			System.out.println("수정할 이름을 찾지 못했습니다.");
		}
	}

	// 6. 데이터 저장
	static void fileWrite(int idx, String[][] book) throws Exception {
		File file = new File("c:\\Temp\\addressBook.txt");

		FileWriter fWriter = new FileWriter(file);
		for (int i = 0; i < idx; i++) {
			for (int j = 0; j < 5; j++) {
				fWriter.write(book[i][j] + " ");
			}
			fWriter.write("\n");
		}
		fWriter.close();

		System.out.println("데이터 저장 성공");
	}
}
