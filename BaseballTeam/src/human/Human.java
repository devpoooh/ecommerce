package human;

import player.PlayerInterface;

public class Human {
	private int id; //번호
	private String name; //이름
	private int age;	//나이
	private double height; //신장
	
	public void create(PlayerInterface player) {
		
	}
	
	public Human() {
		
	}
	
	public Human(int id, String name, int age, double height) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.height = height;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Human [id=" + id + ", name=" + name + ", age=" + age + ", height=" + height + "]";
	}
	
	
	
}
