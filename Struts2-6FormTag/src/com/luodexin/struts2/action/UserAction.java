package com.luodexin.struts2.action;

public class UserAction {

	private int id;
	private String userName;
	private String passWord;
	private String desc;
	private boolean agreed;
	
	public UserAction() {
		// TODO Auto-generated constructor stub
	}

	public UserAction(int id, String userName, String passWord, String desc) {
		super();
		this.id = id;
		this.userName = userName;
		this.passWord = passWord;
		this.desc = desc;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	

	public boolean isAgreed() {
		return agreed;
	}

	public void setAgreed(boolean agreed) {
		this.agreed = agreed;
	}


	
	@Override
	public String toString() {
		return "UserAction [id=" + id + ", userName=" + userName
				+ ", passWord=" + passWord + ", desc=" + desc + ", agreed="
				+ agreed + "]";
	}

	public String execute(){
		
		System.out.println(this.toString());
		
		return "success";
	}
	
	
}
