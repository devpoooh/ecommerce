package work3;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		/*
		 * 학생 성적관리 프로그램
		 * 
		 * 학생 수?
		 * 2차원 배열 할당
		 * 
		 * 입력
		 * 학생이름, 번호, 국어, 영어, 수학 / 총점 평균
		 * 0         1   2    3     4     5   6
		 * 
		 * 국어의 최고점수 몇점인지, 누구?
		 * 영어의 최하점수는 몇점인지, 누구?
		 * 각 학생의 총점,평균
		 * */
		
		Scanner sc = new Scanner(System.in);
		
		int korMax = 0; //국어 최고 점수
		int korIdx = 0; //국어 최고점의 학생 인덱스
		int engMin = 101; //영어 최저 점수
		int engIdx = 0; //영어 최저점의 학생 인덱스
		
		System.out.print("학생 수 입력: ");
		int n = sc.nextInt(); //학생 수
		
		String[][] stu = new String[n][7];
		for(int i=0;i<stu.length;i++) {
			System.out.print("이름: ");
			stu[i][0] = sc.next();
			System.out.print("번호: ");
			stu[i][1] = sc.next();
			System.out.print("국어: ");
			stu[i][2] = sc.next();
			System.out.print("영어: ");
			stu[i][3] = sc.next();
			System.out.print("수학: ");
			stu[i][4] = sc.next();
			
			//국어 최고 점수
			int kor = Integer.parseInt(stu[i][2]);
			if(korMax < kor ) {
				korMax=kor;
				korIdx=i;
			}
			
			//영어 최저 점수
			int eng = Integer.parseInt(stu[i][3]);
			if(engMin > eng) {
				engMin=eng;
				engIdx=i;
			}
			
			//총점계산
			int sum=0; //총점
			for(int j=2;j<5;j++) {	
				sum +=Integer.parseInt(stu[i][j]);
				stu[i][5] = sum+"";
			}
			
			//평균
			stu[i][6] = (float)(sum/3.0)+"";
			System.out.println();
		}
		
		//출력
		System.out.printf("수학 1등: %s %d점\n",stu[korIdx][0],korMax);
		System.out.printf("영어 %d등: %s %d점\n",n,stu[engIdx][0],engMin);
		System.out.println("이름\t 번호\t 국어\t 영어\t 수학\t 총점\t 평균");
		for(int i=0;i<n;i++) {
			System.out.printf("%s\t %s\t %s\t %s\t %s\t %s\t %.5s \n",stu[i][0],stu[i][1],stu[i][2],stu[i][3],stu[i][4],stu[i][5],stu[i][6]);
		}
	}
}
