package main;

public class MyData {
	private int number;
	private String name;
	
	
	public MyData(int number, String name) {
		super();
		this.number = number;
		this.name = name;
	}


	//1. 추가
	public void dataAdd() {
		
	}

	public int getNumber() {
		return number;
	}


	public void setNumber(int number) {
		this.number = number;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "MyData [number=" + number + ", name=" + name + "]";
	}
	
	
}
