package calendat;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		/*
		 * Calendar: 일정관리, 인사관리, 입사정보
		 * 
		 * Date -> JavaScript
		 * */
		
		//방법1
//		Calendar cal = new GregorianCalendar();
		
		//방법2
		Calendar cal = Calendar.getInstance();
		
		/*
		//오늘날짜 취득
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;//월의 경우 0부터 시작
		int day = cal.get(Calendar.DATE);
		
		System.out.println(year+"/"+month+"/"+day); //2022/6/8  
		
		//날짜 설정
		cal.set(Calendar.YEAR, 2022);
		cal.set(Calendar.MONTH, 8-1); //7의 값이 8월
		cal.set(Calendar.DATE, 1);
		
		year = cal.get(Calendar.YEAR);
		month = cal.get(Calendar.MONTH)+1;
		day = cal.get(Calendar.DATE);
		
		System.out.println(year+"/"+month+"/"+day); //2022/8/1
		
		//AM PM
		String ampm = cal.get(Calendar.AM_PM)==0?"오전":"오후";
		System.out.println(ampm);
		
		//요일
		int weekday = cal.get(Calendar.DAY_OF_WEEK); //1(일)~7(토)
		
		switch(weekday) {
		case 1:
			System.out.println("일요일");
			break;
		case 2:
			System.out.println("월요일");
			break;
		case 3:
			System.out.println("화요일");
			break;
		case 4:
			System.out.println("수요일");
			break;
		case 5:
			System.out.println("목요일");
			break;
		case 6:
			System.out.println("금요일");
			break;
		case 7:
			System.out.println("토요일");
			break;
			
		}
		
		//오늘날짜
		cal.set(Calendar.YEAR, 2022);
		cal.set(Calendar.MONTH, 6-1); //7의 값이 8월
		cal.set(Calendar.DATE, 8);
		
		int lastday = cal.getActualMaximum(Calendar.DAY_OF_MONTH); //달의 마지막 날
		System.out.println(lastday);
		*/
		
		//달력 출력
		Scanner sc = new Scanner(System.in);
		
		//년 월 입력
		System.out.print("년 월 입력: ");
		int year = sc.nextInt();
		int month = sc.nextInt();

		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month-1);
		
		//마지막 날
		int lastday = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
//		System.out.println(lastday);
		
		//요일
		int weekday = cal.get(Calendar.DAY_OF_WEEK); //1(일) - 7(토)
//		System.out.println(weekday); //4(수)
		
		//출력
		System.out.printf("\t\t%d년 %d월\n",year, month);
		System.out.println("====================================================");
		System.out.println("일\t 월\t 화\t 수\t 목\t 금\t 토");
		
		for(int i=0;i<=weekday;i++) {
			System.out.print("\t");
		}

		for (int i = 1; i <= lastday; i++) {
			if(weekday%8==0) {
				weekday=1;
				System.out.println();
			}
			System.out.printf("%2d\t",i);
			weekday++;
		}
		
		
	}
}
