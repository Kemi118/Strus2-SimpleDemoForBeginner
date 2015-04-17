<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<script type="text/javascript" src="scripts/jquery-1.7.2.js"></script>
<script type="text/javascript">
	$(function(){
		
		var count = 0;
		$("#add_btn").click(function(){
			count++;
			$("#add_btn").parent().parent().before("<tr><td>Mgrs[" + count + "].Name:</td><td><input name='mgrs[" + count + "].name'/></td></tr>")
            .before("<tr><td>Mgrs[" + count + "].Birth:</td><td><input name='mgrs[" + count + "].birth'/></td></tr>");
			return false;
		});
		
		$("#delete_btn").click(function(){
			count--;
			$("#delete_btn").parent().parent().prev("tr").remove();
			$("#delete_btn").parent().parent().prev("tr").remove();
			return false;
		});
		
	});

</script>
<body>
	<br><br>
	<h4>类型转换器与集合配合使用</h4>
	<form action="connectionDepartment">
		<table id="departmentTable">
			<tr>
				<td>Mgrs[0].Name</td>
				<td><input type="text" name="mgrs[0].name"/></td>
			</tr>
			<tr>
				<td>Mgrs[0].Birth</td>
				<td><input type="text" name="mgrs[0].birth"/></td>
			</tr>
			<tr>
				<td><input id="add_btn" type="button" value="增加"/></td>
				<td><input id="delete_btn" type="button" value="删除"/></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="提交"/></td>
			</tr>
		</table>
	</form>
</body>
</html>