package main;

import cls.NameCard;
import cls.PrintNameCard;
import cls.PrintPhoneCard;

public class MyClass {
	public static void main(String[] args) {
		NameCard ncard = new NameCard("홍길동", "010-1234-1234", "email@naver.com");
		
		ncard.setPrintNameCard(new PrintNameCard());
		ncard.print();
		
		//이름, 폰
		ncard.setPrintPhoneCard(new PrintPhoneCard());
		ncard.print();
	}
}
