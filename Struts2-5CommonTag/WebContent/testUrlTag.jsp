<%@page import="com.luodexin.bean.Person"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h4>Test Url Tag</h4>
	url 标签用来动态地创建一个 URL
	创建 url 字符串
	<s:url value="/testUrl" var="url"></s:url>
	${url}
	<br><br><br><hr><br>
	
	
	创建 url 字符串 带参数  struts2 默认自动对 value 参数值进行 OGNL 解析
	<s:url value="/testUrl" var="url2">
		<s:param name="name" value="1234"></s:param>
	</s:url>
	${url2}
	<br><br><br><hr>
	
	创建 url 字符串 带参数  struts2 默认自动对 value 参数值进行 OGNL 解析
	<s:url value="/testUrl" var="url3">
		<s:param name="name" value="name"></s:param> <!-- struts2 将解析name 为value赋值 -->
	</s:url>
	${url3}
	<br><br><br><hr>
	
	创建 url 字符串 带参数  struts2 默认自动对 value 参数值进行 OGNL 解析 加单引号则不解析
	<s:url value="/testUrl" var="url4">
		<s:param name="name" value="'name'"></s:param> <!-- struts2 将解析name 为value赋值 -->
	</s:url>
	${url4}
	<br><br><br><hr>
	
	用 action 属性和 namespace 组成 url
	<s:url action="testAction" namespace="/test" var="url5" method="methodname"></s:url>
	${url5}
	<br><br><br><hr>
	
	include请求参数到 url
	<s:url value="/testURL" var="url6" includeParams="get"></s:url>
	${url6}
	<br><br><br><hr>
	
	include请求参数到 url(包括所用参数用 all)
	<s:url value="/testURL" var="url7" includeParams="all"></s:url>
	${url7}

	<br><br><br><hr>
	<br><br><br><hr>
	set 标签用来在以下 Map 对象里创建一个键值对:
	<s:set name="hello" value="name" scope="request"></s:set>
	${requestScope.hello }
	<br><br><br><hr>
	<br><br><br><hr>
	
	push 标签在标签起始时把一个对象压入栈 ValueStack, 标签结束时将对象弹出栈
	<% Person person = new Person(); 
	person.setName("abc"); 
	person.setAge(20); 
	request.setAttribute("person1", person);
	%>
	<s:push value="#request.person1">
		${name }
	</s:push>
	<br><br>
		${name }
	
	<br><br><br><hr>
	<br><br><br><hr>
	
	
	
	
	<s:debug></s:debug>
	
</body>
</html>