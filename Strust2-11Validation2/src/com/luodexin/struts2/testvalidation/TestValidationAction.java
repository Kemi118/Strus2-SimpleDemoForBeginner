package com.luodexin.struts2.testvalidation;

import com.opensymphony.xwork2.ActionSupport;

public class TestValidationAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	
	private Integer age;
	
	private Integer count;
	
	public TestValidationAction() {
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	@Override
	public String execute() throws Exception {
		
		System.out.println("age: "+age);
		System.out.println("count: "+count);
		
		return SUCCESS;
	}
	

}
