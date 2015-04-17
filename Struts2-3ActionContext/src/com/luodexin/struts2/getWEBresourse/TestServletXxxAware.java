package com.luodexin.struts2.getWEBresourse;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.util.ServletContextAware;

public class TestServletXxxAware implements ServletRequestAware,
		ServletContextAware, ServletResponseAware {

	private HttpServletRequest request;
	private HttpServletResponse response;
	private HttpSession session;
	private ServletContext context;
	
	
	@Override
	public void setServletResponse(HttpServletResponse response) {
		this.response = response;
	}

	@Override
	public void setServletContext(ServletContext context) {
		this.context = context;
	}

	@Override
	public void setServletRequest(HttpServletRequest request) {
		this.request = request;
		this.session = request.getSession();
	}
	
	public String execute(){
		
		System.out.println(request);
		System.out.println(response);
		System.out.println(session);
		System.out.println(context);
		
		return "success";
	}

}
