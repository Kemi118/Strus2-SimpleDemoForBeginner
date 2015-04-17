<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h4>注册新用户：</h4>
	<s:form action="regeist">
		<s:textfield name="userName" label="用户名:"></s:textfield>
		<s:password name="passWord" label="密码:"></s:password>
		
		<s:radio list="#{'1':'Male','0':'Female' }" name="gender" label="性别"></s:radio>
		
		<s:select name="age" list="#{'16':'16','17':'17' }" label="Age" headerKey="" headerValue="请选择">
			<s:optgroup list="#{'18':'18','19':'19','20':'20' }" label="<20"></s:optgroup>
			<s:optgroup list="#{'21':'21','22':'22','23':'23' }" label="<30"></s:optgroup>
		</s:select>
		
		<s:checkboxlist list="#{'1':'上海','2':'北京','3':'广州','4':'武汉' }"
			name="cities" label="工作地"></s:checkboxlist>
		
		<s:textarea name="history" label="背景"></s:textarea>
		
		<s:checkbox name="agreed" label="同意用户协议" ></s:checkbox>
		
		<s:submit></s:submit>
	
	</s:form>
	<s:debug></s:debug>
</body>
</html>