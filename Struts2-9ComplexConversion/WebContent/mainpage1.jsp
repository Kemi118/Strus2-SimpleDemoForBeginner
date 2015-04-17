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
	<h4>复杂的类型转换器</h4>
	<br/><br/>
	<s:form action="inputdepartment">
		<s:textfield name="id" label="DepartmentId"></s:textfield>
		<s:textfield name="mgr.name" label="ManagerName"></s:textfield>
		<s:textfield name="mgr.birth" label="MangerBirth"></s:textfield>
		<s:submit></s:submit>
	</s:form>
	
</body>
</html>