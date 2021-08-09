<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!--  
	  param : request.getParameter("name")
		${param.name}
		
	  paramValues : request.getParameterValues("name");
	    ${paramValues.name}
	    
	    헤더정보를 받는 경우
	  header : request.getHeader('a');
	    ${header.a}
 -->
 	<form method="post" action="result.jsp">
 		<label for="id">아이디</label>
 		<input type="text" name="id" id="id"><br>
 		
 		<label for="pwd">패스워드</label>
 		<input type="text" name="pwd" id="pwd"><br>
 		
 		<label for="id">좋아하는 분식</label>
 		<input type="checkbox" name="favfood" id="f1" value="떡볶이"> <label for="f1">떡볶이</label>
 		<input type="checkbox" name="favfood" id="f2" value="쭈꾸미"> <label for="f2">쭈꾸미</label>
 		<input type="checkbox" name="favfood" id="f3" value="파니니"> <label for="f3">파니니</label>
 		<input type="checkbox" name="favfood" id="f4" value="브리또"> <label for="f4">브리또</label>
 		
 		<input type="submit" value="전송">
 		<input type="reset" value="취소">
 	</form>
 
 
</body>
</html>