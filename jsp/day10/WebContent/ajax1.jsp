<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script>
	$(document).ready(function(){  //비동기 처리
		$('#btn').click(function(){
			$.ajax({
				url:"list.jsp"  //list.jsp에 데이터 요청
				, dataType :"html"  //list.jsp로부터 받을 데이터의 타입
				, success :function(data) { //요청 성공 시-응답받기
					console.log('성공!');
					//console.log(data);
					$('#result').html(data); //result에 html 설정
				}
				, error :function(jqxhr){
					console.log('실패!');
					console.log(jqxhr);
				}
			});
		});
	});
</script>
</head>
<body>
	<button id="btn">클릭</button>
	<div id="result"></div>
</body>
</html>