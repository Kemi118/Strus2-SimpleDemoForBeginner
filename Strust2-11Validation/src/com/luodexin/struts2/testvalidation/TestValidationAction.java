package com.luodexin.struts2.testvalidation;

import com.opensymphony.xwork2.ActionSupport;

public class TestValidationAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	
	private int age;
	
	private String password;
	private String password2;
	
	public TestValidationAction() {
	}

	public TestValidationAction(int age) {
		super();
		this.age = age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPassword2() {
		return password2;
	}

	public void setPassword2(String password2) {
		this.password2 = password2;
	}

	@Override
	public String execute() throws Exception {
		
		System.out.println("age: "+age);
		
		return SUCCESS;
	}
	
	public String testpassword(){
		System.out.println("password: "+password);
		System.out.println("password2: "+password2);
		return SUCCESS;
	}
	
	

}
