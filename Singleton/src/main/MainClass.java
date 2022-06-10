package main;

import cls.HeClass;
import cls.MyClass;
import cls.YouClass;
import single.SingletonClass;

//싱글톤
public class MainClass {
	public static void main(String[] args) {
		MyClass mycls = new MyClass(123);
		YouClass youcls = new YouClass();
		
//		int n = mycls.getNumber();
//		
//		youcls.setTag(n);
		System.out.println(youcls.toString());
		
		//생성불가하게 막아둠
//		SingletonClass sc = new SingletonClass();
		
		//다 같은 객체를 갖는다.
		System.out.println(SingletonClass.getInstance());
		System.out.println(SingletonClass.getInstance());
		System.out.println(SingletonClass.getInstance());
		
		mycls.method(); //MyClass의 num을
		youcls.func();	//YouClass의 tag에 넣어 얻어오기
		System.out.println(youcls.toString());
		
		HeClass hc = new HeClass();
		hc.proc();
		
		System.out.println(hc.toString());
	}
}
