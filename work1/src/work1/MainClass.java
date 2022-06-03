package work1;

public class MainClass {
	public static void main(String[] args) {
		// 10진수 입력 -> 2진수(String)로 표현
		// ex. 7 -> 0111
		int n10 = 7;
		String str = "";
		while (n10 != 0) {
			str = n10 % 2 + str;
			n10 /= 2;
//			 System.out.println(n10);
		}
		System.out.println("10진수 7 --> 2진수 "+ str); // 111

		// 2진수 입력 -> 10진수(int)로 표현
		// 문자열의 자리수 구하기
		// ex. 0111 -> 7
		String binary = "0111";
		int cnt = binary.length()-1; // 2의 승수 카운트
		int sum = 0; // 10진수 결과
		for (int i = 0; i < binary.length(); i++) {
			char c = binary.charAt(i);
			if (c == '1') {
				sum += (int) Math.pow(2, cnt);
			}
			cnt--;
		}
		System.out.println("2진수 0111 --> 10진수 " + sum);

		// 10진수 입력 -> 16진수(String)로 표현
		// ex. 15 --> F
		int a=125;
		String res = "";
		while(a!=0) {
			int re = a%16;
			if(re<10) {
				res=re+res;
			}else {
				res=(char)(re+55)+res;
			}
			a /= 16;
		}
		System.out.println("10진수 15 --> 16진수 "+res);
		
		// 16진수 입력 -> 10진수(int)로 표현
		// ex. F --> 15
		String digit = "0123456789ABCDEF";
		String s16 = "F";
		int result=0;
		for(int i=0;i<s16.length();i++) {
			char c = s16.charAt(i);
			int d = digit.indexOf(c);
			result=result*16+d;
		}
		System.out.println("16진수 F --> 10진수 "+result);
	}
}
