package main;

import cls.Human;

//oop01
public class MainClass {
	public static void main(String[] args) {
		Human h = new Human(); //h: instance, object, 객체 즉, 변수
		
		h.name="홍길동";
		h.age=20;
		h.address="서울";
		
		h.method();
	}
}
