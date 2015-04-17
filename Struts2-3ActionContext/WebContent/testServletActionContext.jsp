<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<br>
	<h4>测试 ServletActionContext 类获取 WEB 资源</h4>
	<br>
	appKey: ${applicationScope.contextKey}
	<br>
	<br>
	sessionKey: ${sessionScope.sessionKey}
	<br>
	<br>
	requestKey: ${requestScope.requestKey}
	<br>
	<br>
	parameter：${parameters.name[0] }
	
</body>
</html>