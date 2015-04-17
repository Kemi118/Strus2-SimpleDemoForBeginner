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
	<h4>文件上传</h4>
	<s:debug></s:debug>
	<s:form action="uploadfiles" enctype="multipart/form-data" 
	method="post" theme="simple">
		<s:actionerror/>
		<s:fielderror></s:fielderror>
		文件：<s:file name="file" label="文件"></s:file><br/>
		文件描述:<s:textfield name="fileDesc[0]" label="文件描述"></s:textfield>
		<br/><br/>
		文件：<s:file name="file" label="文件"></s:file><br/>
		文件描述:<s:textfield name="fileDesc[1]" label="文件描述"></s:textfield>
		<br/><br/>
	
		文件：<s:file name="file" label="文件"></s:file><br/>
		文件描述:<s:textfield name="fileDesc[2]" label="文件描述"></s:textfield>
		<br/><br/>
	
		<s:submit></s:submit>
	</s:form>
</body>
</html>