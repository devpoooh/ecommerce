package stream;

import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("a2","a1","b1","c1","c2");
		
		list.stream()						//생성하기
			.filter(s -> s.startsWith("c"))	//가공하기
			.map(String::toUpperCase)		//가공하기
			.sorted()						//가공하기
			.count();						//결과만들기
		
		System.out.println(list);
	}
}
