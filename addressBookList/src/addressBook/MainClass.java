package addressBook;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import cls.Human;

public class MainClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * 주소록
		 * 
		 * column: 이름, 나이, 전화번호, 주소, 메모
		 * 
		 * 2차원배열: row = 100" -> list & class
		 * 
		 * 데이터 파일에서 불러오기 -> 2차원배열
		 * 
		 * Menu 1. 추가 -> 각각 함수로 정의 2. 삭제 3. 검색 이름, (전화번호) 4. 수정 5. 모든 데이터 출력 6. 데이터 파일저장
		 * 7. 종료
		 */

		// String human[][] = new String[100][5];
		/*
		 * String human[][] = { { "홍길동", "24", "1234567", "서울시", "친구" }, { "성춘향", "16",
		 * "2345678", "남원시", "동생" }, { "홍두께", "22", "3456789", "전주시", "동문" }, { "홍길동",
		 * "27", "5678901", "판교", "상사" }, };
		 */

		// TODO:main
		List<Human> list = new ArrayList<Human>();
		// load하기
		list = load("addressBook");

		int humanCount = 0;
		for (Human h : list) {
			System.out.println(h.toString());
		}

		while (true) {
			System.out.println("<< menu >>");
			System.out.println("1. 추가");
			System.out.println("2. 삭제");
			System.out.println("3. 검색");
			System.out.println("4. 수정");
			System.out.println("5. 출력");
			System.out.println("6. 저장");
			System.out.println("7. 종료");

			System.out.print("메뉴번호를 입력해 주십시오 >> ");
			int number = sc.nextInt();

			switch (number) {
			case 1:
				insert(list);
				break;
			case 2:
				delete(list);
				break;
			case 3:
				select(list);
				break;
			case 4:
				update(list);
				break;
			case 5:
				print(list);
				break;
			case 6:
				save(list, "addressBook");
				break;
			case 7:
				System.exit(0);
				break;
			}
		}

	}

	static List<Human> load(String filename) {
		File file = new File("c:\\Temp\\" + filename + ".txt");
		List<Human> list = new ArrayList<Human>();

		try {
			BufferedReader br = new BufferedReader(new FileReader(file));

			String str = "";
			int count = 0;

			while ((str = br.readLine()) != null) {

				String data[] = str.split(" ");

				Human h = new Human(data[0], Integer.parseInt(data[1]), data[2], data[3], data[4]);
				list.add(h);

				count++; // ?..
			}
			br.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return list;
	}
	// CRUD - Create Read Update Delete
	// DAO - Data Access Object

	static void insert(List<Human> list) {
		Scanner sc = new Scanner(System.in);

		System.out.print("이름 = ");
		String name = sc.next();

		System.out.print("나이 = ");
		int age = sc.nextInt();

		System.out.print("전화번호 = ");
		String phone = sc.next();

		System.out.print("주소 = ");
		String address = sc.next();

		System.out.print("메모 = ");
		String memo = sc.next();

		Human h = new Human(name, age, phone, address, memo);
		list.add(h);
	}

	static void delete(List<Human> list) {
		Scanner sc = new Scanner(System.in);

		System.out.print("삭제하고 싶은 이름 = ");
		String name = sc.next();
		int index = -1;

		for (int i = 0; i < list.size(); i++) {
			Human obj = list.get(i);

			if (name.equals(obj.getName())) {
				list.remove(i);
				index++;
			}
		}

		if (index == -1) {
			System.out.println("정보를 찾을 수 없습니다");
			return;
		}

		System.out.println("정보를 삭제하였습니다");
	}

	static void select(List<Human> list) {
		Scanner sc = new Scanner(System.in);

		System.out.print("검색하고 싶은 이름 = ");
		String name = sc.next();

		// 검색한 리스트
		List<Human> findList = searchAll(list,name);

		// 검색결과
		for (Human h : findList) {
			System.out.println(h.toString());
		}
	}

	static void update(List<Human> list) {
		Scanner sc = new Scanner(System.in);

		System.out.print("수정하고 싶은 이름 = ");
		String name = sc.next();

		int index = search(list, name);

		if (index == -1) {
			System.out.println("정보를 찾을 수 없습니다");
			return;
		}

		System.out.println("수정할 전화번호 = ");
		String phone = sc.next();
		Human obj = list.get(index);

		obj.setPhone(phone);

		list.set(index, obj);
		System.out.println("정상적으로 수정되었습니다");

	}

	static int search(List<Human> list, String name) {
		int index = -1;
		for (int i = 0; i < list.size(); i++) {
			Human obj = list.get(i);
			if (obj.getName().equals(name)) {
				index = i;
				break;
			}
		}
		return index;
	}

	static List<Human> searchAll(List<Human> list, String name) {

		int count = 0; // 카운터
		for (int i = 0; i < list.size(); i++) {
			Human obj = list.get(i);
			if (obj.getName() != null && obj.getName().equals(name)) {
				count++;
			}
		}

		if (count == 0) {
			return null;
		}

		// 할당
		List<Human> findList = new ArrayList<Human>(); 
		int cou = 0;

		// 데이터저장
		for (int i = 0; i < list.size(); i++) {
			Human obj = list.get(i);
			if (obj.getName() != null && obj.getName().equals(name)) {
				findList.add(obj);
				cou++;
			}
		}

		return findList;

	}

	static void print(List<Human> list) {
		/*
		 * for (int i = 0; i < human.length; i++) { for (int j = 0; j < human[i].length;
		 * j++) { if(human[i][j] != null && !human[i][j].equals("")) {
		 * System.out.print(human[i][j] + " "); } } System.out.println(); }
		 */

		for (int i = 0; i < list.size(); i++) {
			Human obj = list.get(i);
			if (obj.getName() != null && !obj.getName().equals("")) {
				System.out.println(obj.toString());
			}
		}
	}

	static void save(List<Human> list, String filename) {
		// TODO:save(String[][], String)

		int count = 0;
		for (int i = 0; i < list.size(); i++) {
			Human obj = list.get(i);
			if (obj.getName() != null && !obj.getName().equals("")) {
				count++;
			}
		}

		String findMember[] = new String[count];
		int cou = 0;

		// 데이터저장
		for (int i = 0; i < list.size(); i++) {
			Human obj = list.get(i);
			if (obj.getName() != null && !obj.getName().equals("")) {
				findMember[cou] = obj.getName() + " " + obj.getAge() + " " + obj.getPhone() + " " + obj.getAddress()
						+ " " + obj.getMemo(); // 홍길동-24-123-서울시-친구
				cou++;
			}
		}

		File file = new File("c:\\Temp\\" + filename + ".txt");

		try {
			PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(file)));

			for (int i = 0; i < findMember.length; i++) {
				pw.println(findMember[i]);
			}

			pw.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
