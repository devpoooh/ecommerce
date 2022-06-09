package main;

import cls.ChildClass;

public class MainClass {
	public static void main(String[] args) {
		ChildClass cc = new ChildClass();
		
		// 눈에 보이진 않지만 자식 클래스는 부모 클래스를 갖고 있다.
//		cc.ParentMethod();
//		cc.func();
		
		//super 설명
		ChildClass cc2 = new ChildClass("j",189.2,5);
		cc2.print();
	}
}
