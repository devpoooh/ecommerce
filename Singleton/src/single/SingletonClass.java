package single;

public class SingletonClass {
	private static SingletonClass sc = null;
	
	public int num;
	
	private SingletonClass() {
		
	}
	
	public static SingletonClass getInstance() {
		if(sc==null) { //아직 생성이 안되었을 때 생성해준다.
			sc = new SingletonClass();
		}
		
		//두번째부터는 null이 아니기 때문에 기존 클래스를 넘겨준다.
		// => 즉 하나의 클래스로 사용하게 된다.
		return sc;
	}
}
