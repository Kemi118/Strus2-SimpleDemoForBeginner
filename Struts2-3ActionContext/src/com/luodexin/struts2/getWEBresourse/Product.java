package com.luodexin.struts2.getWEBresourse;

import java.util.Map;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.sun.org.apache.regexp.internal.recompile;

public class Product {
	
	private String id;
	private String name;
	private String desc;
	private String price;
	
	public Product() {	}

	public Product(String id, String name, String desc, String price) {
		super();
		this.id = id;
		this.name = name;
		this.desc = desc;
		this.price = price;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}
	
	//action 方法
	public String execute() {
		
		ActionContext actionContext = ActionContext.getContext();
		
		//1. 操作ServletContext
		Map<String, Object> applicationMap = actionContext.getApplication();
		applicationMap.put("appKey", "appValue");
		
		//2.操作session属性
		Map<String, Object> sessionMap = actionContext.getSession();
		sessionMap.put("sessionKey", "sessionValue");
		
		//3.操作request属性
		Map<String, Object> requestMap = (Map<String, Object>) actionContext.get("request");
		requestMap.put("requestKey", "requestValue");
		//读操作
//		requestMap.get("requestKey");
		//4.获取请求参数    请求参数的Map只能读，不能写 ， 写不起作用，但不会报错
		Map<String, Object> parametersMap = actionContext.getParameters();
		System.out.println(((String [])(parametersMap.get("name")))[0]);
		
		return "success";
	}
}
