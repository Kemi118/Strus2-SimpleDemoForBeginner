package com.luodexin.actions;

import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;

public class PersonAction extends ActionSupport {
	/**
	 * 该类及时 Model 也是 Action
	 */
	private static final long serialVersionUID = 1L;

	private Integer age;
	
	private Date birth;
	
	public PersonAction() {
		// TODO Auto-generated constructor stub
	}

	public PersonAction(Integer age, Date birth) {
		super();
		this.age = age;
		this.birth = birth;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}
	
	public String execute(){
		
		return "success";
	}
	
}
