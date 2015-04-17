package com.luodexin.bean;

import java.util.ArrayList;
import java.util.List;

public class Person {
	
	private String name;
	private int age;
	
	private List<Person> personList = new ArrayList<>();
	
	public Person() {
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
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
	
	public List<Person> getPersonList() {
		return personList;
	}
	
	
	// Action method
	public String execute() {
		this.name = "luodx";
		this.age = 21;
		
		personList.add(new Person("aaaa", 1));
		personList.add(new Person("bbbb", 2));
		personList.add(new Person("cccc", 3));
		personList.add(new Person("dddd", 4));
		
		return "success";
	}
	
	
}
