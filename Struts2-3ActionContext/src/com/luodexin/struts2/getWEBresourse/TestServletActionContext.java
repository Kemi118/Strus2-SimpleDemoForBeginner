package com.luodexin.struts2.getWEBresourse;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.catalina.Session;
import org.apache.struts2.ServletActionContext;

import com.sun.org.apache.regexp.internal.recompile;

public class TestServletActionContext {

	
	public String execute(){
		
		HttpServletRequest request = ServletActionContext.getRequest();
		request.setAttribute("requestKey", "requestValue3");
		
		HttpSession session = request.getSession();
		session.setAttribute("sessionKey", "sessionValue3");
		
		//${applicationScope.contextKey}
		ServletContext context = ServletActionContext.getServletContext();
		context.setAttribute("contextKey", "contextValue3");
		
		HttpServletResponse response = ServletActionContext.getResponse();
		
		return "success";
	}
	
}
