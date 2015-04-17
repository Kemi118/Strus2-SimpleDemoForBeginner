<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<script type="text/javascript" src="scripts/jquery-1.7.2.js"></script>
<script type="text/javascript" src="scripts/uploadPage.js"></script>
<body>
	<h4>上传文件</h4>
	
	<s:debug></s:debug>
	<s:form action="uploadfiles" enctype="multipart/form-data"
		method="post" theme="simple">
		<s:actionerror />
		<s:fielderror></s:fielderror>
		
		<table>
			<tr>
				<td>选择文件：</td>
				<td><s:file name="file" ></s:file></td>
				<td><input id="delete" type="button" value="删除"/></td>
			</tr>
			<tr>
				<td>文件描述:</td>
				<td colspan="2"><s:textfield name="fileDesc[0]" ></s:textfield></td>
			</tr>
			
		
			<tr>
				<td><input id="add" type="button" value="增加新文件" /></td>
				<td><s:submit label="上传"></s:submit></td>
			</tr>
		</table>
	</s:form>
</body>
</html>