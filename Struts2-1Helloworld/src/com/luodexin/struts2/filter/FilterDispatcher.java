package com.luodexin.struts2.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import com.luodexin.struts2.beans.Product;

/**
 * Servlet Filter implementation class FilterDispatcher
 */
public class FilterDispatcher implements Filter {

    public FilterDispatcher() {    }

	public void destroy() {	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		//1.获取servletPath
		String servletPath = req.getServletPath();
		
		String path = null;
		
		//2.判断 servletPath 
		if("/product-input.action".equals(servletPath)){
			path = "/WEB-INF/pages/input.jsp";
		}else if ("/input-save.action".equals(servletPath)) {
			
			String name = request.getParameter("name");
			String desc = request.getParameter("desc");
			String price = request.getParameter("price");
			
			Product product = new Product(name, desc, price);
			product.setId("1000");
			
			request.setAttribute("product", product);
			
			System.out.println(product.toString());
			
			path = "/WEB-INF/pages/details.jsp";
			
		}
		
		//3.转发
		if(path != null){
			request.getRequestDispatcher(path).forward(request, response);
			return;
		}
		
		chain.doFilter(request, response);
	}

	public void init(FilterConfig fConfig) throws ServletException {}

}
