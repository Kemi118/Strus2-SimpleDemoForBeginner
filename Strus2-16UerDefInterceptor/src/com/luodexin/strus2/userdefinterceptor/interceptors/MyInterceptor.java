package com.luodexin.strus2.userdefinterceptor.interceptors;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class MyInterceptor implements Interceptor {

	private static final long serialVersionUID = 1L;

	@Override
	public void destroy() {
		System.out.println("MyInterceptor destroy....");
	}

	@Override
	public void init() {
		//服务器加载时调用  
		System.out.println("MyInterceptor init.....");
	}

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		System.out.println("befor invoketion invoke....");
		
		String result = invocation.invoke();
		
		System.out.println("after invoketion invoke....");
		return result;
	}



}
