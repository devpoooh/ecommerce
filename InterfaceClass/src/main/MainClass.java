package main;

public class MainClass {
	public static void main(String[] args) {
//		MyInterface myInter = new Interface(); //생성 불가능
		
		MyClass mycls = new MyClass();
		mycls.method(1);
		
		YouClass ycls = new YouClass();
		ycls.func(null);
		ycls.method(0);
		
		MyInterface my = new MyClass();
		my.method(0); //접근 가능
//		my.func(null); //접근 불가능.. --> MyInterface로 선언되었기 때문에
	}
}
