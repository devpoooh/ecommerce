package work1;

public class Main {
	public static void main(String[] args) {
		int number = 10;
		int tag;	//나눈 나머지를 구할 변수
		String numStr = "";	//2진수를 출력할 변수
		int oldNumber = 10;
		
		//10진수 -> 2진수(String)
		while(true) {
			tag=number % 2;
			numStr = tag+numStr; //자동 형변환
			if(number/2==0) {
				break;
			}
			number = number/2;
		}
		System.out.println(oldNumber + "의 2진수는 "+ numStr+"입니다.");
		
		//2진수 --> 10진수
		String sumStr = "1010";
		int len = numStr.length();
		char cNum;
		int n, n1;	//숫자, 승수
		int number10=0;
		
		int oldLen = len;
		for (int i = 0; i < oldLen; i++) {
			cNum = numStr.charAt(i);
			
			n=Integer.parseInt(cNum+"");
			n1 = (int) Math.pow(2, len-1);
			n=n*n1;
			
			len--;
			number10 = number10+n;
		}
//		number10 = Integer.parseInt(sumStr,2);	//같은 결과
		System.out.println(numStr+"의 10진수는 "+number10+"입니다.");
		
		//10진수 -> 16진수(String)
		int number3 = 58;
		String numStr16="";
		String strInt = "";
		int tag16;
		
		int oldNumber3 = number3;
		
		while(true) {
			tag16 = number%16;
			
			switch(tag16) {
			case 10:
				strInt = "A";
				break;
			case 11:
				strInt = "B";
				break;
			case 12:
				strInt = "C";
				break;
			case 13:
				strInt = "D";
				break;
			case 14:
				strInt = "E";
				break;
			case 15:
				strInt = "F";
				break;
			default: //0~9
				strInt = tag16 + "";
			}
			numStr16 = strInt + numStr16;
			if(number / 16==0) {
				break;
			}
			number/=16;
		}
		
		//numStr16 = Integer.toHexString(oldNumber);
		System.out.println(oldNumber+"의 16진수는 0x"+numStr16+"입니다.");
		
		//4. 16진수(String) -> 10진수
		String str = "3A";
		int len16 = str.length();
		
		String n16;	//0~9 A~F 구분
		int oldLen16 = len16;
		int powNum;
		int number16 = 0;
		int num16;
		
		for (int i = 0; i < str.length(); i++) {
			n16 = str.charAt(i)+"";
			if(n16.equals("A")) {
				n16="10";
			}else if(n16.equals("B")) {
				n16="11";
			}else if(n16.equals("C")) {
				n16="12";
			}else if(n16.equals("D")) {
				n16="13";
			}else if(n16.equals("E")) {
				n16="14";
			}else if(n16.equals("F")) {
				n16="15";
			}
			
			powNum = (int) Math.pow(16, len16-1);
			num16 = Integer.parseInt(n16)*powNum;
			
			number16+=num16;
			len16--;
		}
		System.out.println("0x"+str+"의 10진수는 "+number16+"입니다.");
		
		/*
		 * 입력받은 문자열이 모두 숫자로 되어있는지 확인하기
		 * */
		
		String str1 = "123";
		boolean numTrue = true;
		/*
		 * boolean b = true; //false면 문자 포함 for(int i=0;i<str1.length();i++) { char c =
		 * str1.charAt(i);
		 * 
		 * switch(c) { case '0': case '1': case '2': case '3': case '4': case '5': case
		 * '6': case '7': case '8': case '9': break; default: b= false; break; }
		 * 
		 * if(b==false) { break; } }
		 * 
		 * if(b==true) { System.out.println("모두 숫자로 이루어져 있습니다."); }else {
		 * System.out.println("문자가 포함되어 있습니다."); }
		 */
		
		for (int i = 0; i < str1.length(); i++) {
			char c = str1.charAt(i);
			int asc = (int)c;
			if(asc<48 || asc>52) {
				System.out.println("숫자");
			}else {
				
			}
		}
	}
	
}
