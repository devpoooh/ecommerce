package sample05;

import java.util.Iterator;

public class MainClass {
	public static void main(String[] args) {
		// int[] Array = new int[5];
		// int []Array = new int[5];
		int Array[] = new int[5];

		System.out.println(Array); // 주소값출력
		System.out.println(Array[0]); // 초기값은 0
		System.out.println(Array.length);// 배열의 길이

		// 배열 초기화
		int Array1[] = { 2, 3, 5, 7, 9 };

		for (int i = 0; i < 5; i++) {
			System.out.println(Array1[i]);
		}

		// 배열 복사
		int Array2[] = Array1;
		for (int i = 0; i < Array2.length; i++) {
			System.out.println(Array2[i]); // 배열이 복사됨
		}
		Array2[2] = 6; // 배열 일부 값 변경

		System.out.println("Array1[2] = " + Array1[2]); // 얕은복사로 값이 둘다 바뀜

		int number1[] = { 1, 2, 3 };
		int number2[] = { 7, 8, 9 };
		
		//swap
		/*int a,b;
		a=1;
		b=2;
		
		int temp;
		temp=a;
		a=b;
		b=temp;
		*/
		
		//깊은복사
		int num1[]=number1;
		int num2[]=number2;
		
		int temp[];
		temp = num1;
		num1=num2;
		num2=temp;
		
		for (int i = 0; i < temp.length; i++) {
			System.out.println("num2["+i+"] = "+num2[i]);
		}
		
		int numberArrayPosition[] = {1,2,3};
		int numArrPos[] = numberArrayPosition;
		
		//2차원배열
		//int []Arr2[] = new int[3][4]; 
		//int [][]Arr2 = new int[3][4]; 
		//int Arr2[][] = new int[3][4]; 
		//int[][] Arr2 = new int[3][4];//동적할당
		
		//2차원 배열 초기화
		int Arr2[][] = {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12}
		}; 
		
		System.out.println(Arr2[1][2]); //7
		
		int ArrNum[][] = null;	//*define NULL (0) or (0x0000) 메모리값은 0으로 초기화
		
		ArrNum = new int[3][];
		int a1[] = {1,2,3};
		ArrNum[0] = a1; //2차원배열에 넣기 가능
		
		int a2[]= {4,5,6,7};
		ArrNum[1]=a2; //길이가 달라도 가능
		
		int a3[]= {8,9};
		ArrNum[2] = a3;
		
		for (int i = 0; i < ArrNum.length; i++) {
			for (int j = 0; j < ArrNum[i].length; j++) {
				System.out.print(ArrNum[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
