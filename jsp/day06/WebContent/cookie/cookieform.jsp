<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="post" action="cookieresult.jsp">
		<label for="id">아이디</label>
		<input type="text" name="id" id="id" required="required">	<br>
		<label for="pwd">패스워드</label>
		<input type="text" name="pwd" id="pwd" required="required"> <br>
		
		<input type="submit" value="로그인">
		<input type="reset" value="취소">
		
	</form>
</body>
</html>