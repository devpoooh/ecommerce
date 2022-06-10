package main;

import cls.MyClass;
import observer.ObserverA;

public class MainClass {
	public static void main(String[] args) {		
		MyClass cls = new MyClass();
		
		cls.setPassword("abc123");
		cls.addObserver(new ObserverA());
		cls.notifyObservers(cls.getPassword());
	}
}
