package addressBook;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class MainClassTch {
	public static void main(String[] args) throws Exception {
		/*
		 * column: 이름, 나이, 전화번호, 주소, 메모
		 * 
		 * 2차원 배열 활용 => rows=100 ==> list와 class로 개선가능
		 * 
		 * 데이터는 파일에서 불러오기
		 * 
		 * Menu 1. 추가 2. 삭제 3. 이름 검색 extends. 전화번호 / 동명이인도 모두 출력 4. 수정 5. 모든 데이터 출력 6.
		 * 데이터 (파일)저장 7. 종료
		 */

		Scanner sc = new Scanner(System.in);
		String[][] book = new String[100][5];

		int cnt = 0;

		System.out.println("주소록");
		System.out.println("==============================================================");

		// 파일 생성하기
		fileCreate();

		// 기존 데이터 불러오기
		load();

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
				cnt = insert(book,cnt);
				break;

			// 2. 삭제
			case 2:
				bookDelete(book);
				break;

			// 3. 이름 검색
			case 3:
				select(book);
				break;

			// 4. 수정
			case 4:
				bookRevise(book);
				break;

			// 5. 주소록 출력
			case 5:
				bookPrint(book);
				break;

			// 6. 데이터 저장
			case 6:
				fileWrite(book);
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
	static String[][] load() throws Exception {
		File file = new File("c:\\Temp\\addressBook.txt");
		
		BufferedReader br = new BufferedReader(new FileReader(file));
		
		String[][] book = new String[100][5];
		
		int cnt=0;
		String str="";
		
		while((str=br.readLine()) !=null) {
			String data[] = str.split("-");
			
			book[cnt][0]=data[0];
			book[cnt][1]=data[1];
			book[cnt][2]=data[2];
			book[cnt][3]=data[3];
			book[cnt][4]=data[4];
			
			cnt++;
		}
		
		br.close();
		
		return book;
	}

	// 1. 추가
	static int insert(String[][] book, int cnt) {
		Scanner sc = new Scanner(System.in);

		System.out.println("\n주소록 추가를 시작합니다.");
		System.out.print("이름: ");
		String name = sc.next();
		System.out.print("나이: ");
		int age = sc.nextInt();
		System.out.print("전화번호: ");
		String phone = sc.next();
		System.out.print("주소: ");
		String address = sc.next();
		System.out.print("메모: ");
		String memo = sc.next();

		// 데이터 배열 삽입
		book[cnt][0] = name;
		book[cnt][1] = age + "";
		book[cnt][2] = phone;
		book[cnt][3] = address;
		book[cnt][4] = memo;

		// 카운팅 증가
		cnt++;
		System.out.println("추가 완료");

		return cnt;
	}

	// 2. 삭제
	static void bookDelete(String[][] book) {
		Scanner sc = new Scanner(System.in);

		System.out.println("\n주소록 삭제를 시작합니다.");
		System.out.print("삭제할 이름 입력: ");
		String name = sc.next();

		int index = nameSearch(book, name); // 이름으로 검색

		if (index == -1) { // 삭제 실패
			System.out.printf("%s님의 기록을 찾을 수 없습니다.\n", name);

			return;

		} else {
			System.out.printf("%s님의 기록을 삭제합니다.\n", name);

			for (int i = 0; i < 5; i++) {
				book[index][i] = "";
			}

			System.out.printf("%s님의 기록이 삭제되었습니다.\n", name);
		}

	}

	// 5. 주소록 출력
	static void bookPrint(String[][] book) {
		System.out.println("\n주소록을 출력합니다.");
		System.out.println("이름\t 나이\t 전화번호\t 주소\t 메모");
		System.out.println("=====================================================");
		for (int i = 0; i < book.length; i++) {
			for (int j = 0; j < 5; j++) {
//				if(book[i][j]!=null && book[i][j].equals("")) {	//cnt를 안 받을 때
				System.out.printf("%s\t", book[i][j]);
			}
			System.out.println();
		}

	}

	// 3. 이름 검색
	static int nameSearch(String[][] book, String name) {
		Scanner sc = new Scanner(System.in);

		int index = -1; // 검색 결과 인덱스 번호 찾기

		for (int i = 0; i < book.length; i++) {
			if (name.equals(book[i][0])) {
				index = i;
				System.out.println("이름\t 나이\t 전화번호\t\t 주소\t 메모\t");
				System.out.println("=====================================================");

				System.out.println("=====================================================");
			}

		}

		return index;
	}

	static void select(String[][] book) {
		Scanner sc = new Scanner(System.in);

		System.out.print("검색하고 싶은 이름: ");
		String name = sc.next();

		String findMember[][] = searchAll(book, name);

		if (findMember == null) {
			System.out.println("정보를 찾을 수 없습니다.");
			return;
		}

		for (int i = 0; i < findMember.length; i++) {

		}
	}

	static String[][] searchAll(String[][] book, String name) {

		int cnt = 0;

		// 카운터
		for (int i = 0; i < book.length; i++) {
			if (book[i][0].equals(name)) {
				cnt++;
			}
		}

		if (cnt == 0) { // 검색 값을 찾지 못했을 때
			return null;
		}

		// 할당
		String findMember[][] = new String[cnt][5];
		int count = 0;

		// 데이터 저장
		for (int i = 0; i < book.length; i++) {
			if (book[i][0].equals(name)) {
				findMember[count] = book[i];
				count++;
			}
		}

		return findMember;
	}

	// 4. 수정
	static void bookRevise(String[][] book) {
		Scanner sc = new Scanner(System.in);

		System.out.println("\n수정 작업을 시작합니다.");
		System.out.print("수정할 이름 입력: ");
		String name = sc.next();

		int index = nameSearch(book, name);

		if (index == -1) {
			System.out.println("수정할 이름을 찾지 못했습니다.");
			return;
		}

		// 수정
		System.out.printf("%s님의 정보 수정을 시작합니다\n", name);
		System.out.print("이름: ");
		book[index][0] = sc.next();
		System.out.print("나이: ");
		book[index][1] = sc.next();
		System.out.print("전화번호: ");
		book[index][2] = sc.next();
		System.out.print("주소: ");
		book[index][3] = sc.next();
		System.out.print("메모: ");
		book[index][4] = sc.next();
		System.out.println("수정 완료");
	}

	// 6. 데이터 저장
	static void fileWrite(String[][] book) throws Exception {

		int count = 0;
		for (int i = 0; i < book.length; i++) {
			if (book[i] != null && book[i][0].equals("")) {
				count++;
			}
		}

		String findMember[] = new String[count];
		int cou = 0;

		// 데이터 저장
		for (int i = 0; i < book.length; i++) {
			if (book[i][0] != null && !book[i][0].equals("")) {
				findMember[cou] = book[i][0] + "-" + book[i][1] + "-" + book[i][2] + "-" + book[i][3] + "-" + book[i][4];
				cou++;
			}
		}
		File file = new File("c:\\Temp\\addressBook.txt");

		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(file)));

		for (int i = 0; i < findMember.length; i++) {
			pw.println(findMember[i]);
		}
		pw.close();

		System.out.println("데이터 저장 성공");
	}
}
