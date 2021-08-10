<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script>
	$(document).ready(function(){
		$('#btn').click(function(){
			$.ajax({
				url:"http://localhost:8080/day10/list.do"
				, dataType : 'json'
				, success : function(data){
					consolo.log(data);
				}
				, error : function(xhr) {
					consolo.log('error');
				}
			});
		});
	});
</script>
</head>
<body>
	<button id="btn">여기를 클릭하세요</button>
	<table id="result"></table>
</body>
</html>