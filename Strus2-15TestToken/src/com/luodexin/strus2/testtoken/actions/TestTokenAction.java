package com.luodexin.strus2.testtoken.actions;

import com.opensymphony.xwork2.ActionSupport;

public class TestTokenAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	private String userName;
	
	public TestTokenAction() {
		// TODO Auto-generated constructor stub
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	@Override
	public String execute() throws Exception {
		//Ä£ÄâÍøÂçÑÓÊ±
		Thread.sleep(2000);
		
		System.out.println(userName);
		return super.execute();
	}
	
	
	
}
