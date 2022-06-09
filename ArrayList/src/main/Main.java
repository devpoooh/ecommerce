package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<MyData> objlist = new ArrayList<MyData>();

		// 추가 5개
		objlist.add(new MyData(1,"kim"));
		objlist.add(new MyData(2,"kim2"));
		objlist.add(new MyData(3,"kim3"));
		objlist.add(new MyData(4,"kim4"));
		objlist.add(new MyData(5,"kim"));
		
		//출력
		for(MyData d:objlist) {
			System.out.println(d.toString());
		}
		
		// 원하는 위치에 추가
		objlist.add(3,new MyData(6,"new"));
		
		// 검색 -> 이름으로
		String name = "kim";
		
		List<MyData> findList = new ArrayList<>();
		
		for (int i = 0; i < objlist.size(); i++) {
			MyData obj = objlist.get(i);
			
			if(name.equals(obj.getName())) {
				System.out.println(obj.toString());
				findList.add(obj);
			}
		}
		
		System.out.println("find");
		for(MyData d:findList) {
			System.out.println(d.toString());
		}
		
		
		// 수정
		
		
		// 삭제
		
	}
}
