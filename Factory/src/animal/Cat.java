package animal;

public class Cat implements Animal {

	@Override
	public void printDescript() {
		System.out.println("고양이입니다.");
	}
	
	public void catMethod() {
		System.out.println("야옹야옹");
	}

}
