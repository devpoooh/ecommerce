package cls;

import java.util.Observable;

public class MyClass extends Observable{
	
	private String perArg = null;
	
	private String password;

	//일반 메소드
	@Override
	public void notifyObservers(Object arg) {
		String str = (String)arg;
		
		//변화가 없을 때
		if(str.equals(perArg)) return;
		
		//변화가 있을 때
		perArg = str;
		setChanged(); //reset 함수
		
		super.notifyObservers(arg);
		//?
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPassword() {
		return password;
	}
	
	

}
