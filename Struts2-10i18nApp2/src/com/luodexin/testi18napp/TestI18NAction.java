package com.luodexin.testi18napp;

import java.util.Arrays;
import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;

public class TestI18NAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	
	
	public String execute(){
		
		//1. Action 中访问 国际化资源
		String username = getText("username");
		System.out.println(username);
		
		//2. 带占位符的资源
		String date = getText("time", Arrays.asList(new Date()));
		System.out.println(date);
		
		
		return SUCCESS;
	}
	
}
