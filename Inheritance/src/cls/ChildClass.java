package cls;

public class ChildClass extends ParentClass {
	
	private double height;
	
	public ChildClass() {
		super("hong"); //부모클래스를 가르킴
		System.out.println("ChildClass ChildClass()");
	}
	
	//super 설명
	public ChildClass(String name, double height, int age) {
		super(name,age);
		this.height = height;
	}

	public void func() {
		System.out.println("ChildClass func()");
	}
	//부모를 상속받더라도 private 변수에는 접근이 불가

	@Override
	public String toString() {
		return "ChildClass [height=" + height + "]";
	}
	
	public void print() {
		System.out.println(super.toString()); //부모클래스의 tostring
		System.out.println(this.toString());	//자식클래스의 tostring
	}
	
}
