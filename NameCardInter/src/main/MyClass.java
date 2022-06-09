package main;

import cls.NameCard;
import cls.PrintEmailCard;
import cls.PrintNameCard;
import cls.PrintPhoneCard;

public class MyClass {
	public static void main(String[] args) {
		NameCard ncard = new NameCard("kim", "010-1223-1234", "kim@gmail.com");
		
		ncard.setPrintNameCard(new PrintNameCard());
		ncard.print(); //이름만 출력
		
		ncard.setPrintNameCard(new PrintPhoneCard());
		ncard.print(); //이름, 폰번호 출력
		
		ncard.setPrintNameCard(new PrintEmailCard());
		ncard.print(); //모두 출력
		
	}
}
