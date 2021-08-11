<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script>

	$(document).ready(function(){
		$('#btn').click(function() {
			/* $.ajax({
				url:"http://localhost:9080/day10/hello"  //서블릿 hello
				, method : "post"		//post방법으로
				, success:function(data){
					console.log('성공');
					console.log(data);
				}
				, error : function(jqxhr) {
					console.log('실패');
					console.log(jqxhr);	
				}
			});  */
			 $.ajax({
				url:"http://localhost:9080/day10/hello"  //서블릿 hello
				, method : "post"
				, data : {name:'김하나',age:20}  //▶배열형식    //data: "name=hong&age=20"
				, success:function(data){
					console.log(data);
					console.log('성공');
				}
				, error : function(jqxhr) {
					console.log(jqxhr);	
					console.log('실패');
				}
				
			}); 
		});
	});
</script>
<body>
	<button id="btn">클릭</button>
	<div id="result"></div>
</body>
</html>