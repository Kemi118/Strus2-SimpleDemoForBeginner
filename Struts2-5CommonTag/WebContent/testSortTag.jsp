<%@page import="java.util.Date"%>
<%@page import="com.luodexin.bean.PersonComparator"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.luodexin.bean.Person"%>
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
	<h4>Test Sort Tag</h4>
<%
	List<Person> persons = new ArrayList<Person>();
	persons.add(new Person("cc" , 9));
	persons.add(new Person("ee" , 11));
	persons.add(new Person("dd" , 10));
	persons.add(new Person("aa" , 7));
	persons.add(new Person("bb" , 8));
	request.setAttribute("persons", persons);
	
	PersonComparator pc = new PersonComparator();
	request.setAttribute("comparator", pc);
%>	

	<s:sort comparator="#request.comparator" source="#request.persons" var="persons2">
		<s:iterator value="#attr.persons2">
			${name } -- ${age } <br>
		</s:iterator>
	</s:sort>
	
	<br><br><br><hr><br>
	date标签排版:
	<br>
	<%
		Date date = new Date();
		request.setAttribute("date", date);
	%>
	<s:date name="#request.date" format="yyyy-MM-dd  hh:mm:ss" var="date2"/>
	${date2 }
	
	<br><br><br><hr><br>
	a 标签构建超链接
	<br>
	<s:iterator value="#request.persons">
		<!-- 使用 %{} 进行强制 OGNL 解析 -->
		<s:a href="getPerson?name=%{name}">${name }</s:a><br>
	</s:iterator>
	
	
	
	
</body>
</html>