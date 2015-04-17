<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags"	prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<s:debug></s:debug>
	
	<a href="testi18n?request_locale=en_US">English</a> | 
	<a href="testi18n?request_locale=zh_CN">中文</a>
	
	<br/><br/>
	
	<a href="index.jsp">Index Page</a>
	
	<br/>
	
	<s:form action="" theme="simple">
		<s:text name="username"/>:<s:textfield name="username" label="%{getText('username')}"></s:textfield>
		
		<!-- key 的方式是直接上资源文件中获取 value 值 -->
		<s:text name="username"/>:<s:textfield name="username" key="username"></s:textfield>
		<s:text name="password"/>:<s:password name="password" key="password"></s:password>
		
		<s:submit key="submit" value="%{getText('submit')}"></s:submit>
		
	</s:form>
	
</body>
</html>