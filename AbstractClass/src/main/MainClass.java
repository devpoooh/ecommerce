package main;

import cls.AbstractClass;
import cls.MyClass;

public class MainClass {
	public static void main(String[] args) {
		MyClass cls = new MyClass();
		cls.abstractMethod(); //MyClass의 메소드 출력
		
		AbstractClass ac = new MyClass(); //부모클래스 변수 = new 자식클래스
		ac.abstractMethod(); //MyClass의 메소드 출력
		
		AbstractClass ac1 = new AbstractClass() {
			
			@Override
			public void abstractMethod() {
				System.out.println("ac1 abstractMethod()");
			}
		};
		
		ac1.abstractMethod();
		ac1.method();
	}
}
