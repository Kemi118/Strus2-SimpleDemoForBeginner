package com.luodexin.struts2.testIDCard;

import com.opensymphony.xwork2.ActionSupport;

public class IDCardAction extends ActionSupport{

	private static final long serialVersionUID = 1L;

	private String idcard;
	
	public IDCardAction() {
	}
	
	public IDCardAction(String idcard) {
		super();
		this.idcard = idcard;
	}
	
	public String getIdcard() {
		return idcard;
	}
	
	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}
	

	@Override
	public String execute() throws Exception {
		System.out.println(idcard);
		return SUCCESS;
	}
	
}
