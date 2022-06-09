package main;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class MainClass {
	public static void main(String[] args) {
		HashMap<Integer,String> hMap1 = new HashMap<>();
		//인터페이스
		Map<Integer,String> hMap = new HashMap<>(); 
		
		//CRUD
		//1. 추가
		hMap.put(1001, "Tigers");
		hMap.put(1002, "Lions");
		hMap.put(1003, "twins");
		
		//값 꺼내기
		String val = hMap.get(1002); //키값으로 값 꺼내기
		System.out.println(val);
		
		//map의 크기
		int size = hMap.size();
		System.out.println(size);
		
		//출력
		Iterator<Integer> it = hMap.keySet().iterator();
		while(it.hasNext()) {
			Integer key=it.next();
			String value=hMap.get(key);
			System.out.println(key+" : "+value);
		}
		
		hMap.put(1000, "giants");
		
		//2. 삭제
		String delValue = hMap.remove(1000);
		System.out.println("삭제데이터: "+delValue);//giants
		
		//3. 검색
		boolean b= hMap.containsKey(1002); //키값이 있는지
		if(b) {
			String s = hMap.get(1002);
			System.out.println(s); //Lions
		}
		
		//4. 수정
		hMap.replace(1001, "Eagles");
		it = hMap.keySet().iterator();
		while(it.hasNext()) {
			Integer key=it.next();
			String value=hMap.get(key);
			System.out.println(key+" : "+value);
		}
		
		//work
		//hashMap key:String
		//		  value: 아무거나
		
//		Map<String, Object> map = new HashMap<String, Object>();
		
		
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("apple", "사과");
		map.put("watermelon", "수박");
		map.put("grape", "포도");
		map.put("orange", "오렌지");
		map.put("pear", "배");
		
		Iterator<String> it1 = map.keySet().iterator();
		while(it1.hasNext()) {
			String k = it1.next();
			String v = map.get(k);
			System.out.println("key: "+k+" value: "+v);
		}
		
		//treeMap
		TreeMap<String, String> tMap = new TreeMap<String, String>(map); //해시맵의 전체를 넘겨줄 수 있다.
		
		//오름: default
		Iterator<String> itKey = tMap.keySet().iterator(); //해시맵에서는 정렬이 안되지만 트리맵은 정렬이 된다.
		System.out.println("트리맵(오름)");
		while(itKey.hasNext()) {
			String k = itKey.next();
			String v = map.get(k);
			System.out.println("key: "+k+" value: "+v);
		}
		
		//내림
		Iterator<String> itKey2 = tMap.descendingKeySet().iterator(); //descendingKeySet(): 내림차순
		System.out.println("내림");
		while(itKey2.hasNext()) {
			String k = itKey2.next();
			String v = map.get(k);
			System.out.println("key: "+k+" value: "+v);
		}
	}
}
