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
	<s:form action="testvalidation" theme="simple">
		<s:text name="age"></s:text>
		<s:textfield name="age" key="age"></s:textfield>
		<s:fielderror fieldName="age"></s:fielderror>
		<br/><br/>
		<s:text name="count"></s:text>
		<s:textfield name="count" key="count"></s:textfield>
		<s:fielderror fieldName="count"></s:fielderror>
		<s:submit key="submit"></s:submit>
	</s:form>

</body>
</html>