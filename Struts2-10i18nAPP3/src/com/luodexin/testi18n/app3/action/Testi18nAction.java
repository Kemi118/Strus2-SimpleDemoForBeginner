package com.luodexin.testi18n.app3.action;

import java.util.Date;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.ServletRequestAware;

import com.opensymphony.xwork2.ActionSupport;

public class Testi18nAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	
	private Date date;
	
	public Date getDate() {
		return date;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
	
	public Testi18nAction() {
		// TODO Auto-generated constructor stub
	}

	public String execute(){
		date = new Date();
		
		return SUCCESS;
	}

}
