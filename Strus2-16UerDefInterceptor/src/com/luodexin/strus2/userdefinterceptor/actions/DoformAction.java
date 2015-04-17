package com.luodexin.strus2.userdefinterceptor.actions;

import com.opensymphony.xwork2.ActionSupport;

public class DoformAction extends ActionSupport{

	private static final long serialVersionUID = 1L;
	
	private String userName;
	
	public DoformAction() {
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
		System.out.println(userName);
		return super.execute();
	}
	
}
