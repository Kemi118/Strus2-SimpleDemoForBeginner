package com.luodexin.struts2.action;

import java.util.List;

public class User {
	private String userName;
	private String passWord;
	private int gender;
	private int age;
	private List<String> cities;
	private String history;
	private boolean agreed;
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(String userName, String passWord, int gender, int age,
			List<String> cities, String history, boolean agreed) {
		super();
		this.userName = userName;
		this.passWord = passWord;
		this.gender = gender;
		this.age = age;
		this.cities = cities;
		this.history = history;
		this.agreed = agreed;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public int getGender() {
		return gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public List<String> getCities() {
		return cities;
	}

	public void setCities(List<String> cities) {
		this.cities = cities;
	}

	public String getHistory() {
		return history;
	}

	public void setHistory(String history) {
		this.history = history;
	}

	public boolean isAgreed() {
		return agreed;
	}

	public void setAgreed(boolean agreed) {
		this.agreed = agreed;
	}

	@Override
	public String toString() {
		return "User [userName=" + userName + ", passWord=" + passWord
				+ ", gender=" + gender + ", age=" + age + ", cities=" + cities
				+ ", history=" + history + ", agreed=" + agreed + "]";
	}
	
	public String execute(){
		System.out.println(this.toString());
		return "success";
	}
	
	
}
