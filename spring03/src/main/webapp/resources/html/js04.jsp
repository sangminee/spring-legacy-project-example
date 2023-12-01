<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="https://code.jquery.com/jquery-3.7.1.min.js"></script>
<script type="text/javascript">
$(document).ready(function(){
	
	var jqxhr = $.get("msg.txt", functions(data){
		$('#output').html(data);
	})
	.done(function(){
		alert("second sucess")
	})
	$("td").click(function(){
		$(this).hide();
	});	
	
	$('#mybutton').click(function(){
		$('#output').load("msg.txt");
	});
});
</script>
</head>
<body>
<table>
	<tr>
		<td>1. 클릭하면 사라집니다.</td>
	</tr>
	<tr>
		<td>2. 클릭하면 사라집니다.</td>
	</tr>
	<tr>
		<td>3. 클릭하면 사라집니다.</td>
	</tr>
</table>
<button id="mybutton" type="button">클릭</button>
<div id="output"></div>
</body>
</html>
