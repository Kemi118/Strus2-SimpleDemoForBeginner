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
	<h4>测试  XxxAware 接口</h4>
	<br>
	appKey: ${applicationScope.applicationKey2}
	<br>
	<br>
	sessionKey: ${sessionScope.sessionKey2}
	<br>
	<br>
	requestKey: ${requestScope.requestKey2}
	<br>
	<br>
	parameter-name：${parameters.name[0] }
	<br>
	<br>
	parameter-age：${parameters.age[0] }
	<br>
	<br>
	
</body>
</html>