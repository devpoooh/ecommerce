package main;

import java.util.ArrayList;
import java.util.List;

import animal.Animal;
import animal.Cat;
import animal.Cow;
import animal.Dog;
import factory.AnimalFactory;

public class MainClass {
	public static void main(String[] args) {
		////입력값에 따라 원하는 동물 생성
		Animal ani = AnimalFactory.create("고양이"); 
		
		List<Animal> list = new ArrayList<>();
		ani =null;
		ani = AnimalFactory.create("고양이"); 
		list.add(ani);
		ani = AnimalFactory.create("강아지"); 
		list.add(ani);
		ani = AnimalFactory.create("소"); 
		list.add(ani);
		
		for (int i = 0; i < list.size(); i++) {
			Animal a = list.get(i);
			a.printDescript();
			
			if(a instanceof Cat) {
				((Cat)a).catMethod();
			}else if(a instanceof Dog) {
				Dog c = (Dog)a;
				c.dogMethod();
			}else if(a instanceof Cow) {
				((Cow)a).cowMethod();
			}
		}
		
		/*
		 * ani.printDescript();//고양이입니다. Cat cat = (Cat)ani; cat.catMethod();
		 */
	}
}
