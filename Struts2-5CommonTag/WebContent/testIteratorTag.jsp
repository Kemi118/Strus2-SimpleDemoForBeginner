<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="com.luodexin.bean.Person"%>
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
	<h4>Test iterator Tag</h4>
	iterator 标签用来遍历一个数组, Collection 或一个 Map, 并把这个可遍历对象里的每一个元素依次压入和弹出 
<%
	List<Person> persons = new ArrayList<Person>();
	persons.add(new Person("aa" , 7));
	persons.add(new Person("bb" , 8));
	persons.add(new Person("cc" , 9));
	persons.add(new Person("dd" , 10));
	persons.add(new Person("ee" , 11));
	request.setAttribute("persons", persons);
%>
	<br><br>
	<s:iterator value="#request.persons">
		${name } -- ${age }<br>
	</s:iterator>
	<br><br>
	
	<s:iterator value="#request.persons" var="currentPerson" status="status">
		${currentPerson.name } -- ${currentPerson.age } --- index:${status.index }--count:${status.count }<br>
	</s:iterator>
	
	<br><br> <!-- 遍历对象栈的栈顶元素 的 personList -->
	<s:iterator value="[0].personList">
		${name }--${age } <br>
	</s:iterator>
	<br><br>
	
<%	Map<String , Object> map = new HashMap();
	map.put("key1", "value1");
	map.put("key2", "value2");
	map.put("key3", "value3");
	map.put("key4", "value4");
	map.put("key5", "value5");
	request.setAttribute("map", map);
%>	
	遍历Map 共<s:property value="#request.map.size"/>条记录
	<br>
	<s:iterator value="#request.map" id="column">
		${column.key } -- ${column.value }<br>
	</s:iterator>
	
	
	
</body>
</html>