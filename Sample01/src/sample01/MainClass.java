package sample01;

public class MainClass {
	public static void main(String[] args) {
		/*
		 * 숫자(상수): 2진수: 0, 1 8진수: 0 ~ 7 9 -> 011 10진수: 0 ~ 9 16진수: 0~ 9 A ~ F(15)
		 * 
		 * 변수: 빈통(크기)에 데이터 종류가 나누어진다.
		 */

		int num;
		String str; // instance, object == 클래스 변수

		// 변수 종류
		// 숫자
		byte by; // 1byte
		short sh; // 2byte
		int i; // 4byte
		long l; // 8byte

		float f; // 4byte
		double d; // 8byte

		l = 1546321352L;
		f = 1234.1231543f;
		d = 12343.13423234;
		
		// 문자
		char c;		//2byte
		c = '한';
		char arrC[] = {'a','b','c'};
		
		String str1;		//wrapper class(일반 자료형을 객체화)
							// Integer, Double
		str1="hello";
		
		// 논리
		boolean b;		//c의 BOOL은 4byte(0이 아니면 모두 트루처리), boolean은 1byte
		b= true;	//1
		b=false;	//0
		
	}
}
