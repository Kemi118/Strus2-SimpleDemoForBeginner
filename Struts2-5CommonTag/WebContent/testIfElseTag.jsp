<%@page import="com.luodexin.bean.Person"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h4>Test if Tag</h4>
	<%
		Person person = new Person();
		person.setName("tom");
		person.setAge(10);
		request.setAttribute("per", person);
	%>
	
	<s:if test="#request.per.age < 12">小于12岁</s:if>
	<s:elseif test="#request.per.age < 18">12岁到18岁</s:elseif>
	<s:else>18岁以上</s:else>
	
</body>
</html>