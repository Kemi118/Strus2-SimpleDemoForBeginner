<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>基于类型配置的自定义类型转换器</title>
</head>
<body>
	<h4>基于类型配置的自定义类型转换器</h4>
	<br><br>
	<s:form action="convert.action">
		<s:textfield name="age" label="Age"></s:textfield>
		<s:textfield name="birth" label="Birth"></s:textfield>
		<s:fielderror fieldName="birth"></s:fielderror>
		<s:submit></s:submit>
	</s:form>
	
		<br><br/>
	<p>
		自定义转换器必须实现  ongl.TypeConverter 接口  StrutsTypeConver 实现了改接口
		所以自定义接口直接继承 StrutsTypeConver 类
	</p>
	<p>
	基于类型配置 需要在 WEB-INF/classes/ (即放在 src 目录下)目录下创建 xwork-conversion.properties 文件
	在 xwork-conversion.properties 文件里把每一个需要进行类型转换的类与一个类型转换器关联起来
	
	其内容为   类型=转化器全类名
	<br/><br/>
	在应用加载时创建转换器实例，并不是单实例
	
	
	</p>
	
</body>
</html>