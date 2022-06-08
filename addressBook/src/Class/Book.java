package Class;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Book {
	String name;
	int age;
	String phone;
	String address;
	String memo;
	
	//init
	public void init() {
		
	}
	
	//추가
	public void bookInsert(Book[] book) {
		Scanner sc = new Scanner(System.in);

		int idx = book.length;
		System.out.println("\n주소록 추가를 시작합니다.");
		System.out.print("이름: ");
		book[idx].name = sc.next();
		System.out.print("나이: ");
		book[idx].age = sc.nextInt();
		System.out.print("전화번호: ");
		book[idx].phone = sc.next();
		System.out.print("주소: ");
		book[idx].address = sc.next();
		System.out.print("메모: ");
		book[idx].memo = sc.next();
		System.out.println("추가 완료");
	}
	
	//삭제
	public void bookDelete(Book[] book) {
		Scanner sc = new Scanner(System.in);
		boolean success = false; //삭제 성공 시 true
		int idx = book.length;

		System.out.println("\n주소록 삭제를 시작합니다.");
		System.out.print("삭제할 이름 입력: ");
		String name = sc.next();

		for (int i = 0; i < idx; i++) {
			if (name.equals(book[i].name)) {
				System.out.printf("%s님의 기록을 삭제합니다.\n", name);

				book[i].name = book[i + 1].name;
				book[i].age = book[i + 1].age;
				book[i].phone = book[i + 1].phone;
				book[i].address = book[i + 1].address;
				book[i].memo = book[i + 1].memo;

				System.out.printf("%s님의 기록이 삭제되었습니다.\n", name);
				success=true;
				
				break;
			} 
			
		}
		
		if(!success) { //삭제 실패				
			System.out.printf("%s님의 기록을 찾을 수 없습니다.\n", name);
		}
	}
	
	//검색
	public void nameSearch(Book[] book) {
		Scanner sc = new Scanner(System.in);
		int idx = book.length;
		
		int cnt = 0; // 출력 인원 카운트
		System.out.println("\n검색할 이름을 입력해주십시오");
		System.out.print("입력: ");
		String name = sc.next();

		for (int i = 0; i < idx; i++) {
			if (name.equals(book[i].name)) {
				cnt++;
				System.out.println("이름\t 나이\t 전화번호\t\t 주소\t 메모\t");
				System.out.println("=====================================================");
				System.out.printf("%s\t %s\t %s\t %s\t %s\n", book[i].name, book[i].age, book[i].phone, book[i].address,
						book[i].memo);
				System.out.println("=====================================================");
				System.out.printf("총 %d명\n", cnt);
			}

		}

		if (cnt == 0) {
			System.out.println("검색 결과 없습니다.");
		}
	}
	
	//수정
	public void bookUpdate(Book[] book) {
		Scanner sc = new Scanner(System.in);
		int idx = book.length;

		System.out.println("\n수정 작업을 시작합니다.");
		System.out.print("수정할 이름 입력: ");
		String name = sc.next();
		boolean search = false; // 수정할 이름 찾으면 true

		for (int i = 0; i < idx; i++) {
			// 동명이인?처리?
			if (name.equals(book[i].name)) {
				// 수정
				System.out.printf("%s님의 정보 수정을 시작합니다\n", name);
				System.out.print("이름: ");
				book[i].name = sc.next();
				System.out.print("나이: ");
				book[i].age = sc.nextInt();
				System.out.print("전화번호: ");
				book[i].phone = sc.next();
				System.out.print("주소: ");
				book[i].address = sc.next();
				System.out.print("메모: ");
				book[i].memo = sc.next();
				System.out.println("수정 완료");

				search = true;
				break;
			}

		}

		if (!search) { // 수정할 이름을 못찾으면
			System.out.println("수정할 이름을 찾지 못했습니다.");
		}
	}
	
	//조회
	public void bookSelect() {
		
	}
	
	//저장
	public void bookSave() {
		
	}
	
	//파일 생성
	public void newFile() throws IOException {
		File bookFile = new File("c:\\Temp\\addressBook.txt");
		
		if (bookFile.createNewFile()) {
			System.out.println("주소록 생성 성공");
		} else {
			System.out.println("주소록이 이미 존재합니다.");
		}
	}
	
	//기존 데이터 불러오기
	public void basicFile(Book[] book) throws Exception {
		File file = new File("c:\\Temp\\addressBook.txt");
		
		BufferedReader br = new BufferedReader(new FileReader(file));

		String str = "";
		int idx=0;
		while ((str = br.readLine()) != null) {
//			System.out.println(str); //txt의 한 줄씩 출력해준다.
			String[] strArr = str.split(" ");

			book[idx].name = strArr[0];
			book[idx].age = Integer.parseInt(strArr[1]);
			book[idx].phone = strArr[2];
			book[idx].address = strArr[3];
			book[idx].memo = strArr[4];
			idx++;
		}

		br.close();
	}
}

