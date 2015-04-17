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
	
	<s:form action="add.action">
		<s:textfield name="firstName" label="FirstName"></s:textfield>
		<s:textfield name="lastName" label="LastName"></s:textfield>
		<s:textfield name="email" label="Email"></s:textfield>
		<s:submit></s:submit>
	</s:form>
	
	<br/><br/><hr/><br/><br/>

	<table border="1.0" cellpadding="6.0" cellspacing="0">
		<thead>
			<tr>
				<td>EmployeeId</td>
				<td>FirstName</td>
				<td>LastName</td>
				<td>Email</td>
				<td>Edit</td>
				<td>Delete</td>
			</tr>
		</thead>
		<tbody>
			<s:iterator value="#request.employees">
			<tr>
				<td>${employeeId }</td>
				<td>${firstName }</td>
				<td>${lastName }</td>
				<td>${email }</td>
				<td><a href="edit.action?employeeId=${employeeId }">Edit</a></td>
				<td><a href="delete.action?employeeId=${employeeId }">Delete</a></td>
			</tr>
			</s:iterator>
		</tbody>
	</table>
	<br/>
	<br/>
	<br/>
	<br/>
	<br/>
	<br/>
</body>
</html>