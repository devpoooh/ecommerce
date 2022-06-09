package main;

import cls.MyClass;

public class MainClass {
	public static void main(String[] args) {
		int array[] = {1,2,3};
		
//		MyClass mycls = {1, "홍길동",181.1}; 	//불가능 --> constructor(생성자) 사용
		
		MyClass mycls = new MyClass();
		MyClass mycls2 = new MyClass(1,"kim");
		MyClass mycls3 = new MyClass(1, "lee",170.3);
		
		System.out.println(mycls2.toString());
		
		//this 설명
		System.out.println(mycls3); //기본적으로 toString 출력 
		System.out.println(mycls3.getThis()); 
	}
}
