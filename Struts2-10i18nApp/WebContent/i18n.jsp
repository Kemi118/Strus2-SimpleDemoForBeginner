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
	<br><br>
	<h4>全局配置的国际化</h4>
	<s:form action="">
		<s:textfield name="username" label="UsrName"></s:textfield>
		<s:textfield name="username" key="username"></s:textfield>
		<s:textfield name="password" key="password"></s:textfield>
		<s:submit key="submit"></s:submit>
	</s:form>
	<s:debug></s:debug>
	<br/><br/>
	可以通过 %{} 方式直接通过 OGNL 调用 值栈里的  com.opensymphony.xwork2.DefaultTextProvider 的 getText() 方法<br/>
	<s:form action="">
		<s:textfield name="username" label="%{getText('username') }"></s:textfield>
		<s:textfield name="password" label="%{getText('password') }"></s:textfield>
		<s:submit key="submit"></s:submit>
	</s:form>
	<s:text name="time">
		<s:param value="date"></s:param>
	</s:text>
</body>
</html>