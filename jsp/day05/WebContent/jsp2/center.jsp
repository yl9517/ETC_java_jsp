<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h4>회원정보 변경</h4>
	<form method="post" action="result.jsp">
		<label for="name">이름</label>
		<input type="text" name="name" id="name"> <br>
		<label for="juso">주소</label>
		<input type="text" name="juso" id="juso"> <br>
		
		<input type="submit" value="전송">
		<input type="reset" value="취소">
	</form>
</body>
</html>