package smaple08;

import java.util.Iterator;

public class MainClass {
	public static void main(String[] args) {
		//break
		for(int i=0;i<100;i++) {
			System.out.println("i = "+i);
			if(i==49) {
				break; //50번만 반복
			}
		}
		
		char array[] = {'a','b','c','d','e'};
		for(int i=0;i<array.length;i++) {
			System.out.println("array["+i+"] = "+array[i]);
			if(array[i] == 'c') { //c까지만 수행 후 반복문을 빠져나온다
				break;
			}
		}
		
		//2중 포문 break
		for (int i = 0; i < 10; i++) {
			System.out.println("i = "+i);
			for (int j = 0; j < 6; j++) {
				System.out.println("  j = "+j);
				if(i==3 && j==2) {
					break; //완전 탈출이 아닌 내부 포문에서만 탈출
				}
			}
		}
		
		//2중 포문에서 완전 탈출 방법1
		boolean b;
		for (int i = 0; i < 10; i++) {
			System.out.println("i = "+i);
			for (int j = 0; j < 6; j++) {
				System.out.println("  j = "+j);
				if(i==3 && j==2) {
					b=true;
				}
				if(b=true) {
					break;
				}
			}
			if(b=true) {
				break;
			}
		}
		
		//방법2. break 설정
		out: for (int i = 0; i < 10; i++) {
			System.out.println("i = "+i);
			for (int j = 0; j < 6; j++) {
				System.out.println("  j = "+j);
				if(i==3 && j==2) {
					break out; //out을 찾아 탈출한다.
				}
			}
		}
		
		//continue - for, while과 자주 사용
		for(int i=0;i<10;i++) {
			System.out.println("for i = "+i);
			
			if(i>5) {
				continue; //조건이 만족했을 때 밑 작업을 skip
			}
			
			System.out.println("for end process");
		}
	}
}
