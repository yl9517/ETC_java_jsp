<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="post" action="insertresult.jsp">
		<label for="title">글제목</label>
		<input type="text" name="title" id="title"> <br>
		<label for="content">글내용</label> <br>
		<textarea id="content" name="content" rows="5" cols="60"></textarea> <br>
		<label for="writer">작성자</label>
		<input type="text" name="writer" id="writer"> <br>
		
		<input type="submit" value="글쓰기">
		<input type="reset" value="취소">
	</form>

</body>
</html>