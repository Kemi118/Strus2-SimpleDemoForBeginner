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
	
	<table cellpadding="8" cellspacing="0" border="2">
		<thead>
			<tr>
				<td>序号</td>
				<td>文件名</td>
				<td>描述</td>
				<td>大小(byte)</td>
				<td>上传日期</td>
				<td>下载</td>
			</tr>
		</thead>
		<tbody>
		<s:iterator value="fileIterms">
			<tr>
				<td>${id }</td>
				<td>${fileName }</td>
				<td>${fileDesc }</td>
				<td>${fileSize }</td>
				<td>${uploadDate }</td>
				<td><a href="dodownload?id=${id }">下载</a></td>
			</tr>
			</s:iterator>
		</tbody>
	</table>

	
</body>
</html>