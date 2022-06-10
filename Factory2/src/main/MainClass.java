package main;

import java.util.ArrayList;
import java.util.List;

import person.Person;
import types.AbstractItem;
import types.Atype;
import types.Btype;

public class MainClass {
	public static void main(String[] args) {
		Person person = new Person();
		
		//Atype 생성
		person.create(new Atype());
		person.m_weapon.drawWeapon();
		person.m_bomb.drawBomb();
		
		//여러 유저 생성
		System.out.println("여러명 유저");
		List<Person> list = new ArrayList<>();
		
		Person person1 = new Person();
		
		AbstractItem item = null;
		
		item = new Atype();
		person1 = new Person();
		person1.create(item);
		list.add(person1);
		
		item = new Atype();
		person1 = new Person();
		person1.create(item);
		list.add(person1);
		
		item = new Btype();
		person1 = new Person();
		person1.create(item);
		list.add(person1);
		
		//출력
		for(Person p:list) {
			p.m_weapon.drawWeapon();
			p.m_bomb.drawBomb();
		}
	}
}
