package cls;

import inter.PrintNameInterface;

public class NameCard {
	String name;
	String phone;
	String email;
		
	PrintNameInterface pNameInter; //인터페이스를 사용함으로써 
	
	public NameCard(String name, String phone, String email) {
		super();
		this.name = name;
		this.phone = phone;
		this.email = email;
	}
	
	public void setPrintNameCard(PrintNameInterface p) {
		pNameInter = p;
	}
	
	public void print() {
		pNameInter.print(this);
	}
}
