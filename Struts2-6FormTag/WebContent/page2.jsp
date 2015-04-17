<%@page import="java.util.ArrayList"%>
<%@page import="com.luodexin.struts2.action.City"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		List<City> cities = new ArrayList();
		cities.add(new City(1001 , "shanghai"));
		cities.add(new City(1002 , "beijing"));
		cities.add(new City(1003 , "guangzhou"));
		request.setAttribute("cities", cities);
	%>
	
	<h4>checkboxlist , raido 等</h4>
	
	<br/><br/>
	<s:form>
		<s:checkboxlist name="cities" list="#request.cities" listKey="cityId" 
		listValue="cityName" label="MyFavorCities"></s:checkboxlist>
		<s:radio name="gender" list="#{'1':'Male','0':'Female' }" label="Gender"></s:radio>
		<s:submit></s:submit>
	</s:form>
	
	<s:form>
		<s:select list="{11,12,13,14,15,16,17,18,19,20}"
			headerKey="" headerValue="请选择" name="age" label="Age"></s:select>
		
	</s:form>
	
	<br/><br/>
	<s:form>
		<s:select list="{11,12,13,14,15,16,17,18,19,20}"
			headerKey="" headerValue="请选择" name="age" label="Age">
			<!-- 使用s:optgroup 作为select的子标签时必须指定 key和value 所以要用map 或者用list并指定listkey listvalue -->
			<s:optgroup label="21-30" list="#{21:21,22:22,23:23,24:25 }"></s:optgroup>	
			<s:optgroup label="31-40" list="#{31:31,32:32,33:33,34:35 }"></s:optgroup>	
		</s:select>
	</s:form>
	
</body>
</html>