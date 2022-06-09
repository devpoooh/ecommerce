package cls;

public class ParentClass {
	
	private String name;
	private int age;
	
//	public ParentClass() {
//		System.out.println("ParentClass ParentClass()");
//	}

	public ParentClass(String name) {
		super();
		this.name = name;
		System.out.println("ParentClass(String name)");
	}

	public ParentClass(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public void ParentMethod() {
		System.out.println("ParentClass ParentMethod()");
	}

	@Override
	public String toString() {
		return "ParentClass [name=" + name + ", age=" + age + "]";
	}

}
