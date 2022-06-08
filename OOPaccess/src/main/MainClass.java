package main;

import dto.MemberDTO;

public class MainClass {
	public static void main(String[] args) {
		Human human = new Human();
		
		MemberDTO arr[] = new MemberDTO[3];
		
		arr[0] = new MemberDTO();
		arr[0].setId("AAA");
		
		System.out.println(arr[0].getId());
		
	}
}
