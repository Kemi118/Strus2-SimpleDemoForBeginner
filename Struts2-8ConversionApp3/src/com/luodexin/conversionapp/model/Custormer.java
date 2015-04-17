package com.luodexin.conversionapp.model;

import java.util.Date;

public class Custormer {

	private Integer age;

	private Date birth;
	

	public Custormer() {
	}
	
	public Custormer(Integer age, Date birth) {
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
	
	
}
