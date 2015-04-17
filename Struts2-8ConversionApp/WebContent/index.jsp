<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>转换错误处理</title>
</head>
<body>
	<br/><br/><br/>
	<!-- 使用struts 默认主题自动显示转换错误   -->
	<!-- 在Action所对应的包下 建 ActionClassName.properties 
			写invalid.fieldvalue.fieldName=XXXX 修改默认转换错误提示格式 -->
	<!--  
		<s:form action="conversion">
			<s:textfield name="age" label="Age"></s:textfield>
			<s:submit></s:submit>
		</s:form>
		<br/><br/><br/>
	-->
	 
	<s:debug></s:debug>
	<s:form action="conversion" theme="simple">
		Age:<s:textfield name="age" label="Age"></s:textfield>
		${fieldErrors.age[0] }
		^-^ <s:fielderror fieldName="age"></s:fielderror>
		<!-- 使用 s:fielderror 显示转换错误默认带有 ul li span 标签  -->
		<!-- 可以在本地新建 template.simple 包 重写 fielderror.ftl文件 修改模板 -->
		
		<br/><br/>
		<s:submit></s:submit>
	</s:form>
	
</body>
</html>