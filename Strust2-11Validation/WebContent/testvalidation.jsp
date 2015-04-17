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
	验证输入年龄为 20 至 100 
	<s:form action="testvalidation">
		<s:textfield name="age" key="age"></s:textfield>
		<s:submit key="submit"></s:submit>
	</s:form>
</body>
</html>