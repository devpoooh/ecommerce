package main;

public class MainClass {
	public static void main(String[] args) {
		Box<Integer> box = new Box<>(2);
		
		System.out.println(box.getTemp()+1); //3
		
		Box<String> sbox = new Box<>("2");
		System.out.println(sbox.getTemp()+1); //21
		
		//실습2
		Boxmap<String,Integer> bmap = new Boxmap<>("kim",12);
		System.out.println(bmap.getName());
		System.out.println(bmap.getValue());
	}
}

//제네릭
class Box<T>{ //T => template(형태)
	T temp;

	public Box(T temp) {
		super();
		this.temp = temp;
	}

	public T getTemp() {
		return temp;
	}

	public void setTemp(T temp) {
		this.temp = temp;
	}
	
}

class Boxmap<K,V>{
	K name;
	V value;
	
	public Boxmap(K name, V value) {
		super();
		this.name = name;
		this.value = value;
	}

	public K getName() {
		return name;
	}

	public void setName(K name) {
		this.name = name;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}
	
	
}
