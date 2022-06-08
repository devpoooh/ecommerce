package main;

import java.util.Scanner;

public class Sorting {
	
	//정렬할 숫자 변수
	int number[] = null;
	boolean updown; //오름/내림
	
	
	//처리
	//1. 초기화
	public void init() {
		updown = true;
	}
	
	//2. 입력
	public void input() {
		Scanner sc = new Scanner(System.in);
		int count;
		
		//총 수
		System.out.print("정렬할 개수 = ");
		count = sc.nextInt();
		
		number = new int[count];
		
		//숫자들
		
		//오름/내림
		
	}
	
	
	//3. 정렬
	public void sorting() {
		
	}
	
	//4. 결과출력
	public void result() {
		
	}
	
	public void checkMethod(String str) {
		boolean b = true;
		
		for (int i = 0; i < str.length(); i++) {
			int asc = (int)str.charAt(i);
			if(asc<48 || asc>57) {
				
			}
			
		}
	}
	
	public void swap(int i, int j) {
		int temp=number[i];
		number[i]=number[j];
		number[j]=temp;
	}
}
