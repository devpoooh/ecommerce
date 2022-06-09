package cls;

public abstract class AbstractClass {
	private int number; //멤버변수를 포함하는 것이 가능
	
	public void method() {//메소드 선언 가능
		System.out.println("AbstractClass method()");
	}
	
	public abstract void abstractMethod();
}
