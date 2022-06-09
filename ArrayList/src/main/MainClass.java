package main;

import java.util.ArrayList;
import java.util.List;

public class MainClass {
	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<>();
		List<Integer> list = new ArrayList<>(); //동일
		
		//1. 추가
		Integer in = new Integer(111);
		list.add(in); //111추가
		list.add(222);
		list.add(new Integer(333));
		
		int len = list.size(); //list 크기
		
		for (int i = 0; i < len; i++) {
			System.out.println(list.get(i)); //index로 값 확인
		}
		
		for(Integer i:list) {
			System.out.println(i); //111 222 333
		}
		
		//원하는 위치에 추가하기
		list.add(1,200);
		for(Integer i:list) {
			System.out.println(i); //111 200 222 333
		}
		
		//2. 삭제
		list.remove(2);//2번지 삭제
		for(Integer i:list) {
			System.out.println(i); //111 200 333
		}
		
		//3. 검색
		int index = list.indexOf(333); //333의 index 찾기
		
		//4. 수정
		list.set(2, 300); //인덱스 2번을 300으로 변경
		for(Integer i:list) {
			System.out.println(i); //111 200 300
		}
		
		
	}
}
