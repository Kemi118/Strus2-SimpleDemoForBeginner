<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>基于字段配置的自定义类型转换器</title>
</head>
<body>
	<h4>基于字段配置的自定义类型转换器</h4>
	<br><br>
	<s:form action="convert.action">
		<s:textfield name="age" label="Age"></s:textfield>
		<s:textfield name="birth" label="Birth"></s:textfield>
		<s:submit></s:submit>
	</s:form>
	
		<br><br/>
	<p>
		自定义转换器必须实现  ongl.TypeConverter 接口  StrutsTypeConver 实现了改接口
		所以自定义接口直接继承 StrutsTypeConver 类
	</p>
	<p>
	基于字段的类型转换器配置  需要 创建一个属性文件: ModelClassName-conversion.properties, 
	该文件需和相对应的 Model 类放在同一个目录下
	
	其内容为    fieldName=userDefConvertor
	<br/><br/>
	这种转换器第一次使用时创建实例 ， 并且是单实例的
	
	
	</p>
	
</body>
</html>