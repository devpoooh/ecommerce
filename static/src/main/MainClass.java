package main;

import cls.MyClass;

public class MainClass {
	public static void main(String[] args) {
		MyClass cls = new MyClass();
		cls.method(3, null);
		cls.method(3, null);
		
		MyClass cls2 = new MyClass();
		cls2.method(0, null);
	}
}
