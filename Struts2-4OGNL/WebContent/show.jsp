<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
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

	<h4>OGNL</h4>
	<s:debug></s:debug>
	<br>
	Name:<s:property value="[0].name"/>
	<br><br>
	Age:<s:property value="#attr.person.age"/>
	<br><br>
	为对象栈属性赋值<br>
	<s:property value="setAge('21')"/>
	Age:<s:property value="#attr.person.age"/>
	<br><br><br>
	<hr>
	<br><br>
	ClassStaticFiled: <s:property value="@java.lang.Math@PI"/>
	<br><br>
	ClsaaStaticMethod: <s:property value="@java.lang.Math@cos(0)"/>
	<br><br>
	<hr>
	
	<br><br>
	<% List list = new ArrayList(); 
		list.add("aa");
		list.add("bb");
	request.setAttribute("list",list ); %>
	访问List: <s:property value="#attr.list.size"/>
	<br><br>
	IsListEmpty: <s:property value="#attr.list.isEmpty"/>
	<br><br>
	<hr>
	
	<br><br>
	<%
		Map map = new HashMap();
		map.put("aa", "AA");
		map.put("bb", "BB");
		session.setAttribute("map", map);
	%>
	访问MAP 属性：<br><br>
	Size: <s:property value="#session.map.size"/>
	<br><br>
	aa: <s:property value="#session.map['aa']"/>
	<br><br>
	bb: <s:property value="#session.map['bb']"/>
	<br><br>
	isMapEmpty: <s:property value="#session.map.isEmpty"/>
	
	
	<s:debug></s:debug>
	
	
	
	

</body>
</html>