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
	<h4>包范围资源文件国际化</h4>
	<s:form action="testi18n">
		<s:textfield name="username" label="UsrName"></s:textfield>
		<s:textfield name="username" key="username"></s:textfield>
		<s:textfield name="password" key="password"></s:textfield>
		<s:submit key="submit"></s:submit>
	</s:form>
</body>
</html>