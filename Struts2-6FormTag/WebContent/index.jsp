<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<h4>Struts2 表单标签能够进行回显  自动回显值栈栈顶的属性    并对表单进行自动排版</h4>
		<s:form action="save" >
			<s:textfield name="userName" label="UserName"></s:textfield>		
			<s:password name="passWord" label="PassWord"></s:password>
			<s:textarea name="desc" label="Desc"></s:textarea>
			<s:submit ></s:submit>
			
		</s:form>
		
		<h4>Stuts2 的 checkbox</h4>
		<s:form action="save" >
			<s:checkbox name="agreed" label="Agreed"></s:checkbox>
			<s:submit label="aaa"></s:submit>
		</s:form>
	
		<br/><br/><br/>
		<a href="page2.jsp">checkboxlist , radio , </a>
	
</body>
</html>