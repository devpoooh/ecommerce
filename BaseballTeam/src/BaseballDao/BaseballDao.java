package BaseballDao;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import fileio.FileProc;
import human.Human;

public class BaseballDao {

	Scanner sc = new Scanner(System.in);
	public static int id=1;
	
	List<Human> list = new ArrayList<Human>();
	
	//시작하면 파일만들기
	public BaseballDao(){
		FileProc.createFile();
	}
	
	//추가 삭제 검색 수정
	public void insert() {
		System.out.print("이름: ");
		String name = sc.next();
		System.out.print("나이: ");
		int age = sc.nextInt();
		System.out.print("키: ");
		double height = sc.nextDouble();
		System.out.print("포지션: pitcher(1) batter(2) ");
		int position = sc.nextInt();
		
		Human human = new Human(id++, name, age, height, position);
		list.add(human);
	}

	public void delete() {
		int findIdx = select();
		
		if(findIdx==-1) {
			System.out.println("삭제할 데이터가 없습니다.");
			return;
		}
		
		list.remove(findIdx);
		System.out.println("삭제가 완료되었습니다.");
	}

	public int select() {
		int idx = -1;

		System.out.print("검색할 이름: ");
		String name = sc.next();
		
		for(Human h:list) {
			if(name.equals(h.getName())) {
				idx = h.getId()-1;
				return idx;
			}
		}
		
		return idx;
		
	}

	public void update() {
		int findIdx = select();
		
		if(findIdx!=-1) {
			System.out.println("수정할 데이터가 없습니다.");
			return;
		}
		
		System.out.print("이름: ");
		String name = sc.next();
		System.out.print("나이: ");
		int age = sc.nextInt();
		System.out.print("키: ");
		double height = sc.nextDouble();
		System.out.print("포지션: pitcher(1) batter(2) ");
		int position = sc.nextInt();
		
		System.out.println("수정 완료");
	}

	public void dataPrint() {
		if(list.size()==0) {
			System.out.println("저장된 데이터가 없습니다.");
			return;
		}
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).toString());
		}
	}
	
	public void writeFile() throws IOException {
		FileProc.saveFile(list);
	}
	
}
