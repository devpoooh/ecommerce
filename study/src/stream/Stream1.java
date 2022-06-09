package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Stream1 {
	public static void main(String[] args) {
		//스트림 생성
		
		//1. 컬렉션
		List<String> list = Arrays.asList("a","b","c");
		Stream<String> stream = list.stream();
		
		//2. 배열
		String[] array = new String[] {"a","b","c"};
		Stream<String> stream1 = Arrays.stream(array);
	}
}
