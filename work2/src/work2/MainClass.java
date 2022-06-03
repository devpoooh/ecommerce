package work2;

import java.util.Random;
import java.util.Scanner;

public class MainClass {
	
	static boolean overlap(int a, int b, int c) {
		
		if(a!=b && b!=c && a!=c) {
			return true; //중복 없음
		}else {
			return false; //중복 발생
		}
	}
	
	public static void main(String[] args) {
		/* 
		 * 야구게임
		 * 
		 * random 3개 (숫자 중복 X)
		 * 기회 10번
		 * 
		 * 1~9 --> 3 7 2
		 * 
		 * 입력: 4 5 2
		 * 1 strike
		 * 
		 * 입력: 1 9 3
		 * 1 ball
		 * */
		
		Scanner sc = new Scanner(System.in); //입력
		Random random = new Random(); //난수발생
		
		boolean start = true;
		while(start) {
			System.out.println("야구게임을 시작합니다. 기회 10번");
			System.out.println("=======================================");
			
			int num1,num2,num3;
			//랜덤숫자 발생
			//방법1
			while(true) {
				num1 = random.nextInt(9)+1;
				num2 = random.nextInt(9)+1;
				num3 = random.nextInt(9)+1;
				
				//중복확인
				boolean bool = overlap(num1,num2,num3);
				if(bool==true) { //중복이 없으면 탈출
					break;
				}
			}
			
			//방법2
			int rnum[] = {1,2,3,4,5,6,7,8,9};
			for(int i=0;i<100;i++) {
				int r1= (int)Math.random()*10;
				int r2= (int)Math.random()*10;
				int temp = rnum[r1];
				rnum[r1]=rnum[r2];
				rnum[r2]=temp;
			}
			
			//방법3
			// 1 2 3 4 5 6 7 8 9
			// 0 0 1 0 0 1 0 0 1 --> 스위치처럼
			int r_num[] = new int[3];
			boolean swit[] = new boolean[10]; //false로 초기화
			System.out.println(swit[0]);
			
			int pnum1, pnum2, pnum3;
			System.out.printf("%d %d %d",num1,num2,num3);
			//게임 시작
			for (int i = 0; i < 10; i++) { //기회 10번
				int strike = 0; //스트라이크 개수
				int ball = 0; //볼 개수
				System.out.println("\n3개의 숫자를 입력해주세요.(중복X)");
				System.out.printf("%d차 시도: ",i+1);
				//player number 3개
				pnum1=sc.nextInt();
				pnum2=sc.nextInt();
				pnum3=sc.nextInt();
				
				//strike 찾기 (자리 숫자 모두 일치)
				if(pnum1==num1) strike++;
				if(pnum2==num2) strike++;
				if(pnum3==num3) strike++;
				
				//ball 찾기(숫자만 일치)
				if(pnum1==num2 || pnum1==num3) ball++;
				if(pnum2==num1 || pnum2==num3) ball++;
				if(pnum3==num1 || pnum3==num2) ball++;
				
				if(strike==3) {
					System.out.printf("\n정답입니다! 답:%d %d %d\n",num1,num2,num3);
					System.out.printf("%d차 시도만에 맞췄습니다!!\n\n",i+1);
					break;
				}else {					
					System.out.printf("%d차 시도 결과: %d strike %d ball\n",i+1,strike,ball);
				}
				
			}
			
			//게임 재시작 여부
			System.out.println("=======================================");
			System.out.println("다시 플레이를 하시겠습니까?(y/n)");
			String restart = sc.next();
			if(restart=="y" || restart=="Y") {
				start=true;
			}else {
				start=false;
				System.out.println("게임을 종료합니다.");
			}
		}
	}
}
