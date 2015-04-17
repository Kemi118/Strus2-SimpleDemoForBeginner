$(function(){
	var count = 0;
	$("#add").click(function(){
		count++;
		$("#add").parent().parent().before("<tr><td>选择文件：</td>" +
				"<td><input type='file' name='file' value='' id='uploadfiles_file'/></td>"+
				"<td><input id='delete_"+count+"' type='button' value='删除'/></td></tr>");
		
		$("#add").parent().parent().before("<tr><td>文件描述:</td>" +
				"<td colspan='2'><input type='text' name='fileDesc["+count+"]' value='' id='uploadfiles_fileDesc_"+count+"_'/></td></tr>");
		
		$("#delete_"+count).click(function(){
			$(this).parent().parent().next().remove();
			$(this).parent().parent().remove();
			
		});
		
	});

});