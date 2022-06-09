package cls;

public class MyClass {
	private int number;
	private String name;
	private double height;

	// 기본 생성자
	public MyClass() {
		System.out.println("MyClass MyClass()");
		// 초기화시킬 때 자주 사용
		number = 1;
		name = "";
		height = 0.0;
	}
	
	//매개변수가 있는 생성자
	public MyClass(int number, String name) {
		System.out.println("MyClass(int number, String name)");
		this.number = number;
		this.name = name;
	}

	public MyClass(int number, String name, double height) {
		this(number,name);
		this.number = number;
		
		//밑의 코드는 불필요해진다.
//		this.name = name;
//		this.height = height;
	}
	
	//this 설명
	public MyClass getThis() {
		return this;
	}
	
	public void func() {
		this.height=180;
		this.number=4;
	}
	
	public void function(int number) {
		
	}

	@Override
	public String toString() {
		return "MyClass [number=" + number + ", name=" + name + ", height=" + height + "]";
	}
	
}
