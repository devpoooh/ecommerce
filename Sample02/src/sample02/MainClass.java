package sample02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) throws Exception{
		// input(console)
		Scanner sc = new Scanner(System.in);

		// boolean
		boolean b;
		System.out.print("b = ");
		b = sc.nextBoolean();
		System.out.println("input b = " + b);

		// Integer
		int num;
		System.out.print("num = ");
		num = sc.nextInt();
		System.out.println("input num = " + num);

		// double
		double d;
		System.out.print("d = ");
		d = sc.nextDouble();
		System.out.println("input d ="+d);

		// String
		String str;
		System.out.print("str = ");
		str=sc.next();	//스페이스바를 먹음
		System.out.println("input str = "+str);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //버퍼 입력
		System.out.print("str = ");
		String str1 = br.readLine();	//스페이스바 사용 가능(문장사용가능)
		System.out.println("input str1 = " + str1);
	}
}
