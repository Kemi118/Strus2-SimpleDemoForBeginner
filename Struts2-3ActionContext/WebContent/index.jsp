<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h4>测试 Struts2 获取 WEB 资源</h4>
	<br>
	非耦合方法    能域对象属性及请求参数
	<br><br>
	<a href="testActionContext.action?name=luodexin">Test ActionContext</a>
	<br><br>
	<a href="testXxxAware.action?name=luodexin">Test XxxAware</a>
	<br><br>
	耦合方法    能够获取 servlet 原生 API
	<br><br>
	<a href="TestServletActionContext.action?name=luodexin">Test ServletActionContext</a>
	<br><br>
	<a href="TestServletXxxAware.action?name=luodexin">Test TestServletXxxAware</a>
	<br><br>
</body>
</html>