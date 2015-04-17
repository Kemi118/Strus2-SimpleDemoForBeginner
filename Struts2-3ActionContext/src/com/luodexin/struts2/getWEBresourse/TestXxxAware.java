package com.luodexin.struts2.getWEBresourse;

import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.ParameterAware;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;

public class TestXxxAware implements ApplicationAware, SessionAware,
		RequestAware, ParameterAware {

	private Map<String, Object> application;
	private Map<String, Object> session;
	private Map<String, Object> request;
	private Map<String, String[]> parame;
	
	@Override
	public void setParameters(Map<String, String[]> parameters) {
		this.parame = parameters;
	}
	@Override
	public void setRequest(Map<String, Object> request) {
		this.request = request;
	}
	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
	@Override
	public void setApplication(Map<String, Object> application) {
		this.application = application;
	}
	
	
	public String execute(){
		
		//1.操作 application 属性
		application.put("applicationKey2", "applicationValue2");
		
		//2.操作 session 属性
		session.put("sessionKey2", "sessionValue2");
		//使session失效
		if(session instanceof SessionMap){
			SessionMap sm = (SessionMap) session;
			sm.invalidate();
			System.out.println("session 失效了。。。。");
		}
		
		
		
		
		//3.操作 request 属性
		request.put("requestKey2", "requestValue2");
		
		//4.操作 parameter 属性
		// 向请求参数中 增加新的参数 没效果    但是不会报错
		String [] age = new String[1];
		age[0] = "21";
		parame.put("age", age);
		
		System.out.println(parame.get("name")[0]);
		
		
		return "success";
	}

}
