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
	<s:debug></s:debug>
	<s:actionerror/>
	<s:form action="testPassWord">
		<s:password name="password" key="password_text"></s:password>
		<s:password name="password2" key="password_text"></s:password>
		<s:submit key="submit"></s:submit>
	</s:form>

</body>
</html>