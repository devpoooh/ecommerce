package main;

import java.util.Iterator;

import cls.ChildClass;
import overridecls.ChildOne;
import overridecls.ChildTwo;
import overridecls.SuperClass;

public class MainClass {
	public static void main(String[] args) {
		ChildClass cc = new ChildClass();
//		cc.method(); //자식클래스의 메소드 출력

		ChildOne one = new ChildOne();
		ChildTwo two = new ChildTwo();

		one.method(); // 오버라이드된 메소드 출력
		two.method(); // 오버라이드된 메소드 출력

		ChildOne arrOne[] = new ChildOne[10];
		ChildTwo arrTwo[] = new ChildTwo[10];

		for (int i = 0; i < arrTwo.length; i++) {
			arrOne[i] = new ChildOne();
			arrTwo[i] = new ChildTwo();
		}
		
		//다음과 같이 사용해줘야 함.. -> 복잡
//		arrOne[0].method();
//		arrOne[1].method();
//		arrOne[2].method();
//		arrTwo[0].method();
		
		//해결방법
		SuperClass sc = new ChildOne();
		sc.method(); //ChildOne클래스의 오버라이드된 메소드 출력
		
		SuperClass arrSuper[] = new SuperClass[5];
		arrSuper[0] = new ChildOne();
		arrSuper[1] = new ChildOne();
		arrSuper[2] = new ChildOne();
		arrSuper[3] = new ChildOne();
		arrSuper[4] = new ChildTwo();	//arrSuper 하나로 인스턴스를 관리할 수 있다.
		
		//복잡...
		for (int i = 0; i < arrOne.length; i++) {
			if(arrOne[i] != null) {
				arrOne[i].method();
				arrOne[i].ChildOneMethod();
			}
		}
		
		for (int i = 0; i < arrTwo.length; i++) {
			if(arrTwo[i] != null) {
				arrTwo[i].method();
			}
		}
		
		//해결방법
		for (int i = 0; i < arrSuper.length; i++) {
			arrSuper[i].method();
			if(arrSuper[i] instanceof ChildOne) {
				ChildOne co =(ChildOne) arrSuper[i];
				co.ChildOneMethod();
			}
		}
	}
}
