package stream;

import java.util.Arrays;
import java.util.List;

public class Lambda {

	public String add(String s) {
		return s + "님";
	}

	public static void main(String[] args) {
		List<String> names = List.of("1111", "22", "33", "4444");
	    names.stream()
	        .filter(str -> {
	            System.out.println("first filter = "+str);
	            return str.length() > 3;
	        })
	        .filter(str -> {
	            System.out.println("second filter = "+str);
	            return str.contains("44");
	        })
	        .forEach(str -> {
	        	System.out.println("forEach = "+str+"\n");
	        });
	}
}
