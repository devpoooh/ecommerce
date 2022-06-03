package sample06;

public class MainClass {
	public static void main(String[] args) {
		int number =5;
		
		if(number > 0) {
			System.out.println("number > 0");
		}
		
		//블록 생략 가능 --> 한줄이면
		if(number > 0)  
			System.out.println("number > 0");
		
		if(number > 0 && number<10) {
			System.out.println("number > 0 && number < 10");
		}
		
		if(number < 0 || number > 10) { //false
			System.out.println("number < 0 || number > 10");
		}
		
		//else
		if(number < 0) {
			System.out.println("number < 0");
		}else {
			System.out.println("number > 0");
		}
		
		String str= (number < 0) ? "number < 0" : "number > 0";
		System.out.println("str = " + str);
		
		number=90;
		if(number>90) {
			System.out.println("number>90");
		}else if(number>80) {
			System.out.println("number>80");
		}else if(number>70) {
			System.out.println("number>70");
		}else {
			System.out.println("number<=70");
		}
		
		number=95;
		if(number >= 90 && number<=100) {
			if(number>=95) {
				System.out.println("A+입니다");
			}else {
				System.out.println("A입니다");
			}
		}
		
		//불린변수 if문
		boolean b= false;
		if(b==false) {
			System.out.println("b==false");
		}
		if(!b) {//b가 true일때
			System.out.println("b==false");
		}
		if(b) {
			
		}
		String _str = "hello";
		if(_str.equals("world")) { //문자열이 다를때
			System.out.println("_str은 hello가 아닙니다");
			
		}
	}
}
