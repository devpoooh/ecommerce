package sample07;

public class MainClass {
	public static void main(String[] args) {
		// 반복문
		int n;

		for (n = 0; n < 10; n++) {
			System.out.println("n = " + n);
		}

		for (int i = 0; i < 10; i++) {
			System.out.println("i = " + i);
		}
		
		//0부터 사용하는 게 좋다
		for(int i=1;i<=100;i++) {
			
		}
		
		for(int i=0;i<10;i++) {
			for(int j=0;j<5;j++) {
				System.out.print(i+":"+j+" ");
			}
			System.out.println();
		}
		
		int Array[][] = {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
		};
		
		for (int i = 0; i < Array.length; i++) { //배열 일차원 길이에 대한 반복
			for (int j = 0; j < Array[i].length; j++) {//배열 2차원 길이에 대한 반복
				System.out.print("Array["+i+"]["+j+"] = "+Array[i][j] +" ");
			}
			System.out.println();
		}
		
		int Arr[]= {1,2,3};
		for(int num:Arr) { //num에는 값이 넘어온다
			System.out.println(num);
		}
	}
}
