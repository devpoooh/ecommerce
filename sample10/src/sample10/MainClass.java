package sample10;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		// function: 함수

		func();
		func(123);

		int n = 1;
		char c = 'A';
		int array[] = { 1, 2, 3 };
		func(n, c, array);

		System.out.println("n = " + n);
		System.out.println("array[1] = " + array[1]); // address의 경우 값이 변경된다.

		// 문자열 -> 모두 숫자로 되어있는지?
		// -> 정수,소수
		// boolean isNumber
		// String isDouble

		boolean b = isNumber("123a");
		System.out.println(b);

		// 문자열에 소문자가 포함되어 있는지
		// 두 수를 나눈 몫과 나머지를 구하는 함수
		int num1=9, num2=2;
		int[] tag = new int[1];
		int result = moxNa(num1, num2, tag);
	}
	
	static boolean isSmall(String str) {
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			
			if(c>='a' && c<='z') { //소문자 포함
				return true;
			}
		}
		
		return false; //소문자 없음
	}
	
	static int moxNa(int num1, int num2, int[] t) {
		int mox = num1/num2;
		t[0] = num1%num2;
		
		return mox;
	}

	static boolean isNumber(String str) {
		boolean b = true;

		for (int i = 0; i < str.length(); i++) {
			int n = (int) str.charAt(i);

			if (n < 48 || n > 57) {
				b = false;
				break;
			}
		}

		return b;
	}

	static String isDouble(String snum) {
		String msg = "정수";

		for (int i = 0; i < snum.length(); i++) {
			char c = snum.charAt(i);

			if (c == '.') {
				msg = "소수";
				break;
			}
		}

		return msg;
	}

	static void func() {
		System.out.println("func() 호출");
	}

	static void func(int i) { // over load
		System.out.println("func(int i) i = " + i);
	}

	// value의 할당, address의 할당
	static void func(int i, char c, int[] arr) {
		System.out.println("func(int i, char c, int[] ar) i = " + i);

		i = 2;
		arr[1] = 22;
	}

}
