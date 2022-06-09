package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Function {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("a1", "a2", "b1", "c2", "c1");

		Stream<String> stream = list.stream();
		stream
		.filter(x -> {
			System.out.println(x);
			return x.contains("a");
		})
		.forEach(s -> System.out.println(s));

		Stream<String> stream1 = list.stream().map(x -> x.toUpperCase());

	}
}
