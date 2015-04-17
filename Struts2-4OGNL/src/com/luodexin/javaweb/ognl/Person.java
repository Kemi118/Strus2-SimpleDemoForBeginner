package com.luodexin.javaweb.ognl;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;

public class Person {
	
	private String name;
	private String age;
	
	public Person() {
	}

	public Person(String name, String age) {
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

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
	//Action
	public String excute(){
		
		ActionContext actionContext = ActionContext.getContext();
		Map<String, Object> requestMap = (Map<String, Object>) actionContext.get("request");
		requestMap.put("person", this);
		
		
		return "success";
	}
	
	public String handleException() {
		int i = 5 / 0 ;
		return "success";
	}
}
